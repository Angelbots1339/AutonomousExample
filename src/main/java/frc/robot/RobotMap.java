/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  //chassis motors
  public static int leftTopMotor = 3;
  public static int leftFrontMotor = 6;
  public static int leftBackMotor = 5;
  public static int rightTopMotor = 4;
  public static int rightFrontMotor = 7;
  public static int rightBackMotor = 1;

  //encoders
  public static int rightEncoder = 1;
  public static int leftEncoder = 2;

  //buttons
  public static int xButton = 2;
  public static int aButton = 0;
  public static int bButton = 1;
  public static int yButton = 3;

  public final static int leftYAxis = 1;
  public final static int leftXAxis = 0;
  public final static int rightYAxis = 5;
  public final static int rightXAxis = 4;

  
}
