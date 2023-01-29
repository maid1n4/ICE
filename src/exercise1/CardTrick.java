package exercise1;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant May 2020
 * @author Mai Dinh Jan 28, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        int[] randomValue = new int[7];
        int[] randomSuit = new int[7];
        int[] hc = new int[7];
        
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            
            randomValue[i]= (int)(Math.random()*12)+1;
            card.setValue(randomValue[i]);
            System.out.print("Value: "+randomValue[i]+"; ");
            
            randomSuit[i]= (int)(Math.random()*3)+0;
            card.setSuit(Card.SUITS[randomSuit[i]]);
            System.out.println("Suit: "+randomSuit[i]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        Scanner input = new Scanner(System.in);
        
        System.out.println("Input any card value from 1-13: ");
        int valueInput = input.nextInt();
        System.out.println("Input any suit from 0-3: ");
        int suitInput = input.nextInt();
        
        Card cardInput = new Card();
        cardInput.setValue(valueInput);
        cardInput.setSuit(Card.SUITS[suitInput]);
        int hcInput = cardInput.hashCode();
        input.close();

        
        for(int s = 0; s < hand.length; s++){
            hc[s]=hand[s].hashCode();    
            if (hc[s]==hcInput){
                printInfo();
            }
            else{
                System.out.println("Wrong");
            }
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Mai");
        System.out.println();
        
        System.out.println("My ambitions this semester:");
        System.out.println("-- Have good grades");
        System.out.println("-- Have very good grades");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Painting");
        System.out.println("-- Cooking");
        System.out.println("-- Playing games");
        System.out.println("-- Learning");

        System.out.println();
        
    
    }

}
