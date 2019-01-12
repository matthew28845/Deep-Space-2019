/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.*;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.MecanumDrive;


/**
 * Add your docs here.
 */
public class DriveTrain {
    Talon talonZero;
    Talon talonOne;
    Talon talonTwo;
    Talon talonThree;
    MecanumDrive mDrive;
    AHRS aHRS;
    PIDController turnController;
    PIDAngleWrite pidAngleOutput;
    public DriveTrain () {
        talonZero = new Talon(0);
        talonOne = new Talon(1);
        talonTwo = new Talon(2);
        talonThree = new Talon(3);
        mDrive = new MecanumDrive(talonZero, talonTwo, talonOne, talonThree);
        pidAngleOutput = new PIDAngleWrite();
        aHRS = new AHRS(SPI.Port.kMXP);
        aHRS.setPIDSourceType(PIDSourceType.kDisplacement);
        turnController = new PIDController(Constants.kP, Constants.kI, Constants.kD, aHRS, pidAngleOutput);

    }

    public void pidTurnToAngle (double angle){
        turnController.setPID(Constants.kP, Constants.kI, Constants.kD);
        turnController.enable();
        turnController.setSetpoint(angle);
        mDrive.driveCartesian(0, 0, pidAngleOutput.getSpeed());
    }
}
