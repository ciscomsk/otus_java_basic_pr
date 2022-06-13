package hw.v2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
public class Bank {
    private Map<Client, List<Account>> clients;
    private Map<Account, Client> accounts;
    public Client findClient(Account account) {
        return accounts.get(account);
    }
    public List<Account> getClientAccounts(Client client) {
        return clients.get(client);
    }
}
