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

public class Elevator extends SubsystemBase {
    private static Elevator instance = null;

    //Creates CANSparkMax vairable
    public static CANSparkMax elevatorMotor;
     
    //Creates Elevator Object instance
    public static Elevator getInstance(){
        if (instance == null){
            System.out.println("Elevator init");
            instance = new Elevator();
        }
        return instance;
    } 
    public Elevator () {
        //Uses constructor from SubsystemBase
        super();
        
        //Elevator Motor
        elevatorMotor = new CANSparkMax(Constants.elevatorSpark, CANSparkMaxLowLevel.MotorType.kBrushed);
        

    }

    //method to lift
    public void lift(double liftVolts) {
        elevatorMotor.setVoltage(liftVolts*12);
    }

}
