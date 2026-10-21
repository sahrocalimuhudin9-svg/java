package assigment;

public class ExpressDelivery extends RegularDelivery {

    public ExpressDelivery(int distances, int weight) {
        super(distances, weight);
    }

    @Override
    public long calculateFee() {
        return 25 + (4 * distances) + (2 * weight);
    }
}