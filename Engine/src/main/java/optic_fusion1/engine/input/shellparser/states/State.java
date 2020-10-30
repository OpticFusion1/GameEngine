package optic_fusion1.engine.input.shellparser.states;

import java.util.List;
import optic_fusion1.engine.input.shellparser.ParseException;

public abstract class State {

  public abstract List<String> parse(final String p0, final String p1, final List<String> p2, final State p3) throws ParseException;
}
