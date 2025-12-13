package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.Mechanism.MechanumDrive;
public class auto {

    @TeleOp
    public class MechanumFieldOrientatedOpMode extends OpMode {
        MechanumDrive drive = new MechanumDrive();
        double forward, strafe, rotate;

        @Override
        public void init() {
            drive.init(hardwareMap);
        }

        @Override
        public void loop() {
            forward = 0.2;
            strafe = 0;
            rotate = 0;
            drive.drive(forward, strafe, rotate);
        }
    }