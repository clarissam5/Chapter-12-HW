
public class Card {
	
		/*//to create Card object & with the mapping system it shows the 3 of clubs 
		Card threeOfClubs = new Card(3, 0);*/
	/*
	public String toString() {
	
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};	
		//never use zero element due to only valid ranks being 1-13
		String[] ranks = {null, "ace", "2", "3", "4", "5","6","7","8","9","10","Jack","Queen","King"};
		//String relating suits and ranks
		String s = ranks[this.rank] + "of" + suits[this.suit];
		return s;
	}*/
	
		//display a new card 
		/*Card card = new Card(11,1);
		System.out.println(card);*/
	
	public static final String[] RANKS = {
		null, "Ace", "2", "3", "4", "5", "6", "7",
	      "8", "9", "10", "Jack", "Queen", "King"};	
	public static final String[] SUITS = {
			"Clubs", "Diamonds", "Hearts", "Spades"};
	
	//instance variables and immutable by making it final
	private final int rank;
	private final int suit;

	//constructor
	public Card(int rank, int suit) {
		 this.rank = rank;
		 this.suit = suit;
	}
	
	 public String toString() {
	      return RANKS[this.rank] + " of " + SUITS[this.suit];
	    }
	 
	 /* Static means the variable is shared
	  * Final means the variable is constant
	  */
	 
	 /**Compares Cards
	   * Returns true if the given card has the same
	   * rank AND same suit; otherwise returns false.
	   */
	 public boolean equals(Card that) {
	     return this.rank == that.rank
	         && this.suit == that.suit;
	 }
	 
	 /* Returns a negative integer if this card comes before
     * the given card, zero if the two cards are equal, or
     * a positive integer if this card comes after the card.
     */
    /*public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }*/
    
    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }
    
    //Returns the card's index in a sorted deck of 52 cards.
   public int position() {
       return this.suit * 13 + this.rank - 1;
   }
   
   //EXERCISE 1 --make method return array of Card named s
   public static Card[] makeDeck() {
       Card[] s = new Card[52];
       int index = 0;
       //nested for loops
       for (int suit = 0; suit <= 3; suit++) {
           for (int rank = 1; rank <= 13; rank++) {
               s[index] = new Card(rank, suit);
               index++;
           }
       }
       return s;
   }
   
   //EXERCISE 2 -- Aces are ranked higher than Kings; modify compare to
	   public int compareTo(Card that) {
		   if(this.suit==1 && that.suit==13) { 
			   
		   } else if (this.suit==1 && that.suit==13) {
			   return -1;
		   }
		   
	       if (this.suit < that.suit) {
	           return -1;
	       }
	       if (this.suit > that.suit) {
	           return 1;
	       }
	       if (this.rank < that.rank) {
	           return -1;
	       }
	       if (this.rank > that.rank) {
	           return 1;
	       }
	       return 0;
	   }

	 
}
