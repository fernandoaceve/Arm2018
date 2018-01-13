package org.usfirst.frc.team3158.robot.subsystems;

import org.usfirst.frc.team3158.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arm extends Subsystem {
	
	
	public Talon highArm;
	public Talon lowArm;
	
	public Encoder upEncoder;
	public Encoder downEncoder;
	
	public int lowPosition=0;
	public int hightPosition= 0;
	
	public Arm(){
		 
		highArm = new Talon(RobotMap.highArm);
		lowArm= new Talon(RobotMap.lowArm);
	
		upEncoder= new Encoder(RobotMap.upEncoder[0], RobotMap.upEncoder[1]);
		downEncoder= new Encoder (RobotMap.downEncoder[0], RobotMap.downEncoder[1]);
	 }
	
	//
	public double upPosition(){
		return upEncoder.get();		
	}
	
	//
	public double downPosition(){
		return downEncoder.get();
	}
		
	//Speed will change
	public void moveHighUp(){
		highArm.set(.5);
	}
	
	//
	public void moveHighDown(){
		highArm.set(-.5);
	}

	//
	public void stopHighMotor(){
		highArm.set(0);
	}
	
	//
	public void moveLowUp (){
		lowArm.set(.5);
	}
	
	//
	public void moveLowDown(){
		lowArm.set(-.5);
	}

	//
	public void stopLowMotor(){
		lowArm.set(0);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
}