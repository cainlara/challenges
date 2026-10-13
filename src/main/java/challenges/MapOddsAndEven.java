package challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOddsAndEven {

    public static Map<String, List<Integer>> separate(final List<Integer> source) {
        Map<String, List<Integer>> output = null;

        if (source != null) {
            output = new HashMap<>();
            Map<Boolean, List<Integer>> result = source.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
            output.put("even", result.get(true));
            output.put("odd", result.get(false));
        }

        return output;
    }
}
