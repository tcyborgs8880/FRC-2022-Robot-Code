package frc.robot.subsystems;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import com.revrobotics.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    private static Drivetrain instance = null;

    public static CANSparkMax frontRight;
    public static CANSparkMax frontLeft;
    public static CANSparkMax backRight;
    public static CANSparkMax backLeft;

    public static MotorControllerGroup leftGroup;
    public static MotorControllerGroup rightGroup;
    public static DifferentialDrive drivetraincontrol;

    public static Drivetrain getInstance(){
        if (instance == null){
            System.out.println("drivetrain init");
            instance = new Drivetrain();
        }
        return instance;
    }
    public Drivetrain () {
        super();
        //frontLeft.setIdleMode(Spark.Kbrake);
        

        //Right
        frontRight = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushed);
        backRight = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushed);

        frontLeft = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushed);
        backLeft = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushed);

        frontRight.setInverted(true);
        backRight.setInverted(true);

        leftGroup = new MotorControllerGroup(frontLeft, backLeft);
        rightGroup = new MotorControllerGroup(frontRight, backRight);

        drivetraincontrol = new DifferentialDrive(leftGroup, rightGroup);
    }

    public void tankDriveVolts(double leftVolts, double rightVolts){
        leftGroup.setVoltage(leftVolts*12);
        rightGroup.setVoltage(rightVolts*12);
        
    }

}