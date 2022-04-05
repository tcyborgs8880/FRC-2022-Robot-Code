// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

/*

  Date: 1/5/22
  Name: Faaiz
  Task Done: Updated Dropper Code

*/

package frc.robot.subsystems;

import com.revrobotics.*;
import com.revrobotics.CANSparkMax.ControlType;
import com.revrobotics.CANSparkMax.IdleMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Dropper extends SubsystemBase {
    private static Dropper instance = null;

    //Creates CANSparkMax vairable
    public static CANSparkMax dropperMotor;
     
    //Creates Elevator Object instance
    public static Dropper getInstance(){
        if (instance == null){
            System.out.println("Dropper init");
            instance = new Dropper();
        }
        return instance;
    } 
    public Dropper () {
        //Uses constructor from SubsystemBase
        super();
        
        //Elevator Motor
        dropperMotor = new CANSparkMax(Constants.dropperSpark, CANSparkMaxLowLevel.MotorType.kBrushless); 
    }

    //method to lift
    public void drop(double armVolts) {
        dropperMotor.setVoltage(armVolts * 12);
        // dropperMotor.getPIDController().setReference(speedUp, ControlType.kVelocity, 0);
    }
    public void stop(){
        dropperMotor.stopMotor();
    }
    //Runs the drop intake motor    

}
