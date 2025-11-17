package org.firstinspires.ftc.teamcode;
import android.util.Size;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.vision.VisionPortal;

public class WebcamTest extends LinearOpMode
{
   private VisionPortal visionportal;
   private Telemetry telemetry;
   public void init(HardwareMap haMap, Telemetry telemetry){
       this.telemetry = telemetry;
       VisionPortal.Builder builder = new VisionPortal.Builder();
       builder.setCamera(haMap.get(WebcamName.class, "Webcam"));
       builder.setCameraResolution(new Size(640,480));
       visionportal = builder.build();
   }
   //public void stop() {
   //    if (visionportal != null) {
   //        visionportal.close();
   //    }
   //}
}
