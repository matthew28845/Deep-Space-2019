/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.Talon;

/**
 * Add your docs here.
 */
public class DriveTrain {
    Talon talonZero = new Talon(0);
    Talon talonOne = new Talon(1);
    Talon talonTwo = new Talon(2);
    Talon talonThree = new Talon(3);
    public DriveTrain () {
        
    }
}
