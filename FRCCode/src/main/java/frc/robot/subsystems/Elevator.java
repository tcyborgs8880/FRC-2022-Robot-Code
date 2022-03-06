package frc.robot.subsystems;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import com.revrobotics.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase {
    private static Elevator instance = null;

    public static CANSparkMax elevatorMotor;

    public static DifferentialDrive elevatorcontrol;

    public static Elevator getInstance(){
        if (instance == null){
            System.out.println("Elevator init");
            instance = new Elevator();
        }
        return instance;
    }
    public Elevator () {
        super();
        //frontLeft.setIdleMode(Spark.Kbrake);
        

        //Right
        elevatorMotor = new CANSparkMax(5, CANSparkMaxLowLevel.MotorType.kBrushed);
        

    }

    public void lift(double liftVolts) {
        elevatorMotor.setVoltage(liftVolts * 12);

    }

}
