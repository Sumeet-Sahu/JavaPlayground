package logical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctPairs {


    public static void main(String[] args) {
        List<Long> numbers = new ArrayList<>();
        numbers.add(1l);
        numbers.add(3l);
        numbers.add(46l);
        numbers.add(1l);
        numbers.add(3l);
        numbers.add(9l);
        System.out.println(countDistinctPairs(numbers, 47l));
    }

    private static long countDistinctPairs(List<Long> numbers, Long sum) {
        Set<Pair> distinctPairs = new HashSet<>();
        for (int i = 0; i < numbers.size(); i++)
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == sum) {
                    Pair pair = new Pair(numbers.get(i), numbers.get(j));
                    distinctPairs.add(pair);
                }
            }
        return distinctPairs.size();
    }

}

class Pair implements Comparable {
    Long i;
    Long j;

    public Pair(Long i, Long j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public int hashCode() {
        return 31 * 31;
    }

    @Override
    public boolean equals(Object obj) {
        Pair that = null;
        if (obj instanceof Pair) {
            that = (Pair) obj;
        }
        return (this.i == that.i && this.j == that.j) || (this.j == that.i && this.i == that.j);
    }

    @Override
    public int compareTo(Object obj) {
        Pair that = null;
        if (obj instanceof Pair) {
            that = (Pair) obj;
        }
        if ((this.i == that.i && this.j == that.j) || (this.j == that.i && this.i == that.j))
            return 0;
        return -1;
    }
}
