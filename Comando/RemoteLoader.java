import Classes.*;
import Commands.MacroCommand;
import Commands.OffCommands.*;
import Commands.OnCommands.*;
import Commands.Command;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    Light livingRoomLight = new Light("Luz Sala");
    TV tv = new TV("Sala TV");
    Stereo stereo = new Stereo("Stereo Sala");
    Hottub hottub = new Hottub("Jacuzzi del patio");

    LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
    TVOnCommand tvOn = new TVOnCommand(tv);
    StereoOnWithCDCommand StereoOn = new StereoOnWithCDCommand(stereo);
    HottubOnCommand HottubOn = new HottubOnCommand(hottub);

    LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
    TVOffCommand tvOff = new TVOffCommand(tv);
    StereoOffCommand StereoOff = new StereoOffCommand(stereo);
    HottubOffCommand HottubOff = new HottubOffCommand(hottub);

    Command[] partyOn = { lightOn, tvOn, StereoOn, HottubOn };
    Command[] partyOff = { HottubOff, StereoOff, tvOff, lightOff };

    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);

    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

    System.out.println(remoteControl);
    System.out.println("\n--- Pushing Macro On ---");
    remoteControl.onButtonWasPressed(0);
    System.out.println("\n--- Pushing Macro Off ---");
    remoteControl.offButtonWasPressed(0);
  }
}
