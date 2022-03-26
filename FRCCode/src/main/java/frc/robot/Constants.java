// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

/*

  Date: 3/22/22
  Name: Faaiz
  Task Done: Added constants

*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    
  
    
  //Spark ID's
    final public static int backRightSpark = 1;
    final public static int frontRightSpark = 2;
    final public static int frontLeftSpark = 3;
    final public static int backLeftSpark = 4;
    
    final public static int elevatorSpark = 5;
    
    final public static int frontIntakeSpark = 6;
    final public static int backIntakeSpark = 7;
    
    final public static int shooterSpark = 8;
    final public static int beltSpark = 9;
    final public static int curveSpark = 10;

    final public static int dropperSpark = 11;
    
  //Voltages
    final public static double autoDrivetrainVolts = 0.3;
    final public static double elevatorVolts = 0.5;

}
