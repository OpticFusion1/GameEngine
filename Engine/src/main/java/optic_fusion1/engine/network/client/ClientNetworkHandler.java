package optic_fusion1.engine.network.client;

import java.net.Socket;
import optic_fusion1.engine.network.NetworkHandler;
import optic_fusion1.engine.network.server.Server;
import optic_fusion1.engine.network.server.ServerNetworkHandler;

public abstract class ClientNetworkHandler extends NetworkHandler {

  private Socket socket;
  private ServerNetworkHandler serverNetworkHandler;

  public ClientNetworkHandler(Server server, Socket socket) {
    super(server);
    setName("Server/ClientNetworkHandler");
    this.socket = socket;
    serverNetworkHandler = server.getNetworkHandler();
  }

  public Socket getSocket() {
    return socket;
  }

  public ServerNetworkHandler getServerNetworkHandler() {
    return serverNetworkHandler;
  }

}
