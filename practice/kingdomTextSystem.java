package practice;

public class kingdomTextSystem {
    public static void main(String[] args) {

    
        double[] income = {800, 1200, 4500, 6000, 300, 1000, 52000, 75000, 20000, 9000};

        double totalTax = 0;

        for (int i = 0; i < income.length; i++) {

            double tax = 0;
            String bracket = "";

            if (income[i] < 10000) {
                tax = income[i] * 0.05;
                bracket = "5% (Low Income)";
            }
            else if (income[i] <= 50000) {
                tax = income[i] * 0.15;
                bracket = "15% (Middle Income)";
            }
            else {
                tax = income[i] * 0.30;
                bracket = "30% (High Income)";
            }

            totalTax += tax;

            System.out.println("Citizen " + (i + 1));
            System.out.println("Income  : " + income[i]);
            System.out.println("Bracket : " + bracket);
            System.out.println("Tax     : " + tax);
            System.out.println("  ");
        }

        System.out.println("TOTAL TAX COLLECTED: " + totalTax);
    }
}
