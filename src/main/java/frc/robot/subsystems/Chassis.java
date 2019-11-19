package frc.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.Drive;
import frc.robot.utils.Motors.*;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;

public class Chassis extends Subsystem{
    double gearRatio = 36;
    double encoderClicks = 1024;
    int pidIdx = 0;
    int timeoutMs = 0; //checks to see if succesful
    
    //motors
	Talon leftTopMotor = new Talon(RobotMap.leftTopMotor, gearRatio, encoderClicks);
    Talon leftFrontMotor = new Talon(RobotMap.leftFrontMotor, gearRatio, encoderClicks);
    Talon leftBackMotor = new Talon(RobotMap.leftBackMotor, gearRatio, encoderClicks);
    Talon rightTopMotor = new Talon(RobotMap.rightTopMotor, gearRatio, encoderClicks);
    Talon rightFrontMotor = new Talon(RobotMap.rightFrontMotor, gearRatio, encoderClicks);
    Talon rightBackMotor = new Talon(RobotMap.rightBackMotor, gearRatio, encoderClicks);
    
    public Chassis(){
    leftFrontMotor.follow(leftTopMotor);
    leftBackMotor.follow(leftTopMotor);
    rightFrontMotor.follow(rightTopMotor);
    rightBackMotor.follow(rightTopMotor);
   
    rightBackMotor.setInverted(true);
    rightFrontMotor.setInverted(true);
    rightTopMotor.setInverted(true);

    //encoder
    leftTopMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, pidIdx, timeoutMs);
    rightTopMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, pidIdx, timeoutMs);

    }

    //Arcade Drive

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }

    public void set(final double left, final double right) {
        leftTopMotor.set(left);
        rightTopMotor.set(right);
    }

    public void drive(final double speed, final double turn) {
        set(speed-turn, speed+turn);
    }
    
    public double[] getEncoderValue(){
        double[] ret = new double[2];
        ret[0] = leftTopMotor.getSelectedSensorPosition();
        ret[1] = rightTopMotor.getSelectedSensorPosition();
        return ret;
    }

    //PID 
    /*
    public Chassis(final double p, final double i, final double d) {
        super(p, i, d);
    }
    
    public void resetEncoders(){
        leftEncoder.reset();
        rightEncoder.reset();
    }
	@Override
	protected double returnPIDInput() {
        System.out.println(leftEncoder.getDistance());
        System.out.println(rightEncoder.getDistance()
	}

	@Override
	protected void usePIDOutput(double setpoint) {
        leftTopMotor.setPos(setpoint);
        rightTopMotor.pidWrite(output);
    }
    */
}