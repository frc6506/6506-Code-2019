/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;

/**
 * help I don't know what I'm doing
 */
public class Spintake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Spark spintake1 = new Spark(RobotMap.SPINTAKE_MOTOR_1);
  Spark spintake2 = new Spark(RobotMap.SPINTAKE_MOTOR_2);
  Spark test = new Spark(RobotMap.ARM_MOTOR);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    

  }

  public void succ() {
    // Spintake Intake
    spintake1.set(-1.0);
    spintake2.set(1.0);
    test.set(1);
  }

  public void fire() {
    // Spintake Out
    spintake1.set(1.0);
    spintake2.set(-1.0);
  }
  
  public void stop() {
    spintake1.set(0.0);
    spintake2.set(0.0);
  }
}
