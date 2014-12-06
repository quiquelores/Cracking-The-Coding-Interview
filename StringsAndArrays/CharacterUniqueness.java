package StringsAndArrays;

import java.util.*;

public class CharacterUniqueness{

    public static void main(String args[]){
        
    System.out.println(determineWithSpace("qui"));
    System.out.println(determineWithNoSpace("qui"));
    }
    
    public static boolean determineWithSpace(String str){
        HashSet<Character> hs = new HashSet<Character>();
        for(int i = 0; i < str.length(); i++){
            if(hs.contains(str.charAt(i))){
                return false;
            }
            hs.add(str.charAt(i));
        }
        return true;
    }
    
    public static boolean determineWithNoSpace(String str){
        //option 1: 0(n^2). Iterate through each element, iterating each time through the rest of the array to see if no other element is the same.
        //option 2: treat string as an array? order array using O(n log n) mergesort, then iterate through array see if two continuous elements
        //option 3: using int as a bit vector
        int checker = 0;
        
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i) - 'a';
            if((checker & (1<<val)) != 0) return false;
            checker |= 1<<val;    
        }
        return true;
    
    }

}