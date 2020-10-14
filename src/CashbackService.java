public class CashbackService {
    double cashbackCalculate(
//          Расходы по категориям
            double expensesRegular,
            double expensesIncreased,
            double expensesSpecialOffer,
//          Проценты кэшбека по категориям
            double cashbackPercentRegular,
            double cashbackPercentIncreased,
            double cashbackPercentSpecialOffer
            ) {
//      Расчет суммы кэшбека по каждой категории
        double cashbackRegular = expensesRegular * cashbackPercentRegular / 100;
        double cashbackIncreased = expensesIncreased * cashbackPercentIncreased / 100;
        double cashbackSpecialOffer = expensesSpecialOffer * cashbackPercentSpecialOffer /100;

//      Расчет общей суммы кэшбека
        double cashbackSum = cashbackRegular + cashbackIncreased + cashbackSpecialOffer;

//      Условие по ограничению суммы кэшбека
        double limit = 3_000.00;
        if (cashbackSum > limit) {
            cashbackSum = limit;
        }

        return cashbackSum;
    }
}
