import java.text.DecimalFormat;
import java.util.Scanner;

public class UseTaxPayers {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        TaxPayer[] taxPayers = new TaxPayer[10];

        for(int i = 0; i < taxPayers.length; i++){
            System.out.println("Enter Social Number: ");
            int ssn = scn.nextInt();

            System.out.println("Enter Yearly Gross Income: ");
            double income = scn.nextDouble();

            taxPayers[i] = new TaxPayer(ssn, income);
        }

        System.out.println("\nSocial Security Number\tYearly Gross Income");
        System.out.println("---------------------------------------------");

        DecimalFormat incomeFormat = new DecimalFormat("#,###.00");

        for(TaxPayer taxPayer : taxPayers){
            System.out.println(taxPayer.getSocialNumber() + "\t\t\t$" + incomeFormat.format(taxPayer.getGrossIncome()));

        }
    }
}
