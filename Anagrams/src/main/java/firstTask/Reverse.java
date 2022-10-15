package firstTask;

import java.util.StringJoiner;

public class Reverse {
    public String wordReverse(String word) {

        char[] wordInArray = word.toCharArray();
        int right = word.length() - 1;

        for (int left = 0; left < right; left++) {
            if (!Character.isLetter(wordInArray[left])) {
                continue;
            }
            while (right > left && !Character.isLetter(wordInArray[right])) {
                right--;
            }
            if (right != left) {
                char temp = wordInArray[left];
                wordInArray[left] = wordInArray[right];
                wordInArray[right] = temp;
                right--;
            }
        }
        return String.valueOf(wordInArray);
    }

    public String stringReverse(String str) {

        if (str == null) {
            return null;
        }

        StringJoiner sj = new StringJoiner(" ");
        for (String word : str.split(" ", -1)) {
            word = wordReverse(word);
            sj.add(word);
        }
        return String.valueOf(sj);
    }
}
