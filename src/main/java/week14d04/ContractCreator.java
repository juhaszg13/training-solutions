package week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {
    public Contract template;

    public ContractCreator(String client, List<Integer> monthlyPrices) {
        this.template = new Contract(client, monthlyPrices);
    }

    public Contract createContract(String client) {
        //return new Contract(client, new ArrayList<>(template.getMonthlyPrices()));
        return new Contract(template,client);
        //vagy return(template); mindkettő jó
    }

    public Contract getTemplate() {
        return template;
    }

    public static void main(String[] args) {
        ContractCreator cc = new ContractCreator("JohnDoe", new ArrayList<>(List.of(10, 10, 10, 10, 10, 10, 10, 10)));
        Contract john = cc.createContract("John Smith");
        john.getMonthlyPrices().set(1, 20);
        System.out.println(john.getMonthlyPrices());
        System.out.println(cc.getTemplate().getMonthlyPrices());
    }
}
