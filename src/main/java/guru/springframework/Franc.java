package guru.springframework;

/**
 * @Author ibrahim
 * @create 2.10.2020 16:01
 */
public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
