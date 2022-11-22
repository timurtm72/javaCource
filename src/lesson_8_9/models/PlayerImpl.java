package lesson_8_9.models;

import lesson_8_9.interfaces.Card;
import lesson_8_9.interfaces.Player;

import java.util.Scanner;

public class PlayerImpl implements Player {
    Card [] cardsOnHand = new Card[100];
    boolean inGame;
    boolean isCroupier = false;

    String gamerName;

    public PlayerImpl(String gamerName) {
        this.gamerName = gamerName;
    }

    public String getGamerName() {
        return gamerName;
    }

    public void setGamerName(String gamerName) {
        this.gamerName = gamerName;
    }

    @Override
    public void takeCard(Card card) {
        for (int i = 0; i < cardsOnHand.length; i++) {
            if(cardsOnHand[i] == null){
                cardsOnHand[i] = card;
                break;
            }
        }
    }

    @Override
    public int countValuesOfAllCardsOnHand() {
        int count = 0;
        for (Card c :cardsOnHand ) {
            if(c != null) {
                count += c.getValue();
            }
        }
        return count;
    }

    @Override
    public boolean needCard() {
        System.out.println("----------------------Ваши карты----------------------");
        showCardsOnHand();
        System.out.println("Нужна ли Вам еще карта?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer.equals("да")){
            return true;
        }
        return false;
    }

    @Override
    public void showCardsOnHand() {
        System.out.println("Игрок с именем " + getGamerName() + " с картами на руках");
        for (Card card: cardsOnHand) {
            if(card != null) {
                card.printCard();
            }
        }
        System.out.println("Сумма карт : " + countValuesOfAllCardsOnHand());
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public boolean isCroupier() {
        return isCroupier;
    }

    public void setCroupier(boolean croupier) {
        isCroupier = croupier;
    }

}
