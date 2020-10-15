public class BankService {

        double depositCalculate(double sum, double percent) {
            double profit = (percent * sum) / 100.0;
            return profit;
        }

        double cashbackCalculate(

                double expensesRegular,
                double expensesIncreased,
                double expensesSpecialOffer,

                double cashbackPercentRegular,
                double cashbackPercentIncreased,
                double cashbackPercentSpecialOffer
        ) {

            double cashbackRegular = expensesRegular * cashbackPercentRegular / 100;
            double cashbackIncreased = expensesIncreased * cashbackPercentIncreased / 100;
            double cashbackSpecialOffer = expensesSpecialOffer * cashbackPercentSpecialOffer / 100;

            double cashbackSum = cashbackRegular + cashbackIncreased + cashbackSpecialOffer;

            double limit = 3_000.00;
            if (cashbackSum > limit) {
                cashbackSum = limit;
            }

            return cashbackSum;
        }
    }


