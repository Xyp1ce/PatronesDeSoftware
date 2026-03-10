package Commands.OffCommands;

import Classes.GarageDoor;
import Commands.Command;

public class GarageDoorCloseCommand implements Command {

  GarageDoor garageDoor;

  public GarageDoorCloseCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  public void execute() {
    garageDoor.down();
  }

  public void undo() {
    garageDoor.up();
  }
}
