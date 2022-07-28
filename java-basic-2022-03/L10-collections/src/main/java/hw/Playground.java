package hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playground {
    public static void main(String[] args) {
        Client client1 = new Client(1L, "Mikhail", 20);
        Account account1 = new Account(1L, 10L);
        List<Account> accList1 = new ArrayList<>();
        accList1.add(account1);

        Client client2 = new Client(2L, "Mikhail", 30);
        Account account2 = new Account(2L, 20L);
        Account account3 = new Account(3L, 30L);
        List<Account> accList2 = new ArrayList<>();
        accList2.add(account2);
        accList2.add(account3);

        Map<Client, List<Account>> clients = new HashMap<>();
        Map<Account, Client> accounts = new HashMap<>();

        clients.put(client1, accList1);
        clients.put(client2, accList2);
        accounts.put(account1, client1);
        accounts.put(account2, client2);
        accounts.put(account3, client2);

        Bank bank = new Bank(clients, accounts);

        System.out.println(bank.findClient(account1));
        System.out.println(bank.getClientAccounts(client2));
        System.out.println();

        Account account4 = new Account(1L, 10L);
        System.out.println(bank.findClient(account4));
        Account account5 = new Account(1L, 15L);
        System.out.println(bank.findClient(account5));
        System.out.println();

        Client client3 = new Client(2L, "Mikhail", 30);
        System.out.println(bank.getClientAccounts(client3));
        Client client4 = new Client(2L, "Mikhail", 35);
        System.out.println(bank.getClientAccounts(client4));
    }
}
