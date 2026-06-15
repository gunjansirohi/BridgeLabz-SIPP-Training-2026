package practice;
public class Ravi {
    public static void main(String[] args) {

        
        String name = "Ravi";
        int age = 25;
        char rank = 'A';
        double salary = 50000;
        float membershipFee = 1500.50f;

       
        double bonus = salary * 0.12;

      
        int intBonus = (int) bonus;

        System.out.println("================================");
        System.out.println("      CODING GUILD WELCOME      ");
        System.out.println("================================");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : " + salary);
        System.out.println("Membership Fee : " + membershipFee);
        System.out.println("Annual Bonus   : " + intBonus);
        System.out.println("================================");
    }
}