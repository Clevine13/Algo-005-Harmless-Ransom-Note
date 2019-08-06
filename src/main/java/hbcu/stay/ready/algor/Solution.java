package hbcu.stay.ready.algor;

import java.util.HashMap;

public class Solution {

    public Boolean harmlessRansomNote(String message , String magazineText){

        String[] output = magazineText.split(" ");
        HashMap<String,Integer> newmap = new HashMap<>();

        for(String x: output){
            if(newmap.containsKey(x)){
                newmap.put(x,newmap.get(x) + 1);
            }
            else{
                newmap.put(x,1);
            }
        }

        String[] output2 = message.split(" ");
        for(String x: output2){
            if(newmap.containsKey(x)&& newmap.containsValue(1)){
                System.out.println(x);
            }
        }


        return null;
    }
}
