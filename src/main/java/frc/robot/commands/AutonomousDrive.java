package frc.robot.commands;

public class AutonomousDrive extends CommandBase {
    public AutonomousDrive(){
        requires(chassis);
    }
    @Override
    protected void initialize() {
        super.initialize();
    }

    @Override
    protected void execute() {
       System.out.println(chassis.getEncoderValue());
       chassis.drive(0.5, 0);
       setTimeout(3);
       
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }

}
