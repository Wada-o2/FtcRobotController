package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.MechanumDrive;
@TeleOp
public class MechanumFieldOrientatedOpMode extends OpMode
{
    MechanumDrive drive = new MechanumDrive();

    // shooter toggle state
    boolean shooterOn = false;
    boolean wheelOn = false;
    boolean shooterOn1 = false;
    boolean shooterOn2 = false;
    boolean lastRightBumper = false;
    boolean lastLeftBumper = false;
    double forward, strafe, rotate;

    @Override
    public void init() {
        drive.init(hardwareMap);
    }

    @Override
    public void loop() {
        forward = gamepad1.left_stick_y;
        strafe = -gamepad1.left_stick_x;
        rotate = -gamepad1.right_stick_x;

        drive.drive(forward, strafe, rotate);

        // Shooter toggle logic: when right bumpr is pressed (on edge), toggles the shooter on/ofg
        boolean currentRightBumper = gamepad2.right_bumper;
        boolean currentLeftBumper = gamepad2.left_bumper;


        if(currentRightBumper && !lastRightBumper)
        {
            shooterOn = !shooterOn;
        }
        currentRightBumper = lastRightBumper;
        if (shooterOn)
        {
            drive.setHexPower(0.55);
        }
        else
        {
            drive.setHexPower(0.0);
        }

        if(currentLeftBumper && !lastLeftBumper)
        {
            shooterOn1 = !shooterOn1;
        }
        currentLeftBumper = lastLeftBumper;
        if (shooterOn1)
        {
            drive.setShooterPower(0.7);
        }
        else
        {
            drive.setShooterPower(0.0);
        }
    }}
