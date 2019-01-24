package frc.robot;

//Imports everything neccesary for the code to work. 
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class DriveTrain {
    //Sets up the Xbox Controller. 
    private XboxController _xBox = new XboxController(0);

//Sets up the Talons. 
Talon talonZero = new Talon(0);
Talon talonOne = new Talon(1);
Talon talonTwo = new Talon(2);
Talon talonThree = new Talon(3);

//Sets up the Talons into pairs, which makes control easier. 
SpeedControllerGroup left = new SpeedControllerGroup(talonZero, talonTwo);
SpeedControllerGroup right = new SpeedControllerGroup(talonOne, talonThree);

public void teleopPeriodic() {


}
}