// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

/*

  Date: 3/22/22
  Name: Faaiz
  Task Done: Created class

*/

package frc.robot.subsystems;

import com.revrobotics.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {

    private static Intake instance = null;

    public static CANSparkMax frontIntakeMotor;
    public static CANSparkMax backIntakeMotor;
    public static CANSparkMax sideIntakeMotor;

    public static Intake getInstance(){

        if (instance == null){

            System.out.println("Intake init");
            instance = new Intake ();
        }
        return instance;
    }

    public Intake(){
        super();

        frontIntakeMotor = new CANSparkMax(Constants.frontIntakeSpark, CANSparkMaxLowLevel.MotorType.kBrushless);
        backIntakeMotor = new CANSparkMax(Constants.backIntakeSpark, CANSparkMaxLowLevel.MotorType.kBrushless);
        sideIntakeMotor = new CANSparkMax(Constants.sideIntakeSpark, CANSparkMaxLowLevel.MotorType.kBrushless);
        sideIntakeMotor.setInverted(true);
        backIntakeMotor.setInverted(true);
    }

    //Sets all intake motors to the same speed
    public void intakeMotors(double intakeVoltage){
        frontIntakeMotor.setVoltage(intakeVoltage * 8);
        backIntakeMotor.setVoltage(intakeVoltage * 12);
        sideIntakeMotor.setVoltage(intakeVoltage * 8);
    }
    
}
