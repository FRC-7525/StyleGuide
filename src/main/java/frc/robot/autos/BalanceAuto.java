package frc.robot.autos;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

/*
 * Commands should extend SequentialCommandGroup
 * Should end with word Auto if final autonomous group (end up on chooser)
 */
public class BalanceAuto extends SequentialCommandGroup {
    public BalanceAuto() {
        // Use addCommands to create sequence of commands
        addCommands(
            new InstantCommand(() -> System.out.println("Add commands here"))
        );
    }
}