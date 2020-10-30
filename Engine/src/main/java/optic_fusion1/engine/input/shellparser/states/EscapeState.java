package optic_fusion1.engine.input.shellparser.states;

import java.util.List;
import optic_fusion1.engine.input.shellparser.ParseException;

public class EscapeState extends State {

  @Override
  public List<String> parse(final String parsing, final String accumulator, final List<String> parsed, final State referrer) throws ParseException {
    if (parsing.length() == 0) {
      throw new ParseException("Unexpected end of string after escape character");
    }
    return referrer.parse(parsing.substring(1), accumulator + (char) parsing.getBytes()[0], parsed, this);
  }
}
