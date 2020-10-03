package guru.springframework;

import java.util.HashMap;

/**
 * @Author ibrahim
 * @create 2.10.2020 22:51
 */
public class Bank {

    private HashMap<Pair, Integer> rateMap = new HashMap<>();

    Money reduce(Expression source, String toCurrency) {
        return source.reduce(this, toCurrency);
    }

    public int rate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }
        return rateMap.get(new Pair(from, to));
    }

    public void addRate(String from, String to, int rate) {
        rateMap.put(new Pair(from, to), rate);
    }
}
