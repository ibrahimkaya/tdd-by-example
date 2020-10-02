package guru.springframework;

/**
 * @Author ibrahim
 * @create 2.10.2020 16:01
 */
public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
