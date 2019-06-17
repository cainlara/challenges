package challenges;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import challenges.FlamesGame;

public class FlamesGameTest {

  @Test
  public void testSimpleFlames() throws Exception {
    assertEquals("NEIL and MAE are enemies", "Enemies", FlamesGame.showRelationship("NEIL", "MAE"));
  }
  
  @Test
  public void testLongNamesFlames() throws Exception {
    assertEquals("BRODERICK and VALENTINE are friends", "Friendship", FlamesGame.showRelationship("BRODERICK", "VALENTINE"));
  }
  
  @Test
  public void test2() throws Exception {
    assertEquals("MARTIN and MARXVG are siblings", "Siblings", FlamesGame.showRelationship("MARTIN", "MARXVG"));
  }

}
