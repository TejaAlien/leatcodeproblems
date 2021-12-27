package Sumleatcode.romantointeger;

import java.util.*;

public class Romantointeger {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            System.out.println("Key->" + kv.getKey() + " :"
                    + "Value->" + kv.getValue());}
           /* //map.forEach((key,value)->{System.out.println("Key:"+key);System.out.println("value:"+value);});
            List<Integer> values = new ArrayList<>(map.values());
        System.out.println("printing values:");
            for (Integer d : values)
                System.out.println(d);
            List<Character> ke = new ArrayList<>(map.keySet());
System.out.println("Printing keys:");
            for (Character key : ke)
                for (int r =0;r<key;r++){
                    System.out.println("key: "+key(r)+" value: "+ (map.get(key)));
                }*/
               //System.out.println(" ");
           /* Collection<String> valuess = map.values();
            for (String f : valuess)
                System.out.println("hoo" + f);
            List<String> keysss = (List<String>) map.keySet();
            for (String v : keysss)
                System.out.println(v);
        }*/
Scanner st = new Scanner(System.in);
String input = st.next();
int sum=0;
for (int o=0;o<input.length();o++){
   // sum = (sum+ Integer.parseInt(map.get(input.charAt(o))));
    int res = sum;
    System.out.println(res);
}
        }
    }

