package _01_Working_With_Abstraction.cardRank;

public enum CardRank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    public static void printCardRank() {
        System.out.println("Card Ranks:");
        for (CardRank cardRank : CardRank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n",
                    cardRank.ordinal(),
                    cardRank);
        }
    }
}
