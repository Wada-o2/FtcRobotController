///ackage org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//import org.firstinspires.ftc.teamcode.Mechanism.MechanumDrive;
//import org.firstinspires.ftc.teamcode.Mechanism.MechanumDriveV;
//
//@TeleOp
//public class VelocityTest extends OpMode
//{
//    MechanumDriveV drive = new MechanumDriveV();
//
//    // shooter toggle state
//    boolean shooterOn = false;
//    boolean wheelOn = false;
//    boolean shooterOn1 = false;
//    boolean shooterOn2 = false;
//    boolean lastRightBumper = false;
//    boolean lastLeftBumper = false;
//    double forward, strafe, rotate;
//
//    // --- VELOCITY CONSTANT (set this to match your “good shot”)
//    // Example: 700 ticks/sec (~1500 RPM with 28 TICKS_PER_REV)
//    double TARGET_SHOOTER_VELO = 700.0;
//
//    @Override
//    public void init() {
//        drive.init(hardwareMap);
//
//        // make sure shooter motor uses encoder for velocity control
//        drive.getShooterMotor().setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//    }
//
//    @Override
//    public void loop() {
//        forward = gamepad1.left_stick_y;
//        strafe = -gamepad1.left_stick_x;
//        rotate = -gamepad1.right_stick_x;
//
//        drive.drive(forward, strafe, rotate);
//
//        // Shooter toggle logic: when right bumper is pressed (on edge), toggles the shooter on/off
//        boolean currentRightBumper = gamepad2.right_bumper;
//        boolean currentLeftBumper = gamepad2.left_bumper;
//
//        if(currentRightBumper && !lastRightBumper)
//        {
//            shooterOn = !shooterOn;
//        }
//        lastRightBumper = currentRightBumper;
//
//        if (shooterOn)
//        {
//            drive.setHexPower(0.4);
//        }
//        else
//        {
//            drive.setHexPower(0.0);
//        }
//
//        if(currentLeftBumper && !lastLeftBumper)
//        {
//            shooterOn1 = !shooterOn1;
//        }
//        lastLeftBumper = currentLeftBumper;
//
//        if (shooterOn1)
//        {
//            // ** VELOCITY CONTROL HERE **
//            drive.getShooterMotor().setVelocity(TARGET_SHOOTER_VELO);
//        }
//        else
//        {
//            drive.getShooterMotor().setVelocity(0.0);
//        }
//    }
//}
