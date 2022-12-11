import menu.*;

import java.util.Scanner;
public class Credit {
    private static int choose;
    EarlyLoanRepayment earlyLoanRepayment = new EarlyLoanRepayment();
    LoanSearch loanSearch = new LoanSearch();
    ListLoan listLoans = new ListLoan();
    SetProposal setProposal = new SetProposal();
    Scanner sc = new Scanner(System.in);

    public void printMenu(){
        System.out.println("1.Пропозиції по кредитам" +
                "\n2. Дострокове погашення кридиту" +
                "\n3. Пошук кредита за певними параметрами" +
                "\n4.Ваші кредити" +
                "\n5.Вихід");
    }

    public void selectItem() throws Exception {

        choose = sc.nextInt();
        if (choose < 0 || choose > 5) {
            System.out.println("Такої операції не існує");
        }

        switch (choose) {
            case 1 -> setProposal.execute();
            case 2 -> earlyLoanRepayment.execute();
            case 3 -> loanSearch.execute();
            case 4 -> listLoans.execute();
            case 5 -> System.exit(0);
        }
    }
}