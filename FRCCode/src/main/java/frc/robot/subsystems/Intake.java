
package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import com.revrobotics.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {

    private static Intake instance = null;

    public static CANSparkMax intakeMotor;
    public static CANSparkMax dropMotor;

    public static Intake getInstance(){

        if (instance == null){

            System.out.println("Intake init");
            instance = new Intake ();
        }
        return instance;
    }

    public Intake(){
        super();

        intakeMotor = new CANSparkMax(6, CANSparkMaxLowLevel.MotorType.kBrushless);
        dropMotor = new CANSparkMax(7, CANSparkMaxLowLevel.MotorType.kBrushless);

    }

    public void intakeMotors(double intakeVoltage){
        intakeMotor.setVoltage(intakeVoltage * 12);
    }
    
    public void drop(double dropVoltage){
        dropMotor.setVoltage(dropVoltage * 12);
    }

   

    
}
