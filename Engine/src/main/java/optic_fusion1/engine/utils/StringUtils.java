package optic_fusion1.engine.utils;

public final class StringUtils {

  private StringUtils() {
  }

  public static String center(String s, int size) {
    return center(s, size, ' ');
  }

  public static String center(String s, int size, char pad) {
    if (s == null || size <= s.length()) {
      return s;
    }

    StringBuilder sb = new StringBuilder(size);
    for (int i = 0; i < (size - s.length()) / 2; i++) {
      sb.append(pad);
    }
    sb.append(s);
    while (sb.length() < size) {
      sb.append(pad);
    }
    return sb.toString();
  }

}
