/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 * Add your docs here.
 */
public class PIDAngleWrite implements PIDOutput {
  public void pidWrite (double PIDWriteOutput) {
    double TurnOutput = PIDWriteOutput;
  }
  
}
