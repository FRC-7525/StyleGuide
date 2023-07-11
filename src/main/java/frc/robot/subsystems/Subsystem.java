// Use PascalCase for class names

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Timer;

// name is <Class>States
enum SubsystemStates {
    // States should have clearly understandable names
    OFF,
    // SCREAMING_SNAKE_CASE
    TURNING_OFF
}

public class Subsystem {
    private Timer timer = new Timer();
    private SubsystemStates state =  SubsystemStates.OFF;

    public Subsystem() {
        // variables should not be constructed here
    }

    public void periodic() {
        // State machine should be written with if statements
        if (state == SubsystemStates.OFF) {
            // State operations
            
            // State transition
        } else if (state == SubsystemStates.TURNING_OFF) {
            // include an else if even for the last state!
            // State operations

            // State transition
        }
    }

    // Instead of making variables public, use getters and setters
    public double getTime() {
        return timer.get();
    }
}
