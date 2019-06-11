package challenges;

import java.util.HashMap;
import java.util.Map;

/*
 * FLAMES game is a method to find out the status of a love relationship. 
 * Entering two names will give you the outcome of a relationship between 
 * them.
 * 
 * To get the outcome, First, cross out all letters the names have in common.
 * Second, remove the cross out letter on both names.
 * Third, get the count of the characters that are left.
 * Fourth, given the word FLAMES, with each letter, starting from the left, 
 * count up to the number you got in the previous step and return to the F on 
 * the left with each pass.
 * 
 * Finally, the letter you land on has a word that it stands for in the 
 * acronym 'flames'.
 * 
 *          F = Friendship
 *          L = Love
 *          A = Affection
 *          M = Marriage
 *          E = Enemies
 *          S = Siblings
 */
public class FlamesGame {

  public static String showRelationship(String male, String female) {
    String[] responses = { "Siblings", "Friendship", "Love", "Affection", "Marriage", "Enemies" };

    Map<String, Boolean> commonsMap = new HashMap<>();

    for (char c : male.toCharArray()) {
      commonsMap.put(String.valueOf(c), Boolean.TRUE);
    }

    for (char c : female.toCharArray()) {
      if (commonsMap.containsKey(String.valueOf(c))) {
        male = male.replaceAll(String.valueOf(c), "");
        female = female.replaceAll(String.valueOf(c), "");
      }
    }

    int index = (male.length() + female.length()) % 6;

    return responses[index];
  }

}
