package lesson_8_9.interfaces;

import lesson_8_9.models.GameBJImpl;
import lesson_8_9.models.PlayerImpl;

public interface GameBJ {
    void addPlayerInGame(PlayerImpl player);// Добавить игрока в игру.

    void giveTwoCardsOnHand();// Раздача 2 карт на старте.

    void giveOneCardIfNeedToPlayer();// д=Давать доп. карту игроку, если ему нужно.

    void printWinner();// Объявлять победителя.

    void showAllCards();

}
