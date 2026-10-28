package shortestWord;

public class ShortestWord {
    public String shortestWord(String sentence) {
        String[] words = sentence.split("[^A-Za-z0-9]+");

        int count = 0;

        while (count < words.length && words[count].equals("")) {
            count++;
        }

        int shortestLength = words[count].length();
        String shortestWord = words[count];

        for (int index = count + 1; index < words.length; index++) {
            if (!words[index].equals("") && words[index].length() < shortestLength) {
                shortestLength = words[index].length();
                shortestWord = words[index];
            }
        }

        return shortestWord;
    }
}