package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.Chassis;

public abstract class CommandBase extends Command {

  public static OI oi;
  public static Chassis chassis = new Chassis();


  public static void init(){
    oi = new OI();
  }

  public static void publishMatchUsefulValues(){
  }

  public static void resetSensors(){
  }
}