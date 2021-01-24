package optic_fusion1.engine.network.client;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

public class ClientManager {

  private static final HashMap<UUID, Client> CLIENTS = new HashMap<>();

  public Collection<Client> getClients() {
    return Collections.unmodifiableCollection(CLIENTS.values());
  }

  public Client getClientWithUUID(UUID uuid) {
    return CLIENTS.get(uuid);
  }

  public void addClient(Client client) {
    CLIENTS.put(client.getUniqueId(), client);
  }

  public void removeClient(UUID uniqueId) {
    CLIENTS.remove(uniqueId);
  }

}
