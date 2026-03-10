package Commands.OffCommands;

import Classes.TV;
import Commands.Command;

public class TVOffCommand implements Command {
  TV tv;

  public TVOffCommand(TV tv) {
    this.tv = tv;
  }

  public void execute() {
    tv.off();
  }

  public void undo() {
    tv.on();
  }
}
