package _03_Sets_And_Maps_Advanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> symbols = new TreeMap<>();

        for (int index = 0; index <= text.length() - 1; index++) {
            char currentSymbol  = text.charAt(index);
            if (!symbols.containsKey(currentSymbol)) {
                symbols.put(currentSymbol, 1);
            } else {
                int currentCount = symbols.get(currentSymbol);
                symbols.put(currentSymbol, currentCount + 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");
        }

    }
}
