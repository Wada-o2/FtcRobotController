package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.MechanumDrive;
@TeleOp
public class MechanumFieldOrientatedOpMode extends OpMode {
    MechanumDrive drive = new MechanumDrive();
    @Override
    public void init() {drive.init(hardwareMap);}
    @Override
    public void loop() {
        drive.drive(gamepad1.left_stick_y,-gamepad1.left_stick_x,-gamepad1.right_stick_x);
        if (gamepad2.right_bumper) {drive.setShooterPower(0.7);} else {drive.setShooterPower(0);}
        if (gamepad2.left_bumper) {drive.setHexPower(0.55);} else {drive.setHexPower(0);}
    }}