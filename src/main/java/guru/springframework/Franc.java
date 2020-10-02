package guru.springframework;

import java.util.Objects;

/**
 * @Author ibrahim
 * @create 2.10.2020 16:01
 */
public class Franc {
    private int amount;
    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier){
        return new Franc( amount*multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Franc Franc = (Franc) o;
        return amount == Franc.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
