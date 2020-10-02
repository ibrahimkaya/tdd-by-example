package guru.springframework;

import java.util.Objects;

/**
 * @Author ibrahim
 * @create 2.10.2020 16:25
 */
public class Money {

    protected int amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money Money = (Money) o;
        return amount == Money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
