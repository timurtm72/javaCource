package lesson_8_9.models;

import lesson_8_9.interfaces.GameBJ;

public class GameBJImpl implements GameBJ {
    PlayerImpl[] playersInGame = new PlayerImpl[3];
    DeckOfCardsImpl deckOfCards = new DeckOfCardsImpl();

    @Override
    public void addPlayerInGame(PlayerImpl player) {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] == null) {
                playersInGame[i] = player;
                break;
            }
        }
    }

    @Override
    public void giveTwoCardsOnHand() {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] != null) {
                playersInGame[i].takeCard(deckOfCards.randomCards());
                playersInGame[i].takeCard(deckOfCards.randomCards());
            }
        }
    }

    @Override
    public void giveOneCardIfNeedToPlayer() {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] != null) {
                while (playersInGame[i].needCard()) {
                    playersInGame[i].takeCard(deckOfCards.randomCards());
                }
            }
        }
    }



    @Override
    public void printWinner() {
        int bestValue = 0, countBestValues = 0, count = 0;
        int[] winnerPlayer = new int[100];
        // 1. Проход по всему массиву игроков в игре и включение всех игроков у кого больше 21.
        for (PlayerImpl player : playersInGame) {
            if (player != null) {
                if (player.countValuesOfAllCardsOnHand() > 21) {
                    player.setInGame(false);
                } else {
                    player.setInGame(true);
                }
            }
        }

        for (PlayerImpl player : playersInGame) {
            if (player != null && player.isInGame()) {
                if (bestValue < player.countValuesOfAllCardsOnHand()) {
                    bestValue = player.countValuesOfAllCardsOnHand();
                }
            }
        }
        for (PlayerImpl player : playersInGame) {
            if (player != null && player.isInGame()) {
                if (player.countValuesOfAllCardsOnHand() == bestValue) {
                    winnerPlayer[countBestValues] = count;
                    countBestValues++;
                }
            }
            count++;
        }
        System.out.println("-------------------------------------------");
        if (countBestValues == 0) {
            System.out.println("Никто не победил...");
        } else if (countBestValues == 1) {
            System.out.println("Победил игрок : " + playersInGame[winnerPlayer[0]].getGamerName());
            playersInGame[winnerPlayer[0]].showCardsOnHand();
        } else if (countBestValues > 1) {
            System.out.println("Ничья у " + countBestValues + " игроков...");
        }
    }

    @Override
    public void showAllCards() {
        System.out.println("-------------------------------------------");
        for (PlayerImpl pIngames: playersInGame) {
            if(pIngames != null) {
                pIngames.showCardsOnHand();
            }
        }
    }

    public int countPlayersInGame() {
        int countPLayers = 0;
        for (PlayerImpl player : playersInGame) {
            if (player != null && player.isInGame()) {
                countPLayers++;
            }
        }
        return countPLayers;
    }
}
