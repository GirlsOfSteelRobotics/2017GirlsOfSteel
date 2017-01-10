package org.usfirst.frc.team3504.robot.subsystems;

import org.usfirst.frc.team3504.robot.RobotMap;
import org.usfirst.frc.team3504.robot.commands.DriveByJoystick;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Chassis extends Subsystem {
	private CANTalon driveLeftA;
	private CANTalon driveLeftB;
	
	private CANTalon driveRightA;
	private CANTalon driveRightB;
	
	private RobotDrive robotDrive;  
	
	public Chassis(){
		driveLeftA = new CANTalon(RobotMap.DRIVE_LEFT_A);
		driveLeftB = new CANTalon(RobotMap.DRIVE_LEFT_B);
		driveRightA = new CANTalon(RobotMap.DRIVE_RIGHT_A);
		driveRightB = new CANTalon(RobotMap.DRIVE_RIGHT_B);

		driveLeftA.enableBrakeMode(true);
		driveLeftB.enableBrakeMode(true);
		driveRightA.enableBrakeMode(true);
		driveRightB.enableBrakeMode(true);
		
		driveLeftB.changeControlMode(CANTalon.TalonControlMode.Follower);
		driveRightB.changeControlMode(CANTalon.TalonControlMode.Follower);
		driveLeftB.set(driveLeftA.getDeviceID());
		driveRightB.set(driveRightA.getDeviceID());
	
		
		robotDrive = new RobotDrive(driveLeftA, driveRightA);
		robotDrive.setInvertedMotor(MotorType.kRearLeft, true);
		robotDrive.setInvertedMotor(MotorType.kRearRight, true);
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveByJoystick());
    }
    
    public void driveByJoystick(Joystick joystick) {
		robotDrive.arcadeDrive(joystick);
	}

    public void driveSpeed(double speed) {
		robotDrive.drive(-speed, 0);
	}
    
	public void stop() {
		// TODO Auto-generated method stub
		robotDrive.drive(/* speed */0, /* curve */0);
	}

	
}

