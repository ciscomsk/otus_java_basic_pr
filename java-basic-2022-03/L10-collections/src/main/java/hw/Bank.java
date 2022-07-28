package hw;

import java.util.List;
import java.util.Map;

public class Bank {
    private Map<Client, List<Account>> clients;
    private Map<Account, Client> accounts;

    public Bank(
            Map<Client, List<Account>> clients,
            Map<Account, Client> accounts
            ) {
        this.clients = clients;
        this.accounts = accounts;
    }

    public Map<Client, List<Account>> getClients() {
        return clients;
    }

    public Map<Account, Client> getAccounts() {
        return accounts;
    }

    public void setClients(Map<Client, List<Account>> clients) {
        this.clients = clients;
    }

    public void setAccounts(Map<Account, Client> accounts) {
        this.accounts = accounts;
    }

    public Client findClient(Account account) {
        return accounts.get(account);
    }

    public List<Account> getClientAccounts(Client client) {
        return clients.get(client);
    }
}
