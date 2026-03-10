package Commands.OnCommands;

import Commands.Command;
import Classes.TV;

public class TVOnCommand implements Command {
  TV tv;

  public TVOnCommand(TV tv) {
    this.tv = tv;
  }

  public void execute() {
    tv.on();
  }

  public void undo() {
    tv.off();
  }
}
