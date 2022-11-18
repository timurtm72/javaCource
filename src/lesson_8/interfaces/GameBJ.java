package lesson_8.interfaces;

public interface GameBJ {
    void addPlayerInGame(Player player);// Добавить игрока в игру.

    void giveTwoCardsOnHand();// Раздача 2 карт на старте.

    void giveOneCardIfNeedToPlayer();// д=Давать доп. карту игроку, если ему нужно.

    void printWinner();// Объявлять победителя.
}
