package guru.springframework;

import java.util.Objects;

/**
 * @Author ibrahim
 * @create 1.10.2020 20:00
 */


public class Dollar {

    private int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier){
         return new Dollar( amount*multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
