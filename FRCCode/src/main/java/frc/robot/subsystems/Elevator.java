
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import com.revrobotics.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase {
    private static Elevator instance = null;

    //Creates CANSparkMax vairable
    public static CANSparkMax elevatorMotor;
     
    //Creates Elevator Object instance
    public static Elevator getInstance(){
        if (instance == null){
            System.out.println("Elevator init");
            instance = new Elevator();
        }
        return instance;
    } 
    public Elevator () {
        //Uses constructor from SubsystemBase
        super();
        
        //Elevator Motor
        elevatorMotor = new CANSparkMax(5, CANSparkMaxLowLevel.MotorType.kBrushed);
        

    }

    //method to lift
    public void lift(double aLiftVolts, double yLiftVolts) {
        elevatorMotor.setVoltage(aLiftVolts*12);
        elevatorMotor.setVoltage(yLiftVolts*12);
    }

}
