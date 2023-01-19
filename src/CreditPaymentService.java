public class CreditPaymentService {
    public double calculatorCredit(int amountOfCredit, double percentOfYears, int numberOfYears) {

        double monthlyPercent = percentOfYears / 100 / 12;
        int numberOfMounts = numberOfYears * 12;

        int a = amountOfCredit;
        double i = monthlyPercent;
        int n = numberOfMounts;

        double monthlyPayment = a * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
        return monthlyPayment;
    }
}
