package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "New Chassis TeleOp", group = "TeleOp")
public class BaseTeleOp extends OpMode {

    DcMotor fr, br, fl, bl;

    //     @Override
    public void init()
    {
        fr = hardwareMap.dcMotor.get("fr");
        br = hardwareMap.dcMotor.get("br");
        fl = hardwareMap.dcMotor.get("fl");
        bl = hardwareMap.dcMotor.get("bl");
        
        fr.setDirection(DcMotor.Direction.REVERSE);
        br.setDirection(DcMotor.Direction.REVERSE);
    }

    public void loop() {
      fr.setPower(gamepad1.right_stick_y);
      br.setPower(gamepad1.right_stick_y);
      fl.setPower(gamepad1.left_stick_y);
      bl.setPower(gamepad1.left_stick_y);
    }
    
    public void stop() {
        rightFront.setPower(0);
        leftFront.setPower(0);
        leftBack.setPower(0);
        rightBack.setPower(0);
        lift.setPower(0);

    }
}
