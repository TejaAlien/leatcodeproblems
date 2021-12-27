package removeduplicates;

import java.util.*;

public class Sortedarray {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int size = st.nextInt();
        System.out.println("Giviing the size of the array: "+size);
        int [] input = new int[size];

        for(int i =0; i<size;i++){
            input[i]= st.nextInt();
        }
        System.out.println("Retrieving the elements: ");
        for(Integer values: input){
            System.out.println(values);
        }
        System.out.println("Storing the elemenets int he hashmap and assigns the value to 1 for the key appears twice or " +
                "more");
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer val:input){
            if(map.containsKey(val)){
                map.put(val,map.get(val));
            }
            else{
                map.put(val,1);
            }
        }
        System.out.println("Retrieving the keys and values ");
        for(Map.Entry<Integer,Integer> kv:map.entrySet()){
            System.out.println(kv.getKey() +" "+ kv.getValue());
        }
        System.out.println("Retrieving the values: ");
        Collection<Integer> valu=map.values();
        System.out.println(valu);
        Set<Integer> keys = map.keySet();
        int count =0;
for(int e =0;e<keys.size();e++){

    count = count+1;

}
System.out.println("Retrievivng the keys:");System.out.println(keys);
System.out.println("Keys count:");
System.out.println(count);




    }

}
