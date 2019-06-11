package challenges;

/*
 * The new "Avengers" movie has just been released! There are a lot of 
 * people at the cinema box office standing in a huge line. Each of 
 * them has a single 100, 50 or 25 dollars bill. A "Avengers" ticket 
 * costs 25 dollars.
 * 
 * Vasya is currently working as a clerk. He wants to sell a ticket to 
 * every single person in this line.
 * Can Vasya sell a ticket to each person and give the change if he 
 * initially has no money and sells the tickets strictly in the order 
 * people follow in the line?
 * 
 * Return YES, if Vasya can sell a ticket to each person and give the change. 
 * Otherwise return NO.
 */
public class Line {
  public static void main(String[] args) {
    System.out.println(tickets(new int[] { 25, 100, 50 }));
  }

  public static String tickets(int[] peopleInLine) {
//		int cash = 0;
//		int ticketPrice = 25;
//		
//		for (int payment : peopleInLine) {
//			int cashBack = payment - ticketPrice;
//			
//			if (cash - cashBack < 0) {
//				return "NO";
//			}
//			
//			cash += ticketPrice;
//			cash -= cashBack;
//		}
//		
//		return "YES";
    int ticketPrice = 25;

    for (int index = 0; index < peopleInLine.length; index++) {
      int payment = peopleInLine[index];

      if (payment - ticketPrice > index * ticketPrice) {
        return "NO";
      }
    }

    return "YES";
  }

}