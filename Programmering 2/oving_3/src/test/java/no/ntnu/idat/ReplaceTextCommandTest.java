package no.ntnu.idat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReplaceTextCommandTest {

  @Test
  public void testReplaceAll() {
    ReplaceTextCommand cmd = new ReplaceTextCommand("target", "replacement");
    assertEquals("text with replacement and replacement",
        cmd.execute("text with target and target"));
  }

  @Test
  public void testReplaceFirst() {
    ReplaceFirstTextCommand cmd = new ReplaceFirstTextCommand("target", "replacement");
    assertEquals("text with replacement and target",
        cmd.execute("text with target and target"));
  }

  @Test
  public void testGetTarget() {
    ReplaceTextCommand cmd = new ReplaceTextCommand("target", "replacement");
    assertEquals("target", cmd.getTarget());
  }

  @Test
  public void testGetReplacement() {
    ReplaceTextCommand cmd = new ReplaceTextCommand("target", "replacement");
    assertEquals("replacement", cmd.getReplacement());
  }
  @Test
  void testNullInput() {
    ReplaceTextCommand cmd = new ReplaceTextCommand("target", "replacement");
    assertThrows(IllegalArgumentException.class, () -> cmd.execute(null));
  }
}