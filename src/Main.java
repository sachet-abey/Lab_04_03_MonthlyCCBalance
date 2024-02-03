public class Main {
    public static void main(String[] args) {
        double balance = 5000.00; // Initialize initial credit card balance of $5000
        double interestRate = 17; // Initialize interest rate of 17% or 17/100
        double interestOneMonth = balance * interestRate/100; // Calculate interest after one month by multiplying balance by interest rate
        balance += interestOneMonth; // Add interest after one month to balance
        double interestTwoMonths = interestOneMonth + (balance * interestRate/100); // Calculate interest after one month by multiplying the new balance by interest rate and adding that to interest after one month because interest is compounded
        System.out.println("A credit card has an initial balance of $5000. The interest after one month is $"+interestOneMonth+" and the interest after two months is $"+interestTwoMonths);
    }
}