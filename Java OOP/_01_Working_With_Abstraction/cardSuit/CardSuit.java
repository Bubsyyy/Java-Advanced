package _01_Working_With_Abstraction.cardSuit;

public enum CardSuit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;

    public static void printCardSuits() {
        System.out.println("Card Suits:");
        for (CardSuit cardSuit : CardSuit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n",
                    cardSuit.ordinal(),
                    cardSuit);
        }
    }
}
