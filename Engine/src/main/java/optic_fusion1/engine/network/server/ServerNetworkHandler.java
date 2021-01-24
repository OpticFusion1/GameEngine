package optic_fusion1.engine.network.server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import static optic_fusion1.engine.game.Game.LOGGER;
import optic_fusion1.engine.network.NetworkHandler;

public abstract class ServerNetworkHandler extends NetworkHandler {

  private ServerSocket socket;
  
  public ServerNetworkHandler(Server server, InetAddress address, int port) {
    super(server);
    setName("Server/ServerNetworkHandler");
    try {
      this.socket = new ServerSocket(port, 0, address);
    } catch (IOException ex) {
      LOGGER.exception(ex);
    }
  }
  
  public ServerSocket getSocket(){
    return socket;
  }

}
