package frc.robot.utils.Motors;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Talon extends TalonSRX implements Motor {

  private double gearRatio, encoderClicks;

  public Talon(final int motorid, final double gearRatio, final Double encoderClicks){
      super(motorid);
      this.gearRatio = gearRatio;
      this.encoderClicks = encoderClicks;
  }

  public Talon(int motorid){
      super(motorid);
      this.gearRatio = 1;
      this.encoderClicks = 1;
  }

  public void setPIDF(final double p, final double i, final double d, final double f) {
    this.config_kP(0, p);
    this.config_kI(0, i);
    this.config_kD(0, d);
    this.config_kF(0, f);
  }
  
  public void setPos(double position){
      this.set(ControlMode.Position, position*encoderClicks*gearRatio);
  }

  public void set(double speed) {
      this.set(ControlMode.PercentOutput, speed);
  }

 //encoder clicks per second
  @Override
  public void setVel(double velocityRotations) {
      this.set(ControlMode.Velocity, velocityRotations*encoderClicks*gearRatio);
  }

  public double getVel() {
      return this.getSelectedSensorVelocity()*10/encoderClicks;
  }

  public void resetSensor(){
      this.setSelectedSensorPosition(0);
  }

  public void setBrakeMode(final boolean mode){
      this.setNeutralMode(mode ? NeutralMode.Brake : NeutralMode.Coast);
  }

    @Override
    public double getPos() {
        return this.getSelectedSensorPosition()/encoderClicks/gearRatio;
    }
}