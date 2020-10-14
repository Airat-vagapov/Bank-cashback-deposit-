public class Main {
    public static void main(String[] args) {
        DepositService depositService = new DepositService();
        double depositResult = depositService.depositCalculate(1_278_023.89, 4.9);

        CashbackService cashbackService = new CashbackService();
        double cashbackResult = cashbackService.cashbackCalculate(
                3000.0,
                2000.0,
                1000.0,
                2.5,
                2.0,
                3.0);

        System.out.println(depositResult);
        System.out.println(cashbackResult);
    }
}
