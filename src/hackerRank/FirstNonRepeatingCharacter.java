package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args){


        HashMap<Character,Integer> char_counts = new HashMap<>();
        String incomingString = "abcddbgchijklma";

        char result ;

        for(int i=0;i<incomingString.length();i++){
            char c = incomingString.charAt(i);
            if(char_counts.containsKey(c)){
                char_counts.put(c,char_counts.get(c)+1);
            }else{
                char_counts.put(c,1);
            }
        }

        for(int i=0;i<incomingString.length();i++){
            char c = incomingString.charAt(i);
            if(char_counts.get(c) == 1){
                result = c;
                System.out.println("Result is "+Character.toString(result));
            }
        }


    }
}
