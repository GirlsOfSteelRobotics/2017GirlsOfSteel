package org.usfirst.frc.team3504.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoRedHopper extends CommandGroup {

	public AutoRedHopper() {
		// Add Commands here:
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.
		// addSequential(new AutoDriveForward(156, .6)); //TODO: change //cross
		// baseline
		//// addSequential(new AutoTurn(21, 0.1)); //TODO: change
		// addSequential(new AutoDriveForward(156, .6)); //TODO: change //hit
		// hopper 1
		// addSequential(new AutoDriveBackward(156, .6)); //TODO: change
		//// addSequential(new AutoTurn(156, .6)); //TODO: change
		// addSequential(new AutoDriveForward(156, .6)); //TODO: change
		// // addSequential(new AutoTurn(156, .6)); //TODO: change
		// addSequential(new AutoDriveForward(156, .6)); //TODO: change //hit
		// hopper 2
		// addSequential(new AutoDriveBackward(156, .6)); //TODO: change //hit
		// hopper 2
	}
}
