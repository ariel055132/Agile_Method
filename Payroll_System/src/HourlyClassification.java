import java.util.List;

public class HourlyClassification implements PaymentClassification{

    private double hourlyRate;
    private List<TimeCard> timeCards;

    public HourlyClassification(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void addTimeCard(TimeCard timeCard) {
        timeCards.add(timeCard);
    }

    @Override
    public double calculatePay(PayCheck pc) {
        return 0;
    }
}
