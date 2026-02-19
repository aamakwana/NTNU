package no.ntnu.idat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class ScriptTest {
  @Test
   void testScript() {
    Script script = new Script(List.of(
        new ReplaceTextCommand("world", "java"),
        new CapitalizeTextCommand(),
        new WrapTextCommand("<p>", "</p>")
    ));
    assertEquals("<p>Hello java</p>",
        script.execute("hello world"));
  }
  @Test
  void testNullInput() {
    ReplaceTextCommand cmd = new ReplaceTextCommand("target", "replacement");
    assertThrows(IllegalArgumentException.class, () -> cmd.execute(null));
  }
}