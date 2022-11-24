package lesson_8.models;

public class CroupierBJ extends PlayerImpl {
    public CroupierBJ(String gamerName) {
        super(gamerName);
    }

    @Override
    public boolean needCard() {
        return countValuesOfAllCardsOnHand() <= 17;
    }

    @Override
    public boolean isCroupier() {
        return true;
    }
}
