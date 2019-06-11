package challenges.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import challenges.CharacterSelection;

public class CharacterSelectionTest {

  String[][] fighters = new String[][] { new String[] { "Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega" },
      new String[] { "Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison" }, };

  @Test
  public void shouldWorkWhenAlwaysMovingDown() {
    String[] moves = new String[] { "down", "down", "down", "down" };
    String[] solution = new String[] { "Ken", "Ken", "Ken", "Ken" };
    assertArrayEquals(solution, CharacterSelection.streetFighterSelection(fighters, new int[] { 0, 0 }, moves));
  }

  @Test
  public void shouldWorkWhenAlwaysMovingLeft() {
    String[] moves = new String[] { "left", "left", "left", "left", "left", "left", "left", "left" };
    String[] solution = new String[] { "Vega", "Balrog", "Guile", "Blanka", "E.Honda", "Ryu", "Vega", "Balrog" };
    assertArrayEquals(solution, CharacterSelection.streetFighterSelection(fighters, new int[] { 0, 0 }, moves));
  }

  @Test
  public void shouldWorkWithNoMoves() {
    String[] solution = new String[] {};
    assertArrayEquals(solution,
        CharacterSelection.streetFighterSelection(fighters, new int[] { 0, 0 }, new String[] {}));
  }

  @Test
  public void shouldWorkWithFewMoves() {
    String[] moves = new String[] { "up", "left", "right", "left", "left" };
    String[] solution = new String[] { "Ryu", "Vega", "Ryu", "Vega", "Balrog" };
    assertArrayEquals(solution, CharacterSelection.streetFighterSelection(fighters, new int[] { 0, 0 }, moves));
  }

  @Test
  public void shouldUseAll4DirectionsClockwiseTwice() {
    String[] moves = new String[] { "up", "left", "down", "right", "up", "left", "down", "right" };
    String[] solution = new String[] { "Ryu", "Vega", "M.Bison", "Ken", "Ryu", "Vega", "M.Bison", "Ken" };
    assertArrayEquals(solution, CharacterSelection.streetFighterSelection(fighters, new int[] { 0, 0 }, moves));
  }

  @Test
  public void shouldWorkWhenAlwaysMovingRight() {
    String[] moves = new String[] { "right", "right", "right", "right", "right", "right", "right", "right" };
    String[] solution = new String[] { "E.Honda", "Blanka", "Guile", "Balrog", "Vega", "Ryu", "E.Honda", "Blanka" };
    assertArrayEquals(solution, CharacterSelection.streetFighterSelection(fighters, new int[] { 0, 0 }, moves));
  }

  @Test
  public void shouldWorkWhenAlwaysMovingUp() {
    String[] moves = new String[] { "up", "up", "up", "up" };
    String[] solution = new String[] { "Ryu", "Ryu", "Ryu", "Ryu" };
    assertArrayEquals(solution, CharacterSelection.streetFighterSelection(fighters, new int[] { 0, 0 }, moves));
  }
}
