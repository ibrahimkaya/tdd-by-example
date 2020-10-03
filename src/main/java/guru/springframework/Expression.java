package guru.springframework;

/**
 * @Author ibrahim
 * @create 2.10.2020 22:48
 */
public interface Expression {
    Money reduce(Bank bank, String to);
    Expression times(int multiplier);

}
