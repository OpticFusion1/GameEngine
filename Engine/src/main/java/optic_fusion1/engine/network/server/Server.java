package optic_fusion1.engine.network.server;

import optic_fusion1.engine.network.client.ClientManager;

public abstract class Server {

  private static final ClientManager CLIENT_MANAGER = new ClientManager();
  private ServerNetworkHandler networkHandler;
  private boolean running;

  public Server(ServerNetworkHandler networkHandler) {
    this.networkHandler = networkHandler;
  }

  public abstract void startServer();

  public abstract void stopServer();

  public ClientManager getClientManager() {
    return CLIENT_MANAGER;
  }

  public ServerNetworkHandler getNetworkHandler() {
    return networkHandler;
  }

  public void setRunning(boolean isRunning) {
    this.running = isRunning;
  }

  public boolean isRunning() {
    return running;
  }

}
