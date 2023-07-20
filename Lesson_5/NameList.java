import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class NameList {
    Map<String, String> nameList = new HashMap<>();
    
    
    void addName(String lastName, String firstName) {
        nameList.put(lastName, firstName);
    }

    public Map<Integer, Set<String>> reccuringNames(){
        Collection<String> values = nameList.values();
        ArrayList<String> valuesList = new ArrayList<>(values);
        Map<Integer, Set<String>> recNames = new TreeMap<>(Comparator.reverseOrder());
            for (int i = 0; i < valuesList.size(); i++) {
                int count = Collections.frequency(valuesList, valuesList.get(i));
                String names = valuesList.get(i);
                if (recNames.containsKey(count)) {
                    Set<String> list = recNames.get(count);
                    list.add(names);
                }
                else {
                    Set<String> list = new TreeSet<>();
                    list.add(names);
                    recNames.put(count, list);
                }
            }
            return recNames;
    }
    
    
}

    