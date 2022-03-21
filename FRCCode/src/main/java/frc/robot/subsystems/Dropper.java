
package frc.robot.subsystems;

import com.revrobotics.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Dropper extends SubsystemBase {
    private static Dropper instance = null;

    //Creates CANSparkMax vairable
    public static CANSparkMax dropperMotor;
     
    //Creates Elevator Object instance
    public static Dropper getInstance(){
        if (instance == null){
            System.out.println("Dropper init");
            instance = new Dropper();
        }
        return instance;
    } 
    public Dropper () {
        //Uses constructor from SubsystemBase
        super();
        
        //Elevator Motor
        dropperMotor = new CANSparkMax(10, CANSparkMaxLowLevel.MotorType.kBrushed);
        

    }

    //method to lift
    public void drop(double dropVolts) {
        dropperMotor.setVoltage(dropVolts*12);
    }

}
