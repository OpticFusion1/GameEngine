package optic_fusion1.engine.game;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import static optic_fusion1.engine.game.Game.LOGGER;
import optic_fusion1.engine.utils.Utils;

public class GameInfo {

  private String name;
  private String description;
  private String author;
  private String version;

  public void load() {
    LOGGER.info("Loading game info");
    String result = new BufferedReader(new InputStreamReader(Utils.getResource("gameinfo.json"))).lines()
            .parallel().collect(Collectors.joining("\n"));
    JsonObject object = JsonParser.parseString(result).getAsJsonObject();
    name = object.get("name").getAsString();
    description = object.get("description").getAsString();
    author = object.get("author").getAsString();
    version = object.get("version").getAsString();
    LOGGER.info("Finished loading game info");
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String getAuthor() {
    return author;
  }

  public String getVersion() {
    return version;
  }

}
