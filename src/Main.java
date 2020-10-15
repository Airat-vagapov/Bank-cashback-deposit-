public class Main {
    public static void main(String[] args) {
        BankService depositService = new BankService();
        double depositResult = depositService.depositCalculate(1_278_023.89, 4.9);

        BankService cashbackService = new BankService();
        double cashbackResult = cashbackService.cashbackCalculate(
                3_000.0,
                2_000.0,
                1_000.0,
                2.5,
                2.0,
                3.0);

        System.out.println(depositResult);
        System.out.println(cashbackResult);
    }
}
