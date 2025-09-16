package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class HelloWorld extends OpMode
{
    @Override
    public void init()
    {
        telemetry.addData("Hello", "World");
        telemetry.addData("Aidan", "has created me.");
        telemetry.addData("He", "feels proud of himself for this.");
        telemetry.addData("But", "it's not difficult.");
        telemetry.addData("And", "he needed a tutorial to do it.");
        telemetry.addData("What", "a loser.");

    }

    @Override
    public void loop()
    {

    }
}
