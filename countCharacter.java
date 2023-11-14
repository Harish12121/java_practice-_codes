import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class countCharacter {
    public static String countCharacterFrequency(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : input.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        StringBuilder output = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            output.append(entry.getValue()).append(entry.getKey());
        }

        return output.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();                       //aaaffhhxx
        String result = countCharacterFrequency(input);
        System.out.println("Input: " + input);              //Input: aaaffhhxx
        System.out.println("Output: " + result);            //Output: 3a2f2h2x
    }
}
