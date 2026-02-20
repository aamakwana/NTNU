package no.ntnu.idat;

public class WrapSelectionTextCommand extends WrapTextCommand{
  private String selection;

  public WrapSelectionTextCommand(String opening, String end,String selection) {
    super(opening, end);
    this.selection = selection;

  }
  public String getSelection() {
    return selection;

  }
  @Override
  public String execute(String text)
  {
    return text.replaceAll(selection, getOpening()+selection+getEnd());
  }

}
