package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Ethan Dafoe Jan 28, 2023
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        Boolean flag = false;
        Boolean found = false;
        Card userCard = new Card();
        //loop to generate 7 random cards
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //generate a value from 1-13
            card.setValue(rand.nextInt(13) + 1);
            //generate a number from 1-4 and assign it a suit
            card.setSuit(Card.SUITS[rand.nextInt(4)]);
            hand[i] = card;
        }
        //loop to prompt to check for proper user input
        while(!flag){
            System.out.println("Please enter the value of a card (1-10, 11 = jack, 12 = queen, etc.): ");
            int userVal = input.nextInt();
            //check if the value is between 1-13
            if (userVal > 0 && userVal < 14){
                System.out.println("Please enter the value of a suit (1 = hearts, 2 = diamonds, 3 = spades, and 4 = clubs): ");
                int userSuit = input.nextInt();
                //switch to check if the suit is 1-4 and to set it
                switch(userSuit-1) {
                    case 0:
                        userCard.setValue(userVal);
                        userCard.setSuit(Card.SUITS[userSuit-1]);
                        flag = true;
                        break;
                    case 1:
                        userCard.setValue(userVal);
                        userCard.setSuit(Card.SUITS[userSuit-1]);
                        flag = true;
                        break;
                    case 2:
                        userCard.setValue(userVal);
                        userCard.setSuit(Card.SUITS[userSuit-1]);
                        flag = true;
                        break;
                    case 3:
                        userCard.setValue(userVal);
                        userCard.setSuit(Card.SUITS[userSuit-1]);
                        flag = true;
                        break;
                    default:
                        System.out.println("Please pick a viable number");
                }
            }
            else {
                System.out.println("Please enter a viable number");
            }
        }
        //loop to check if the user's card matches a card in the hand
        for (int i = 0; i < hand.length; i++) {
            int hVal = hand[i].getValue();
            int uVal = userCard.getValue();
            String hSuit = hand[i].getSuit();
            String uSuit = userCard.getSuit();
            if (hVal == uVal && hSuit.equals(uSuit)) {
                found = true;
            }
        }
            
        
        //print info if there is a match, print message if there is not.
        if (found == true) {
            printInfo();
        } else {
            System.out.println("Your card is not in the hand.");
        }      
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
    }

}
