package org.usfirst.frc.team3158.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
	
public class RobotMap {
	
	//These are the motors for the actuators//
	public static int highArm= 0;
	public static int lowArm= 0;
	
	//These are the encoders for the actuators//
	public static int upEncoder[]= {0, 1};
	public static int downEncoder[]={0,1};

	//These are the switch for the actuators//
	public static int limitSwitchOne;
	public static int limitSwitchTwo;
	
	// These are the desired heights for the low arm
	public static double startingPositionLow= 0;
	public static double lowestPositionLow= 0;
	public static double highestPositionLow=0;
	
	// These are the desired heights for the high arm
	public static double firstPositionHigh= 0;
	public static double secondPositionHigh=0;
	public static double thirdPositionHigh=0;
	public static double fourthPositionHigh=0;
	
	
	
	}
