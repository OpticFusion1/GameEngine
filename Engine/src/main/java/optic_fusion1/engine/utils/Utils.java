package optic_fusion1.engine.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import optic_fusion1.engine.game.Game;
import static optic_fusion1.engine.game.Game.LOGGER;

public final class Utils {

  private Utils() {
  }

  public static void copy(String resource, String destination) {
    InputStream ddlStream = Game.class.getClassLoader().getResourceAsStream(resource);
    if (ddlStream == null) {
      LOGGER.warn("The resource '" + resource + " can not be found");
      return;
    }
    try (FileOutputStream fos = new FileOutputStream(destination)) {
      byte[] buf = new byte[2048];
      int r;
      while (-1 != (r = ddlStream.read(buf))) {
        fos.write(buf, 0, r);
      }
    } catch (FileNotFoundException ex) {
      LOGGER.exception(ex);
    } catch (IOException ex) {
      LOGGER.exception(ex);
    }
  }

  public static void saveResource(File dataFolder, String resourcePath, boolean replace) {
    if (resourcePath == null || resourcePath.isEmpty()) {
      throw new IllegalArgumentException("resourcePath can not be null or empty");
    }
    if (dataFolder == null || resourcePath.isEmpty()) {
      throw new IllegalArgumentException("dataFolder can not be null or empty");
    }

    resourcePath = resourcePath.replace('\\', '/');
    InputStream in = getResource(resourcePath);
    if (in == null) {
      LOGGER.warn("The embedded resource '" + resourcePath + " can not be found");
      return;
    }
    File outFile = new File(dataFolder, resourcePath);
    int lastIndex = resourcePath.lastIndexOf('/');
    File outDir = new File(dataFolder, resourcePath.substring(0, lastIndex >= 0 ? lastIndex : 0));

    if (!outDir.exists()) {
      outDir.mkdirs();
    }

    try {
      if (!outFile.exists() || replace) {
        try (OutputStream out = new FileOutputStream(outFile)) {
          byte[] buf = new byte[1024];
          int len;
          while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
          }
        }
        in.close();
      } else {
        LOGGER.warn("Could not save " + outFile.getName() + " to " + outFile + " because " + outFile.getName() + " already exists");
      }
    } catch (IOException ex) {
      LOGGER.severe("Could not save " + outFile.getName() + "  to " + outFile);
      LOGGER.exception(ex);
    }
  }

  public static InputStream getResource(String fileName) {
    if (fileName == null || fileName.isEmpty()) {
      throw new IllegalArgumentException("fileName can not be null or empty");
    }
    InputStream input = Game.class.getClassLoader().getResourceAsStream(fileName);
    if (input == null) {
      LOGGER.warn("The resource '" + fileName + "' can not be found");
      return null;
    }
    return input;
  }

  public static InputStream getInputStreamFromUrl(final String link) throws MalformedURLException, ProtocolException, IOException {
    final URL url = new URL(link);
    final HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
    conn.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
    conn.setRequestMethod("GET");
    return conn.getInputStream();
  }

  public static void clearScreen() {
    try {
      if (System.getProperty("os.name").contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } else {
        Runtime.getRuntime().exec("clear");
      }
    } catch (IOException | InterruptedException ex) {
      System.out.println();
    }
  }

}
