package frc.robot.utils;

public class Conversions {

    private static double diameter = 5.88;
    private static double clicksPerRot = 1024;

    public static class Chassis {
        public static double clicksToInches(double input){
            return input * Math.PI * diameter / clicksPerRot;
        }
    
        public static double inchesToClicks(double input){
            return input * clicksPerRot / Math.PI / diameter;
        }
        public static double rotationsToDegrees(double input){
            return input * 360;
        }
    
        public static double degreesToRotations(double input){
            return input / 360;
        }
    
    }
}