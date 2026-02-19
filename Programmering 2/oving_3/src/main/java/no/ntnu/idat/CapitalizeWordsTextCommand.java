package no.ntnu.idat;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {
  @Override
  public String execute(String text) {
    String[] words = text.split(" ");
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      result.append(words[i].substring(0, 1).toUpperCase() + words[i].substring(1));
      if (i  < words.length - 1) {
        result.append(" ");
      }

    }
    return result.toString();
  }






}
