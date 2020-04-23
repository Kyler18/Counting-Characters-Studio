import java.util.HashMap;
import java.util.Scanner;

public class Characters {
    private static void charCount(String str){
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = str.toCharArray();
        for (char c : strArray) {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }
        System.out.println(charCountMap);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String message = input.nextLine();
        charCount(message.toLowerCase());
    }
}
