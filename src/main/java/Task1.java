import javafx.util.Pair;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {

        String ticket1 = "568946";

        System.out.println(isLuckyTicket(ticket1));
    }

    public static boolean isLuckyTicket(String ticket) {
        return  IntStream.range(0, ticket.length())
                .map(i -> (i <= 2 ? 1 : -1) * Character.getNumericValue(ticket.charAt(i)))
                .sum() == 0;
    }
}