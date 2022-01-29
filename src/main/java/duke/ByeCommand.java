package duke;

/**
 * Runs the command for user to exit the Duke-program.
 */

public class ByeCommand extends Command {

    /**
     * Executes the command and exiting the program.
     *
     * @param taskList The TaskList of the current user.
     * @param ui The user interface to show messages to users.
     * @param storage The file system for reading and writing into the database.
     */
    @Override
    void runCommand(TaskList taskList, Ui ui, Storage storage) {
        ui.outputMessage("Thank you for using Duke App. Have a nice day");
        System.exit(1);
    }


}