package no.ntnu.idat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class WrapTextCommandTest {

  @Test
  void testWrapText() {
    WrapTextCommand cmd = new WrapTextCommand("<p>", "</p>");
    assertEquals("<p>text to be wrapped</p>",
        cmd.execute("text to be wrapped"));
  }

  @Test
  void testWrapLines() {
    WrapLinesTextCommand cmd = new WrapLinesTextCommand("<p>", "</p>");
    assertEquals("<p>first line</p>\n<p>second line</p>",
        cmd.execute("first line\nsecond line"));
  }

  @Test
  void testWrapSelection() {
    WrapSelectionTextCommand cmd = new WrapSelectionTextCommand("<p>", "</p>", "selection");
    assertEquals("text with <p>selection</p>",
        cmd.execute("text with selection"));
  }

  @Test
  void testNullInput() {
    WrapTextCommand cmd = new WrapTextCommand("<p>", "</p>");
    assertThrows(IllegalArgumentException.class, () -> cmd.execute(null));
  }
}
