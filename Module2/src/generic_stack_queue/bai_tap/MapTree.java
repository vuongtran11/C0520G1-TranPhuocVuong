package generic_stack_queue.bai_tap;

import java.util.TreeMap;

public class MapTree {
    public static void main(String[] args) {
        TreeMap<String,Integer> map1=new TreeMap<>();

        TreeMap<String,Integer> map=new TreeMap<>();
        String str = "hey long long hey phuc viet tuan";
        String [] words = str.split(" ");

        int index=0;
        //System.out.println(demsotu(words,"hey"));
        int dem;
        for(int i=0;i<words.length;i++){
            dem=demsotu(words,words[i]);
            map.put(words[i],dem);
        }
        System.out.println(map);
        // System.out.println(map);
    }

    public static int demsotu(String[] arr,String word){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(word)){
                count++;
            }
        }
        return count;
    }
}
