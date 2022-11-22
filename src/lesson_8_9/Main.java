package lesson_8_9;

import lesson_8_9.interfaces.GameBJ;
import lesson_8_9.models.CroupierBJ;
import lesson_8_9.models.GameBJImpl;
import lesson_8_9.models.PlayerImpl;

public class Main {
    public static void main(String[] args) {
        // 1. Создать класс игру, в которой у нас происходит игра.
        // 2. Создаем игроков.
        // 3. Создаем крупье.
        // 4. Добавить игроков и крупье в игру.
        // 5. Добавить колоду карт.
        // 6. Добавить карты в колоду.
        // 7. Раздать каждоиму игроку по 2 карты на старте.
        // 8. Раздавать каждому игроку по одной карте, пока это требуется.
        // 9. Определить победителя.

        // 1. Создать класс игру, в которой у нас происходит игра.
        GameBJImpl gameBJ = new GameBJImpl();
        // 2. Создаем игроков.
        PlayerImpl player1 = new PlayerImpl("Костя");
        PlayerImpl player2 = new PlayerImpl("Лена");
        // 3. Создаем крупье.
        CroupierBJ croupierBJ = new CroupierBJ("Антон крупье");
        // 4. Добавить игроков и крупье в игру.
        gameBJ.addPlayerInGame(player1);
        gameBJ.addPlayerInGame(player2);
        gameBJ.addPlayerInGame(croupierBJ);
        // 5. Добавить колоду карт.
        // 6. Добавить карты в колоду.
        // 7. Раздать каждоиму игроку по 2 карты на старте.
        gameBJ.giveTwoCardsOnHand();
        // 8. Раздавать каждому игроку по одной карте, пока это требуется.
        gameBJ.giveOneCardIfNeedToPlayer();
        // 9. Определить победителя.
        gameBJ.printWinner();

        gameBJ.showAllCards();

    }
}
