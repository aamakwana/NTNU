package no.ntnu.idat;
import java.util.ArrayList;
import java.util.List;

public class Script {
  private List<TextCommand> textCommands;
  public Script(List<TextCommand> textCommands) {
    this.textCommands = textCommands;
  }

  public String execute(String text){
    for (TextCommand textCommand : textCommands) {
      text=textCommand.execute(text);
    }
    return text;
  }

}
