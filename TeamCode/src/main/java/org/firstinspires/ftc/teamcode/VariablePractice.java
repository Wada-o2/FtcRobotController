package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode
{
    @Override
    public void init()
    {
        int teamNumber = 79583;
        double motorSpeed = 8972656295.27;
        boolean clawClosed = false;

        telemetry.addData("team number", teamNumber);
        telemetry.addData("motor speed", motorSpeed);
        telemetry.addData("claw closed", clawClosed);
    }

    @Override
    public void loop()
    {

    }
}
