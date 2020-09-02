package pom.example.Mummyji.charoccurence;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GetCharOccurence {
    Map<Character, Integer> map = new HashMap();
    int f = 1;

    public void getOccurence(String s) {
        String s1 = s.toLowerCase();
        char[] ch = s1.toCharArray();
        for (char d : ch) {
            if (map.get(d) == null)
                map.put(d, f);
            else
                map.put(d, map.get(d) + 1);
        }
        System.out.println(map);

    }


}
