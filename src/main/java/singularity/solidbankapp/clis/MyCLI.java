package singularity.solidbankapp.clis;

import singularity.solidbankapp.domain.AccountType;

import java.util.Scanner;

public class MyCLI implements CLIUI{
    private Scanner scan;

    private String type;

    public Scanner getScanner() {
        return scan;
    }

    MyCLI() {
        this.scan = new Scanner(System.in);
    }

    public MyCLI(Scanner scanner) {
        this.scan = scanner;
    }

    public double requestClientAmount() {
        return 0.0;
    }

    public String requestClientAccountNumber() {
        return "";
    }

    public AccountType requestAccountType() {
        type = scan.nextLine();
        if (!AccountType.CHECKING.toString().equals(type) && !AccountType.SAVING.toString().equals(type) && !AccountType.FIXED.toString().equals(type)) {
            System.out.println("Bank account NOT created");
            return null;
        }
        return AccountType.valueOf(type);
    }

    public void setAccountType(String type) {
        this.type = type;
    }
}
