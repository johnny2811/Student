/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Johny Luu 
 * Jan 29, 2021
 */
import java.util.Scanner;
public class CardTrick {

    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        boolean answer = false;
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13) + 1);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Card value 1-13: ");
        int userCardValue = sc.nextInt();
        
        System.out.print("Enter a Card suit 0-3 0=Hearts 1=Diamonds 2=Spades 3= Clubs: ");
        int userCardSuit = sc.nextInt();
        
        //create user's card
        Card userCard = new Card();
        userCard.setSuit(Card.SUITS[userCardSuit]);
        userCard.setValue(userCardValue);
        
        System.out.println("Here is your card parameters.");
        System.out.println(userCard.getValue());
        System.out.println(userCard.getSuit());
        
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++){
            int mHandValue = magicHand[i].getValue();
            String mHandSuit = magicHand[i].getSuit();
            
            // finds if the user's card is in the magic hand
            if (mHandValue == userCard.getValue() && mHandSuit == userCard.getSuit()){
                answer = true; 
            }
            
        }
          
        //Then report the result here
        if (answer == true){
            System.out.println("Your card is in the magic hand!");
        }else
        {
            System.out.println("Your card was not in the magic hand");
        }            
    }
}
