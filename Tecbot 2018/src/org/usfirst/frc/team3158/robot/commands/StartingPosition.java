package org.usfirst.frc.team3158.robot.commands;

import org.usfirst.frc.team3158.robot.Robot;
import org.usfirst.frc.team3158.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StartingPosition extends Command {

    boolean moveFinish;
	public StartingPosition() {
        requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.arm.downPosition() != RobotMap.startingPositionLow){
    		
    		if (Robot.arm.downPosition() > RobotMap.startingPositionLow){
        		Robot.arm.moveLowDown();
        		moveFinish= false;
        	}
        	
        	if (Robot.arm.downPosition() < RobotMap.startingPositionLow){
        		Robot.arm.moveLowUp();
        		moveFinish= false;
        	}	
    	
    		if (Robot.arm.downPosition() == RobotMap.startingPositionLow){
    		Robot.arm.stopLowMotor();
    		moveFinish= true;
    		}
    	}
    }
    		
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return moveFinish;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
