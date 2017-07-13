package org.usfirst.frc.team3200.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//Controller
	
	public static final int CONTROLLER_1 = 0;
	
	//Talons
	public static final int TALON_FR = 1;
	public static final int TALON_FL = 2;
	public static final int TALON_BR = 3;
	public static final int TALON_BL = 4;
	
	//Controller axes
	 public static final int LEFT_STICK_X = 0;
	 public static final int LEFT_STICK_Y = 1;
	 public static final int LEFT_TRIGGER = 2;
	 public static final int RIGHT_TRIGGER = 3;
	 public static final int RIGHT_STICK_X = 4;
	 public static final int RIGHT_STICK_Y = 5;
	
	//Buttons    
	public static final int BUTTON_A = 1;
    public static final int BUTTON_B = 2;
	public static final int BUTTON_X = 3;
	public static final int BUTTON_Y = 4;
	public static final int RIGHT_BUMPER = 6;
	public static final int LEFT_BUMPER = 5;
	public static final int BUTTON_SELECT = 7;
	public static final int BUTTON_LEFT_JOYSTICK = 9;
	public static final int BUTTON_START = 8;
	public static final int BUTTON_RIGHT_JOYSTICK = 10;
}
