package lesson_8.interfaces;

import lesson_8.models.PlayerImpl;

public interface GameBJ {
    void addPlayerInGame(PlayerImpl player);// Добавить игрока в игру.

    void giveTwoCardsOnHand();// Раздача 2 карт на старте.

    void giveOneCardIfNeedToPlayer();// д=Давать доп. карту игроку, если ему нужно.

    void printWinner();// Объявлять победителя.

    void showAllCards();

}
