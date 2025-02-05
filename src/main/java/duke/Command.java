package duke;

import java.io.IOException;
import java.text.ParseException;

/**
 * Represents a command that an user will give to the software
 */
abstract class Command {

    abstract String runCommand(TaskList taskList, Ui ui, Storage storage)
            throws IOException, ParseException, DukeException;

    @Override
    public String toString() {
        return null;
    }
}
