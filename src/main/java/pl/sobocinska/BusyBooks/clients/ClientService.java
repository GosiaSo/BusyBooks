package pl.sobocinska.BusyBooks.clients;


import java.util.List;

public interface ClientService {
    List<Client> findClients();
    Client findClientById(Long id);
    void createClient(Client client);
    void editClient(Client client);
    void deleteClient(Long id);
}
