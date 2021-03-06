package org.usfirst.frc.team3504.robot.commands;

import org.usfirst.frc.team3504.robot.Robot;
import org.usfirst.frc.team3504.robot.RobotMap;
import org.usfirst.frc.team3504.robot.commands.TurnToGear.Direction;
import org.usfirst.frc.team3504.robot.subsystems.Shifters;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class TurnByDistance extends Command {

	private double rotationsRight;
	private double rotationsLeft;
	
	private CANTalon leftTalon = Robot.chassis.getLeftTalon();
	private CANTalon rightTalon = Robot.chassis.getRightTalon();

	private double leftInitial;
	private double rightInitial;
	
	private Shifters.Speed speed;

	public TurnByDistance(double rightInches, double leftInches, Shifters.Speed speed) {
		rotationsRight = rightInches / (RobotMap.WHEEL_DIAMETER * Math.PI);
		rotationsLeft = leftInches / (RobotMap.WHEEL_DIAMETER * Math.PI);
		this.speed = speed;

		// Use requires() here to declare subsystem dependencies
		requires(Robot.chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.chassis.setPositionMode();
		
		Robot.shifters.shiftGear(speed);

		// Robot.chassis.setupFPID(leftTalon);
		// Robot.chassis.setupFPID(rightTalon);
		
		if (speed == Shifters.Speed.kLow){
			leftTalon.setP(0.17);
			rightTalon.setP(0.17);

			leftTalon.setI(0.0);
			rightTalon.setI(0.0);

			leftTalon.setD(0.02);
			rightTalon.setD(0.02);

			leftTalon.setF(0.0);
			rightTalon.setF(0.0);
		}
		else if (speed == Shifters.Speed.kHigh){
			leftTalon.setP(0.02);
			rightTalon.setP(0.02);

			leftTalon.setI(0.0);
			rightTalon.setI(0.0);

			leftTalon.setD(0.04);
			rightTalon.setD(0.04);

			leftTalon.setF(0.0);
			rightTalon.setF(0.0);
		}
		

		// leftTalon.setPosition(0.0);
		// rightTalon.setPosition(0.0);

		System.out.println("TurnByDistance Started " + rotationsRight + rotationsLeft);

		leftInitial = -leftTalon.getPosition();
		rightInitial = rightTalon.getPosition();

		leftTalon.set(-(rotationsLeft + leftInitial));
		rightTalon.set(rotationsRight + rightInitial);

		System.out.println("LeftInitial: " + leftInitial + " RightInitial: " + rightInitial);

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		leftTalon.set(-(rotationsLeft + leftInitial));
		rightTalon.set(rotationsRight + rightInitial);

		SmartDashboard.putNumber("Drive Talon Left Goal", -rotationsLeft);
		SmartDashboard.putNumber("Drive Talon Left Position", leftTalon.getPosition());
		SmartDashboard.putNumber("Drive Talon Left Error", leftTalon.getError());

		//System.out.println("Left Goal " + (-(rotations + leftInitial)) + " Right Goal " + (rotations + rightInitial));
		//System.out.println("Left Position " + leftTalon.getPosition() + " Right Position " + rightTalon.getPosition());
		//System.out.println("Left Error " + ((-(rotations + leftInitial)) + leftTalon.getPosition()));
		//System.out.println("Right Error " + (((rotations + rightInitial)) - rightTalon.getPosition()));
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.shifters.shiftGear(Shifters.Speed.kLow);
		System.out.println("TurnByDistance Finished");
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
