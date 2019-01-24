/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.*;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class LineSense {
AnalogInput encoder0;
AnalogInput encoder1;
AnalogInput encoder2;
double encoder0value;
double encoder1value;
double encoder2value;
//Sets up the Talons. 
WPI_TalonSRX talonFive;
WPI_TalonSRX talonSix;
WPI_TalonSRX talonTwo;
WPI_TalonSRX talonThree;

    //Sets up the Xbox Controller. 
    private XboxController _xBox;

DifferentialDrive driveTrain;

public LineSense() {

    encoder0 = new AnalogInput(0);
    encoder1 = new AnalogInput(1);
    encoder2 = new AnalogInput(3);
    talonFive = new WPI_TalonSRX(5);
    talonSix = new WPI_TalonSRX(6);
    talonTwo = new WPI_TalonSRX(2);
    talonThree = new WPI_TalonSRX(3);
    _xBox = new XboxController(0);
    talonTwo.set(com.ctre.phoenix.motorcontrol.ControlMode.Follower, talonThree.getDeviceID());
    talonFive.set(com.ctre.phoenix.motorcontrol.ControlMode.Follower, talonSix.getDeviceID());
    driveTrain = new DifferentialDrive(talonThree, talonSix);
    
    }

    public void senseLine() {
    
    encoder0value = encoder0.getVoltage();
    SmartDashboard.putNumber("Encoder 0", encoder0value);
    encoder1value = encoder1.getVoltage();
    SmartDashboard.putNumber("Encoder 1", encoder1value);
    encoder2value = encoder2.getVoltage();
    SmartDashboard.putNumber("Encoder 2", encoder2value);
   
    if (encoder1value > 2.5) {
       driveTrain.arcadeDrive(0.5, 0);
   }

   else if (encoder0value > 2.5) {
        driveTrain.arcadeDrive(0.5, -0.6);
    }

 
   else if (encoder2value > 2.5) {
       driveTrain.arcadeDrive(0.5, 0.6);
    }
 }
}