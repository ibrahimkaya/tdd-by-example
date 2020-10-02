package guru.springframework;

/**
 * @Author ibrahim
 * @create 1.10.2020 20:00
 */

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount,currency);
    }

    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
