import java.util.ArrayList;

public class Mommifier {
    public static String convert(String input) {
        if (input == null) {
            return null;
        }
        if (input.length() == 1) {
            return input;
        }
        int num_Of_Vowels = 0;
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            num_Of_Vowels = getNum_of_vowels(input, num_Of_Vowels, i);
        }
        if (num_Of_Vowels > input.length() * 0.3) {
            for (int i = 0; i < input.length() - 1; i++) {
                result.add(String.valueOf(input.charAt(i)));
                add_mommy(input, result, i);
            }
            result.add(String.valueOf(input.charAt(input.length() - 1)));
            return String.join("", result.toArray(new String[result.size()]));
        } else {
            return input;
        }
    }

    private static void add_mommy(String input, ArrayList<String> result, int i) {
        if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
            if (input.charAt(i + 1) == 'a' || input.charAt(i + 1) == 'e' || input.charAt(i + 1) == 'i' || input.charAt(i + 1) == 'o' || input.charAt(i + 1) == 'u') {
                result.add("mommy");
            }
        }
    }

    private static int getNum_of_vowels(String input, int num_Of_Vowels, int i) {
        if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
            num_Of_Vowels++;
        }
        return num_Of_Vowels;
    }
}
