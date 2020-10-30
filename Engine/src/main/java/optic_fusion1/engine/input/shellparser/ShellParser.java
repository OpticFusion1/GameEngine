package optic_fusion1.engine.input.shellparser;

import java.util.ArrayList;
import java.util.List;
import optic_fusion1.engine.input.shellparser.states.StartState;

public final class ShellParser {

  private ShellParser() {
  }

  public static List<String> parseString(final String string) throws ParseException {
    return new StartState().parse(string, "", new ArrayList<>(), null);
  }

  public static List<String> safeParseString(final String string) {
    try {
      return parseString(string);
    } catch (ParseException e) {
      return null;
    }
  }
}
