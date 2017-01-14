package org.usfirst.frc.team3504.robot.subsystems;

import org.usfirst.frc.team3504.robot.RobotMap;
import org.usfirst.frc.team3504.robot.subsystems.Shifters.Speed;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shifters extends Subsystem {
    private DoubleSolenoid shifterLeft;
    private DoubleSolenoid shifterRight;
    
    public enum Speed {kHigh, kLow};
    
    private boolean inHighGear;
    
    public Shifters() {
		shifterLeft = new DoubleSolenoid(RobotMap.SHIFTER_LEFT_A, RobotMap.SHIFTER_LEFT_B);
		shifterRight = new DoubleSolenoid(RobotMap.SHIFTER_RIGHT_A, RobotMap.SHIFTER_RIGHT_B);

	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
    public void shiftGear(Speed speed) {
		if (speed == Speed.kHigh) {
			shifterLeft.set(DoubleSolenoid.Value.kReverse);
			shifterRight.set(DoubleSolenoid.Value.kReverse);
			System.out.println("Shifting left and right side into high gear (fwd)");
			inHighGear = true;
		} else {
			shifterLeft.set(DoubleSolenoid.Value.kForward);
			shifterRight.set(DoubleSolenoid.Value.kForward);
			System.out.println("Shifting left and right side into low gear (rev)");
			inHighGear = false;
		}
	}
	
	public boolean getGearSpeed() {
		return inHighGear;
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}