package challenges;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import static challenges.MapOddsAndEven.separate;

public class MapOddsAndEvenTest {

    @Test
    public void returnsNull() {
        assertNull("The output should be null", separate(null));
    }

    @Test
    public void validateKeys() {
        List<Integer> source = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<String, List<Integer>> output = separate(source);
        assertEquals(2, output.size());
        Set<String> keySet = new HashSet<>();
        keySet.add("even");
        keySet.add("odd");
        assertEquals(keySet, output.keySet());
    }

}
