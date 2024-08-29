import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListCombiner {
    public List<Object> combineLists(List<Object> list1, List<Object> list2) {
        List<Object> combinedList = new ArrayList<>();
        int maxSize = Math.max(list1.size(), list2.size());

        for (int i = 0; i < maxSize; i++) {
            if (i < list1.size()) {
                combinedList.add(list1.get(i));
            }
            if (i < list2.size()) {
                combinedList.add(list2.get(i));
            }
        }
        return combinedList;
    }
}
