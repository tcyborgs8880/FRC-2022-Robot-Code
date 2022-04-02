// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

/*

  Date: 3/22/22
  Name: Faaiz, Sidrah
  Task Done: Created class, created execute method

*/

package frc.robot.commands;

import frc.robot.Robot;
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
    on = false;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    //boolean dropper = Robot.driver.getXButton();
    boolean intake = Robot.driver.getBButton();
    toggle = true;

    //Turns on intake motors if B button pressed
    if (toggle && intake){
      toggle = false;
      if(on){
        Robot.Intake.intakeMotors(0.5);
        on = false;
        } 
      else {
       Robot.Intake.intakeMotors(0);
       on =  true;
      }
    }
    else if(intake && !toggle){
      toggle = true;
    }
    System.out.println("Intake ON: " + on);
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
