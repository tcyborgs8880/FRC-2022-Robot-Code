// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.revrobotics.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {

  private static Shooter instance = null;

  public static CANSparkMax shooterMotor;

  public static Shooter getInstance(){
    if (instance == null){
      System.out.println("Shooter init");
      instance = new Shooter();
    }
    return instance;
  }

  /** Creates a new ExampleSubsystem. */
  public Shooter() {
    super();

    shooterMotor = new CANSparkMax(Constants.shooterSpark, CANSparkMaxLowLevel.MotorType.kBrushless);

  }

  public void shoot(double shooterVolts){
    shooterMotor.setVoltage(shooterVolts * 12);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
