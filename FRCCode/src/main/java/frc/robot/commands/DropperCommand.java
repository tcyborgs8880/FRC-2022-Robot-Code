// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

/*

  Date: 4/1/22
  Name: Faaiz
  Task Done: fixed dropper code
*/

package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.Constants;
//import frc.robot.subsystems.Elevator;
//import frc.robot.subsystems.*;
//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class DropperCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  //private final Timer timer;
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public DropperCommand() {
    super();
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.Dropper);
    //timer = new Timer();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    boolean LBPressed = Robot.driver.getLeftBumper();
    boolean RBPressed = Robot.driver.getRightBumper();

    if (LBPressed){
      Robot.Dropper.drop(0.2); //drop down
    }
    else if (RBPressed){
      Robot.Dropper.drop(-0.2); //bring up
    }
    else
      Robot.Dropper.drop(0);
    
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
