
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
 
package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj2.command.CommandBase;


/** An example command that uses an example subsystem. */
public class IntakeCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  //private final Intake drivetrain;

  private boolean toggle;
  private boolean on;
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public IntakeCommand() {
    super();
    // Use addRequirements() here to declare subsystem dependencies.
    
    addRequirements(Robot.Intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    toggle = true;
      on = false;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    //boolean dropper = Robot.driver.getXButton();
    boolean intake = Robot.driver.getBButton();
    
    
    //if (intake) {
    //  on = !on;
    
    

    //Turns on intake motors if B button pressed
    if (toggle && intake){
      toggle = false;
      if(on){
        on = false;
        Robot.Intake.intakeMotors(0.3);
        } 
      else {
       on =  true;
       Robot.Intake.intakeMotors(0);
      }
    }
    else if(intake && !toggle){
      toggle = true;
    }
    System.out.println("Intake ON: " + on);
    
    /*
    if (dropper){
      Robot.Intake.drop(0.3);
    }
    else { 
      Robot.Intake.drop(0);
    }
    */
    
   

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
