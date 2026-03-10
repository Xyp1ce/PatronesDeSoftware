package Commands.OnCommands;

import Classes.Hottub;
import Commands.Command;

public class HottubOnCommand implements Command {
  Hottub hottub;

  public HottubOnCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  public void execute() {
    hottub.on();
    hottub.ready();
  }

  public void undo() {
    hottub.off();
  }
}
