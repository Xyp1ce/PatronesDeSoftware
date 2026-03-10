package Commands.OffCommands;

import Classes.Hottub;
import Commands.Command;

public class HottubOffCommand implements Command {
  Hottub hottub;

  public HottubOffCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  public void execute() {
    hottub.off();
  }

  public void undo() {
    hottub.on();
    hottub.ready();
  }
}
