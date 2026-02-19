package no.ntnu.idat;
import java.util.ArrayList;
import java.util.List;

public class Script {
  private List<TextCommand> textCommands;
  public Script(List<TextCommand> textCommands) {
    this.textCommands = textCommands;
  }

  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException("Text cannot be null");
    }
    for (TextCommand command : textCommands) {
      text = command.execute(text);
    }
    return text;
  }
  }


