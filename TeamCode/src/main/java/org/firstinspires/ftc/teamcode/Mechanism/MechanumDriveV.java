//package org.firstinspires.ftc.teamcode.Mechanism;
//
//import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
//import com.qualcomm.robotcore.hardware.CRServo;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorSimple;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//import com.qualcomm.robotcore.hardware.IMU;
//import com.qualcomm.robotcore.hardware.Servo;
//
//import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
//
//public class MechanumDriveV
//{
//    private DcMotor frontLeftMotor, backLeftMotor, frontRightMotor, backRightMotor, kevind, curry;
//    private IMU imu;
//
//    // Shooter velocity target (ticks per second)
//    private double shooterTargetVelocity = 0.0;
//
//    // Encoder ticks per revolution (28 for REV HD motors)
//    private static final double TICKS_PER_REV = 28.0;
//
//    public void init(HardwareMap hwMap)
//    {
//        frontLeftMotor = hwMap.get(DcMotor.class, "frontLeftDrive");
//        backLeftMotor = hwMap.get(DcMotor.class, "backLeftDrive");
//        frontRightMotor = hwMap.get(DcMotor.class, "frontRightDrive");
//        backRightMotor = hwMap.get(DcMotor.class, "backRightDrive");
//        kevind = hwMap.get(DcMotor.class, "kevind");
//        curry= hwMap.get(DcMotor.class, "curry");
//
//        kevind.setDirection(DcMotor.Direction.REVERSE);
//        frontLeftMotor.setDirection(DcMotor.Direction.REVERSE);
//        backLeftMotor.setDirection(DcMotor.Direction.REVERSE);
//        curry.setDirection(DcMotor.Direction.REVERSE);
//
//        frontLeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        backLeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        frontRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        backRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//
//        // --- Configure shooter for velocity control
//        kevind.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//
//        imu = hwMap.get(IMU.class, "imu");
//
//        RevHubOrientationOnRobot RevOrientation = new RevHubOrientationOnRobot
//                (
//                        RevHubOrientationOnRobot.LogoFacingDirection.LEFT,
//                        RevHubOrientationOnRobot.UsbFacingDirection.FORWARD
//                );
//        imu.initialize(new IMU.Parameters(RevOrientation));
//    }
//
//    public void drive(double forward,double strafe, double rotate)
//    {
//        double frontLeftPower = forward + strafe + rotate;
//        double backLeftPower = forward - strafe + rotate;
//        double frontRightPower = forward - strafe - rotate;
//        double backRightPower = forward + strafe - rotate;
//
//        double maxPower = 1.0;
//        double maxSpeed = 1.0;
//
//        maxPower = Math.max(maxPower, Math.abs(frontLeftPower));
//        maxPower = Math.max(maxPower, Math.abs(backLeftPower));
//        maxPower = Math.max(maxPower, Math.abs(frontRightPower));
//        maxPower = Math.max(maxPower, Math.abs(backRightPower));
//
//        frontLeftMotor.setPower(maxSpeed * (frontLeftPower/maxPower));
//        backLeftMotor.setPower(maxSpeed * (backLeftPower/maxPower));
//        frontRightMotor.setPower(maxSpeed * (frontRightPower/maxPower));
//        backRightMotor.setPower(maxSpeed * (backRightPower/maxPower));
//    }
//
//    public void driveFieldRelative(double forward, double strafe, double rotate)
//    {
//        double theta = Math.atan2(forward, strafe);
//        double r = Math.hypot(strafe, forward);
//
//        theta = AngleUnit.normalizeRadians(theta - imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.RADIANS));
//
//        double newForward = r * Math.sin(theta);
//        double newStrafe = r * Math.cos(theta);
//
//        this.drive(newForward, newStrafe, rotate);
//    }
//
//    // Shooter control (velocity mode)
//
//    /**
//     * Sets shooter speed in percent of target (0.0–1.0)
//     * then converts to ticks/sec velocity.
//     */
//    public void setShooterPower(double power1) {
//        // Convert percent power into a velocity
//        shooterTargetVelocity = power1 * getMaxShooterVelocity();
//        kevind.setVelocity(shooterTargetVelocity);
//    }
//
//    /**
//     * Stops the shooter
//     */
//    public void stopShooter() {
//        shooterTargetVelocity = 0.0;
//        kevind.setVelocity(0.0);
//    }
//
//    /**
//     * Returns the motor object for direct velocity control
//     */
//    public DcMotor getShooterMotor() {
//        return kevind;
//    }
//
//    /**
//     * Returns a rough maximum shooter velocity in ticks/sec
//     * Change this value if you’ve measured actual max RPM.
//     */
//    public double getMaxShooterVelocity() {
//        // Example max ~ 1650 RPM → ticks/sec = (1650 × 28) / 60
//        return (1650.0 * TICKS_PER_REV) / 60.0;
//    }
//
//    public void setHexPower(double power2) {
//        curry.setPower(power2);
//    }
//}


