package optic_fusion1.engine.network.client;

import java.net.Socket;
import java.util.UUID;
import optic_fusion1.engine.network.server.Server;

public abstract class Client {

  private Server server;
  private Socket socket;
  private String userName;
  private UUID uuid;

  public Client(Server server, Socket socket) {
    this.server = server;
    this.socket = socket;
  }

  public UUID getUniqueId() {
    return uuid;
  }

  public void getUniqueId(UUID uuid) {
    this.uuid = uuid;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Server getServer() {
    return server;
  }

  public Socket getSocket() {
    return socket;
  }

}
