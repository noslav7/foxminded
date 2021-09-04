package ua.com.foxminded.anagram;

public class Anagram {

    public String reverseText(String text) {
        StringBuilder result = new StringBuilder();
        String[] words = text.split("\\s+");
        for (String word : words) {
            String reversedWord = reverseWord(word);
            result.append(reversedWord).append(" ");
        }
        return result.toString();
    }

    public String reverseWord(String word) {
        char[] chars = word.toCharArray();
        int indexRight = chars.length - 1;
        int indexLeft = 0;

        while (indexLeft < indexRight) {
            if (!Character.isLetter(chars[indexLeft])) {
                indexLeft++;
            } else if (!Character.isLetter(chars[indexRight])) {
                indexRight--;
            } else {
                char leftSymbol = chars[indexLeft];
                chars[indexLeft] = chars[indexRight];
                chars[indexRight] = leftSymbol;
                indexLeft++;
                indexRight--;
            }
        }
        return String.valueOf(chars);
    }
}
