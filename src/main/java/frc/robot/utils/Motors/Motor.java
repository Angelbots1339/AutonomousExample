package frc.robot.utils.Motors;

public interface Motor {
    public abstract void setPIDF(double p, double i, double d, double f);
    public abstract void setVel(double velocity);
    public abstract double getVel();
    public abstract void setPos(double degrees);
    public abstract double getPos();
    public abstract void set(double speed);
    public abstract void setInverted(boolean isInverted);
 
}