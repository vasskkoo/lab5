package menu;

import command.Command;

public class LoanSearch extends Command {
    public void execute() throws Exception {
        System.out.println("Веддіть назву банку ");
        System.out.println("Введіть суму ");
        System.out.println("Введіть відсоток річних");
        System.out.print("з ");
        System.out.print("до ");
    }
}