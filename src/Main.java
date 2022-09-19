public class Main {
    public static void main(String[] args) {
        double balance = 5000;
        double oneMonth = balance + (balance * 0.17);
        double twoMonth = balance * (1.17 * 1.17);
        System.out.println("Your initial total is $" + balance + " your total after one month without payment would be $" + oneMonth + " at two months it would be $" + twoMonth);
    }
}