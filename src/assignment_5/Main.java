package assignment_5;
import java.util.ArrayList;
public class Main {

	/**
	* @param args
    */
	private static ArrayList <Card> one = new ArrayList<Card>();
	private static ArrayList <Card> two = new ArrayList<Card>();
	private static Deck deck = new Deck();
	public static void main(String[] args) {
		deck.shuffleDeck();
		one.add(deck.getTopCard());
		two.add(deck.getTopCard());
		one.add(deck.getTopCard());
		two.add(deck.getTopCard());
		one.add(deck.getTopCard());
		two.add(deck.getTopCard());
		one.add(deck.getTopCard());
		two.add(deck.getTopCard());
		one.add(deck.getTopCard());
		two.add(deck.getTopCard());
		
		int hand1value = 0;
		for (int i = 0; i < one.size(); i++)
		{
			Card current = one.get(i);
			hand1value += current.pointValue();
		}
		int hand2value = 0;
		for (int i = 0; i < two.size(); i++)
		{
			Card current = two.get(i);
			hand2value += current.pointValue();
		}
		
		System.out.println("Hand 1: total points " + hand1value);
		System.out.println(one.get(0));
		System.out.println(one.get(1));
		System.out.println(one.get(2));
		System.out.println(one.get(3));
		System.out.println(one.get(4));
		System.out.println("/nHand 2: total points " + hand2value);
		System.out.println(two.get(0));
		System.out.println(two.get(1));
		System.out.println(two.get(2));
		System.out.println(two.get(3));
		System.out.println(two.get(4));
		
		if (hand1value > hand2value)
			System.out.println("/nHand 1 wins");
		else if (hand2value > hand1value)
			System.out.println("/nHand 2 wins");
		else
			System.out.println("/nTie");
		
		
		
    }
}