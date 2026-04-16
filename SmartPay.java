import java.util.Scanner;

interface Billable {
    double calculateTotal(int units);
}

public class SmartPay implements Billable {

    public double calculateTotal(int units) {
        double total = 0;

        if (units <= 100) {
            total = units * 1.0;
        } else if (units <= 300) {
            total = (100 * 1.0) + ((units - 100) * 2.0);
        } else {
            total = (100 * 1.0) + (200 * 2.0) + ((units - 300) * 5.0);
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartPay obj = new SmartPay();

        while (true) {
            System.out.println("\n===== SmartPay Utility Bill =====");
            System.out.print("Enter Customer Name (or type Exit): ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("Exit")) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.print("Enter Previous Meter Reading: ");
            int prev = sc.nextInt();

            System.out.print("Enter Current Meter Reading: ");
            int curr = sc.nextInt();

            sc.nextLine();

            if (prev > curr) {
                System.out.println("❌ Error: Previous reading cannot be greater than current reading!");
                continue;
            }

            int units = curr - prev;

            double total = obj.calculateTotal(units);

            double tax = total * 0.10;
            double finalAmount = total + tax;

            System.out.println("\n----- Digital Receipt -----");
            System.out.println("Customer Name : " + name);
            System.out.println("Units Consumed: " + units);
            System.out.println("Bill Amount   : $" + total);
            System.out.println("Tax (10%)     : $" + tax);
            System.out.println("Final Total   : $" + finalAmount);
            System.out.println("---------------------------");
        }

        sc.close();
    }
}