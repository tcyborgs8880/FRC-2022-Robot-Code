
package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import com.revrobotics.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {

    private static Intake instance = null;

    public static CANSparkMax frontIntakeMotor;
    public static CANSparkMax backIntakeMotor;

    public static Intake getInstance(){

        if (instance == null){

            System.out.println("Intake init");
            instance = new Intake ();
        }
        return instance;
    }

    public Intake(){
        super();

        frontIntakeMotor = new CANSparkMax(6, CANSparkMaxLowLevel.MotorType.kBrushless);
        backIntakeMotor = new CANSparkMax(7, CANSparkMaxLowLevel.MotorType.kBrushless);

    }

    //Sets both intake motor to the same speed
    public void intakeMotors(double intakeVoltage){
        frontIntakeMotor.setVoltage(intakeVoltage * 12);
        backIntakeMotor.setVoltage(intakeVoltage * 12);
    }

    //Runs the drop intake motor
    public void drop(double intakeVoltage){
        //Need to add a motor for drop
    }
    

   

    
}
