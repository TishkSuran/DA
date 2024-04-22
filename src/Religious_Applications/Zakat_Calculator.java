package Religious_Applications;

import java.util.Scanner;

public class Zakat_Calculator {
    public static void main(String[] args) {
        Zakat_Calculator zakatCalculator = new Zakat_Calculator();
    }

    public Zakat_Calculator() {
        final String ANSI_BOLD = "\u001B[1m";
        final String ANSI_RESET = "\u001B[0m";

        System.out.println("Enter all assets that have been in your possession over a lunar year into the Zakat calculator. This will then give you the total amount of Zakat owed.\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println(ANSI_BOLD + "Gold and Silver" + ANSI_RESET);
        double goldAndSilver = getInput(scanner, "Value of gold & silver you possess: ");

        System.out.println("\n" + ANSI_BOLD + "Money" + ANSI_RESET);
        double moneyInBank = getInput(scanner, "Cash at home & bank accounts: ");
        double otherSavings = getInput(scanner, "Other savings: ");
        double sharesAndInvestments = getInput(scanner, "Investment & share values: ");
        double moneyOwedToUser = getInput(scanner, "Money owed to you: ");

        System.out.println("\n" + ANSI_BOLD + "Business Assets" + ANSI_RESET);
        double stockValue = getInput(scanner, "Stock value: ");

        System.out.println("\n" + ANSI_BOLD + "Short Term Liabilities" + ANSI_RESET);
        double moneyUserOwes = getInput(scanner, "Money you owe: ");
        double otherOutgoings = getInput(scanner, "Other outgoings due: ");

        double netAssets = calculateNetAssets(goldAndSilver, moneyInBank, otherSavings, sharesAndInvestments, moneyOwedToUser, stockValue, moneyUserOwes, otherOutgoings);
        double zakatAmount = calculateZakatAmount(netAssets);

        System.out.println("\nYour Net Assets are: £" + Math.round(netAssets)+ ".");
        if(netAssets < currentNisab()){
            System.out.println("Current Nisab is £427.93, since your net assets are less than this, there is no need to pay Zakat, may God bless you.");
        }
        else {
            System.out.println("The total amount of Zakat you must pay is: £" + Math.round(zakatAmount));
        }
    }

    private double getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private double calculateNetAssets(double goldAndSilver, double moneyInBank, double otherSavings, double sharesAndInvestments, double moneyOwedToUser, double stockValue, double moneyUserOwes, double otherOutgoings) {
        return (goldAndSilver + moneyInBank + otherSavings + sharesAndInvestments + moneyOwedToUser + stockValue) - (moneyUserOwes + otherOutgoings);
    }

    private double calculateZakatAmount(double netAssets) {
        return netAssets * 0.025;
    }

    private double currentNisab() {
        return 427.93;
    }
}
