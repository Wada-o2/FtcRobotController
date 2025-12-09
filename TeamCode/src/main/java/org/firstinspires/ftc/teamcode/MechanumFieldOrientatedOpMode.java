package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanism.MechanumDrive;

@TeleOp
public class MechanumFieldOrientatedOpMode extends OpMode
{
    MechanumDrive drive = new MechanumDrive();

    // shooter toggle state
    boolean shooterOn = false;
    boolean lastRightBumper = false;

    double forward, strafe, rotate;

    @Override
    public void init() {drive.init(hardwareMap);}

    @Override
    public void loop()
    {
        forward = gamepad1.left_stick_y;
        strafe = gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;

        drive.driveFieldRelative(forward, strafe, rotate);

        // Shooter toggle logic: when right bumpr is pressed (on edge), toggles the shooter on/ofg
        boolean currentRightBumper = gamepad1.right_bumper;
        if (currentRightBumper && !lastRightBumper) {
            shooterOn = !shooterOn;
        }
        lastRightBumper = currentRightBumper;

        if (shooterOn) {
            drive.setShooterPower(0.75);  // shooter motor ON

            drive.setHexPower(0.4);

            drive.setBronny(1);
        } else {
            drive.setShooterPower(0.0);  // shooter motor OFF

            drive.setHexPower(0.0);

            drive.setBronny(0.0);

        }
    }
}
