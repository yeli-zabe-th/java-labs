package src.main.java.lab5;

import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args){

        //welcome message
        System.out.println("Welcome to Blackjack!");

        //create a new playing deck
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffle();
        //create a deck for the player
        Deck playerDeck = new Deck();
        //create a deck for the dealer
        Deck dealerDeck = new Deck();

        double playerMoney = 100.00;

        Scanner userInput = new Scanner(System.in);

        //game loop
        while(playerMoney > 0){
            //start the game
            //take the players bet
            System.out.println("you have $" + playerMoney + ", how much would you like to bet?");
            double playerBet = userInput.nextDouble();
            if (playerBet>playerMoney){
                System.out.println("You cannot bet more that you have. Please leave.");
                break;
            }

            boolean endRound = false;

            //start dealing
            //player gets 2 cards
            playerDeck.draw(playingDeck);
            playerDeck.draw(playingDeck);

            //dealer gets 2 cards
            dealerDeck.draw(playingDeck);
            dealerDeck.draw(playingDeck);

            while(true){
                System.out.println("Your hand:");
                System.out.println(playerDeck.toString());
                System.out.println("Your hand is valued at: " + playerDeck.cardsValue());

                //display dealer hand
                System.out.println("Dealer's Hand: " + dealerDeck.getCard(0).toString()+ " and [hidden]");

                //what does the player want to do
                System.out.println("Would you like to (1)Hit or (2) Stand?");
                int response = userInput.nextInt();

                //hit
                if(response ==1){
                    playerDeck.draw(playingDeck);
                    System.out.println("You draw a:" + playerDeck.getCard(playerDeck.deckSize()-1).toString());
                    //bust if over 21
                    if(playerDeck.cardsValue()>21){
                        System.out.println("Bust. Currently valued at:"+playerDeck.cardsValue());
                        playerMoney -= playerBet;
                        endRound = true;
                        break;
                    }
                }
                //stand
                if(response==2){
                    break;
                }
            }

            //reveal dealer cards
            System.out.println("Dealer's cards:" + dealerDeck.toString());
            //see if dealer has more points than player
            if((dealerDeck.cardsValue()<playerDeck.cardsValue())&& endRound==false){
                System.out.println("Dealer wins the hand!");
                playerMoney-=playerBet;
                endRound=true;
            }
            //dealer draws at 16, stand at 17
            while((dealerDeck.cardsValue()<17)&& endRound==false){
                dealerDeck.draw(playingDeck);
                System.out.println("Dealer draws: "+dealerDeck.getCard(dealerDeck.deckSize()-1).toString());
            }

            //display total value for dealer
            System.out.println("Dealer's hand is valued at: " + dealerDeck.cardsValue());
            //determine if dealer busted
            if ((dealerDeck.cardsValue()>21)&&endRound==false){
                System.out.println("You win the hand!");
                playerMoney+=playerBet;
                endRound=true;
            }

            //determine if push
            if((playerDeck.cardsValue()==dealerDeck.cardsValue())&& endRound==false){
                System.out.println("Push.");
                endRound=true;
            }

            if((playerDeck.cardsValue()>dealerDeck.cardsValue())&&endRound==false){
                System.out.println("You win the hand!");
                playerMoney+=playerBet;
                endRound=true;
            }

            if(endRound==false){
                System.out.println("You lose the hand...");
                playerMoney-=playerBet;
                endRound=true;
            }

            playerDeck.moveAllToDeck(playingDeck);
            dealerDeck.moveAllToDeck(playingDeck);
            System.out.println("End of hand.");
        }

        System.out.println("Game over! You are out of money :(");
    }
}
