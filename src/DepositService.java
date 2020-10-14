public class DepositService {
    double depositCalculate(double sum, double percent) {
        double profit = (percent * sum) / 100.0;
        return profit;
    }
}
