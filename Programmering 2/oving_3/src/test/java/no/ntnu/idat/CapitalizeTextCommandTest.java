package no.ntnu.idat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTextCommandTest {
  @Test
  void testCapitalize() {
    CapitalizeTextCommand result = new CapitalizeTextCommand();
    assertEquals("Text to be capitalized",
        result.execute("text to be capitalized"));
  }
  @Test
  void testCapitalizeWords() {
    CapitalizeTextCommand result = new CapitalizeTextCommand();
    assertEquals("Text To Be Capitalized",
        result.execute("text to be capitalized"));
  }
  @Test
  void testCapitalizeSelection() {
    CapitalizeSelectionTextCommand result = new CapitalizeSelectionTextCommand("capitalized");
    assertEquals("text to be Capitalized",
        result.execute("text to be capitalized"));
  }

}
