package no.ntnu.idat;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand{
  private String selection;
  public CapitalizeSelectionTextCommand( String selection) {
    this.selection = selection;
  }
  public String getSelection() {
    return selection;
  }
  @Override
  public String execute(String text)
  {
    String capitalized = selection.substring(0,1).toUpperCase() + selection.substring(1);
    return text.replace(selection,capitalized);
  }
}
