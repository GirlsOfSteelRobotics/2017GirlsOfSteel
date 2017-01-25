package org.usfirst.frc.team3504.robot.subsystems;

import org.usfirst.frc.team3504.robot.RobotMap;
import edu.wpi.cscore.MjpegServer;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Camera extends Subsystem {

	private UsbCamera camGear;
	private UsbCamera camClimb;
	private MjpegServer server;

	public Camera() {
		camGear = new UsbCamera("camGear", RobotMap.CAMERA_GEAR);
		camGear.setResolution(320, 240);
		camClimb = new UsbCamera("camClimb", RobotMap.CAMERA_CLIMB);
		camClimb.setResolution(320, 240);   
		CameraServer.getInstance().addCamera(camGear);
		server = CameraServer.getInstance().addServer("CameraServer", 1181);
		server.setSource(camClimb);
		
		//For stream in smartdashboard add a mjpg stream viewer, 
		//right click, select properties, and add http://roborio-3504-frc.local:1181/stream.mjpg
		//as the URL
	}

	public void switchToCamClimb() {
		server.setSource(camClimb);
		System.out.println("Cam Climb!");
	}

	public void switchToCamGear() {
		server.setSource(camGear);
		System.out.println("Cam Gear!");
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());
	}
}