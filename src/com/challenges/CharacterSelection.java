package com.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Short Intro
 * 
 * Some of you might remember spending afternoons playing Street Fighter 2 
 * in some Arcade back in the 90s or emulating it nowadays with the numerous 
 * emulators for retro consoles.
 * 
 * Can you solve this kata? Suuure-You-Can!
 * 
 * You'll have to simulate the video game's character selection screen behaviour, 
 * more specifically the selection grid. Such screen looks like this:
 * 
 *                Selection Grid Layout in text:
 * 
 * | Ryu  | E.Honda | Blanka  | Guile   | Balrog | Vega    |
 * | Ken  | Chun Li | Zangief | Dhalsim | Sagat  | M.Bison |
 * 
 * Input
 * the list of game characters in a 2x6 grid;
 * the initial position of the selection cursor (top-left is (0,0));
 * a list of moves of the selection cursor (which are up, down, left, right);
 * 
 * Output
 * the list of characters who have been hovered by the selection cursor after all 
 * the moves (ordered and with repetition, all the ones after a move, wether 
 * successful or not, see tests);
 * 
 * Rules
 * 
 * Selection cursor is circular horizontally but not vertically! As you might 
 * remember from the game, the selection cursor rotates horizontally but not 
 * vertically; that means that if I'm in the leftmost and I try to go left 
 * again I'll get to the rightmost (examples: from Ryu to Vega, from Ken to 
 * M.Bison) and vice versa from rightmost to leftmost.
 * 
 * Instead, if I try to go further up from the upmost or further down from 
 * the downmost, I'll just stay where I am located (examples: you can't go lower 
 * than lowest row: Ken, Chun Li, Zangief, Dhalsim, Sagat and M.Bison in the above 
 * image; you can't go upper than highest row: Ryu, E.Honda, Blanka, Guile, Balrog 
 * and Vega in the above image).
 * 
 * Examples
 * 
 * fighters = [
      ["Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"],
      ["Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"]
    ]
 * initial_position = (0,0)
 * moves = ['up', 'left', 'right', 'left', 'left']
 * 
 * then I should get:
 *  ['Ryu', 'Vega', 'Ryu', 'Vega', 'Balrog']
 *  
 * as the characters I've been hovering with the selection cursor 
 * during my moves. Notice: Ryu is the first just because it "fails" 
 * the first up See test cases for more examples.
 */
public class CharacterSelection {
  public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
    List<int[]> positions = new ArrayList<>();
    List<String> result = new ArrayList<>();

    int[] currentPosition = Arrays.copyOf(position, position.length);

    for (String move : moves) {
      switch (move) {
      case "up":
        if (currentPosition[1] > 0) {
          currentPosition[1]--;
        }
        break;
      case "down":
        if (currentPosition[1] < 1) {
          currentPosition[1]++;
        }
        break;
      case "right":
        currentPosition[0]++;

        if (currentPosition[0] >= fighters[0].length) {
          currentPosition[0] = 0;
        }
        break;
      case "left":
        currentPosition[0]--;

        if (currentPosition[0] < 0) {
          currentPosition[0] = fighters[0].length - 1;
        }
        break;
      }

      positions.add(new int[] { currentPosition[0], currentPosition[1] });
    }

    for (int[] pos : positions) {
      result.add(fighters[pos[1]][pos[0]]);
    }

    return result.toArray(new String[result.size()]);
  }

}
