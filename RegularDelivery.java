package assigment;

public class RegularDelivery extends Delivery {

    public RegularDelivery(int distances, int weight) {
        super(distances, weight);
    }

    @Override
    public long calculateFee() {
        return 10 + (2 * distances) + weight;
    }
}