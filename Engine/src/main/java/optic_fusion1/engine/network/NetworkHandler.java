package optic_fusion1.engine.network;

import optic_fusion1.engine.network.server.Server;

public abstract class NetworkHandler extends Thread {

  private Server server;
  
  public NetworkHandler(Server server){
    this.server = server;
  }
  
  @Override
  public abstract void run();

  public Server getServer(){
    return server;
  }
  
}
