package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        isThisAnAnagram("CAT", "ACT");
        isThisAnAnagram("MARY", "ARMY");
        isThisAnAnagram("ALERT", "LATER");
        isThisAnAnagram("CAPES", "SPACE");
        isThisAnAnagram("BELOW", "ELBOW");
        isThisAnAnagram("EARTH", "HEART");
        isThisAnAnagram("LIMES", "SMILE");
        isThisAnAnagram("DUDE", "CHIEF");

    }

    public static void isThisAnAnagram(String word, String anagram){
        if(isAnagram(word, anagram) == true){
            System.out.println(anagram + " is an anagram of " + word);
        }else{
            System.out.println(anagram + " is NOT an anagram of " + word + " !");
        }
    }

    private static boolean isAnagram(String word, String anagram){
        if(word.length() != anagram.length()){
            return false;
        }

        char[] ch = word.toCharArray();
        for(char a : ch){
            int index = anagram.indexOf(a);
            if(index != -1){
                anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
            }else{
                return false;
            }
        }
        return anagram.isEmpty();

    }
}



