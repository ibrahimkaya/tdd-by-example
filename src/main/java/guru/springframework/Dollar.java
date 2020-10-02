package guru.springframework;

/**
 * @Author ibrahim
 * @create 1.10.2020 20:00
 */

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
