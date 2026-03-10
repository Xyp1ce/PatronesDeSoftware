package Commands.OffCommands;

import Classes.Stereo;
import Commands.Command;

public class StereoOffCommand implements Command {
  Stereo stereo;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.off();
  }

  public void undo() {
    stereo.on();
  }
}
