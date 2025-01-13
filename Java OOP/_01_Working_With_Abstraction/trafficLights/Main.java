package _01_Working_With_Abstraction.trafficLights;

import java.util.Arrays;
import java.util.Scanner;

import static _01_Working_With_Abstraction.trafficLights.Signal.printSignals;
import static _01_Working_With_Abstraction.trafficLights.Signal.updateSignal;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read Signals GREEN RED YELLOW...
        Signal[] signals = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Signal::valueOf)
                .toArray(Signal[]::new);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            updateSignal(signals);

            printSignals(signals);
        }

    }
}