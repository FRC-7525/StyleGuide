package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class Robot extends TimedRobot {
    // One tab = 4 spaces

    /*
     * meta-comment: use asterisks for multi-line comments
     * Class variables should be explicitly marked private, and
     * should not be static
     * Don't use m_, etc. to start variable names
     */
    private VictorSP leftMotor = new VictorSP(0);

    @Override
    public void robotInit() {
    }

    @Override
    public void robotPeriodic() {
    }

    @Override
    public void autonomousInit() {
    }

    @Override
    public void autonomousPeriodic() {
    }

    @Override
    public void teleopInit() {
    }

    @Override
    // Use camelCase for function and variable names
    public void teleopPeriodic() {
        // Space after keywords, but not within parens
        if (true) {
            /*
             * Keep brackets on same
             * Always use brackets, unless if statement is on one line
             */
            if (false) dummy();
        } else {
            // Keep else on same line as brackets!
        }
    }

    @Override
    public void disabledInit() {
    }

    @Override
    public void disabledPeriodic() {
    }

    @Override
    public void testInit() {
    }

    @Override
    public void testPeriodic() {
    }

    @Override
    public void simulationInit() {
    }

    @Override
    public void simulationPeriodic() {
    }

    private void dummy() {
    }
}
