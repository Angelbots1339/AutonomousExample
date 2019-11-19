package frc.robot.commands;
import frc.robot.RobotMap;

public class Drive extends CommandBase {
    public Drive() {
        requires(chassis);
    }

    @Override
    protected void initialize() {
        super.initialize();
    }

    @Override
    protected void execute() {
      chassis.drive(oi.stick.getRawAxis(RobotMap.leftYAxis), oi.stick.getRawAxis(RobotMap.rightXAxis));
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

}