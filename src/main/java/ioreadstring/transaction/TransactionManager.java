package ioreadstring.transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<BankAccount> accountList = new ArrayList<>();


    public void uploadListFromFile(String accountRelativePath) {
        Path accountFile = Path.of(accountRelativePath);
        try {
            List<String> tmp = Files.readAllLines(accountFile);
            for (String s : tmp) {
                String[] accountData = s.split(";");
                accountList.add(new BankAccount(accountData[0], accountData[1], Integer.parseInt(accountData[2])));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not open file", ioe);
        }
    }

    public void makeTransactions(String transactionRelativePath) {
        Path accountFile = Path.of(transactionRelativePath);
        try {
            List<String> tmp = Files.readAllLines(accountFile);
            for (String s : tmp) {
                String[] transactionData = s.split(";");
                for (int i = 0; i < accountList.size(); i++) {

                    if (transactionData[0].equals(accountList.get(i).getAccountNumber())) {
                        accountList.get(i).setBalance(Integer.parseInt(transactionData[1]));
                    }
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not open file", ioe);
        }
    }

    public List<BankAccount> getAccountList() {
        return accountList;
    }
}
