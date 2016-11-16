/**
 * 
 */
package Pizzazz;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ICarroll
 *
 */

	public class DeckOfCards {
	private Card[] vowDeck;
	private int currentcCard=0; //index of the constant to be dealt
	private int currentvCard=0; //index of the vowel to be dealt
	
	String[] constants = {"B","C","D","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Y","Z"};
	String[] vowels = {"A","E","I","O","U"};
	String[] vDeck = new String[20];
	String[] cDeck = new String[84];
	
	public DeckOfCards()
	{	
		// constructor
		for (int i = 0; i < vDeck.length; i++){
			vDeck[i] = vowels[i/4];
			// System.out.println(vDeck[i]);
		}
		
		for (int i = 0; i < cDeck.length; i++){
			cDeck[i] = constants[i/4];
			// System.out.println(vDeck[i]);
		}
							
	}
	
	public void shufflevDeck(){
		
		Random rnd = new Random();
		 
		//for each card in the vDeck, pick another random card and swap them
		
		 for (int n = 0; n < vDeck.length; n++)
		 {
			 
			 //select random card
			 int second = rnd.nextInt(20);
			 
			 //swap the cards
			 String temp = vDeck[n];
			 
			 vDeck[n] = vDeck[second];
			 vDeck[second] = temp;
			 
		 } 	
	}
	
	public void displayvDeck(){
		for (int c = 0; c < vDeck.length; c++){
			 System.out.println("The card in position " + c + " is " + vDeck[c]);
		 }
	}
	
	public void TurnvCard(){
		
		currentvCard=currentvCard +1;
		
	}
	
	 public String getvName() {
		   return vDeck[currentvCard];
		} 		
	 
	 // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	 
		public void shufflecDeck(){
			
			Random rnd = new Random();
			 
			//for each card in the vDeck, pick another random card and swap them
			
			 for (int n = 0; n < cDeck.length; n++)
			 {
				 
				 //select random card
				 int second = rnd.nextInt(20);
				 
				 //swap the cards
				 String temp = cDeck[n];
				 
				 cDeck[n] = cDeck[second];
				 cDeck[second] = temp;
				 
			 } 	
		}
		
		public void displaycDeck(){
			for (int i = 0; i < cDeck.length; i++){
				 System.out.println("The card in position " + i + " is " + cDeck[i]);
			 }
		}
		
		public void TurncCard(){
			
			currentcCard=currentcCard +1;
			
		}
		
		 public String getcName() {
			   return cDeck[currentcCard];
			} 
	 
	 // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	 
	
	 
	 
	 public static void main(String[] args)
	 {
		 Scanner userInput = new Scanner(System.in);
		 String player1[]={"",""};
		 String player2[]={"",""};
		 
		 DeckOfCards abc = new DeckOfCards();
		 
		 abc.shufflevDeck();
		 abc.shufflecDeck();
		
		 // un-comment the line below to read out the shuffled vDeck
		 // abc.displayDeck();
		 
		 player1[0] = abc.getvName();
		 System.out.println("Player 1 is given the letters " + player1[0]);
		 abc.TurnvCard();
		 player1[1] = abc.getvName();
		 System.out.println("and " + player1[1]);
		 abc.TurnvCard();
		 player2[0] = abc.getvName();
		 System.out.println("Player 2 is given the letters " + player2[0]);
		 abc.TurnvCard();
		 player2[1] = abc.getvName();
		 System.out.println("and " + player2[1]);
		 
		 int hold = userInput.nextInt();
		 
		 System.out.println(hold);
	 }
	} 
		
