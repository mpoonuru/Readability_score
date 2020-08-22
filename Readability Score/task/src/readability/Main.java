package readability;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = null;
        try {
            str = readFileAsString("./" + args[0]);
            System.out.println("The text is:\n" + str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        double words = str.split("\\s").length;
        double sentences = str.split("[//.//?!]").length;
        double chars = str.replaceAll("\\s", "").split("").length;
        String wordTotal[] = str.split("\\s");
        int syllables = 0;
        int polysyllables = 0;
        for (int i = 0; i < wordTotal.length; i++) {
            if((wordTotal[i].matches("[a-zA-Z.?!(),]+"))) {
                int noOfVowels = countVowels(wordTotal[i]);
                if (noOfVowels == 0) {
                    syllables++;
                } else if (noOfVowels > 2) {
                    //System.out.println(wordTotal[i]);
                    polysyllables++;
                    syllables += noOfVowels;
                } else {
                    syllables += noOfVowels;
                }
            }
        }
        System.out.printf("Words: %.0f%n" +
                "Sentences: %.0f%n" +
                "Characters: %.0f%n" +
                "Syllables: %d%n" +
                "Polysyllables: %d%n", words, sentences, chars, syllables, polysyllables);
        System.out.println("Enter the score you want to calculate (ARI, FK, SMOG, CL, all):");
        double score1 = 4.71 * (chars / words) + 0.5 * (words / sentences) - 21.43;
        double score2 = 0.39 * (words / sentences) + 11.8 * (syllables / words) - 15.59;
        double score3 = 1.043 * Math.sqrt(polysyllables * 30 / sentences) + 3.1291;
        double score4 = 0.0588 * (chars / words * 100) - 0.296 * (sentences / words * 100) - 15.8;
        String choice = sc.nextLine();
        switch (choice) {
            case "ARI":
                System.out.printf("Automated Readability Index: %.2f " + "(about %d year olds", score1, ageCalculator(score1));
                break;
            case "FK":
                System.out.printf("Flesch" + (char) (8211) + "Kincaid readability tests: %.2f " + "(about %d year olds", score2, ageCalculator(score2));
                break;
            case "SMOG":
                System.out.printf("Simple Measure of Gobbledygook: %.2f " + "(about %d year olds", score3, ageCalculator(score3));
                break;
            case "CL":
                System.out.printf("Coleman\" + (char) (8211) + \"Liau index: %.2f " + "(about %d year olds", score4, ageCalculator(score4));
                break;
            case "all":
                System.out.printf("Automated Readability Index: %.2f " + "(about %d year olds).%n", score1, ageCalculator(score1));
                System.out.printf("Flesch" + (char) (8211) + "Kincaid readability tests: %.2f " + "(about %d year olds).%n", score2, ageCalculator(score2));
                System.out.printf("Simple Measure of Gobbledygook: %.2f " + "(about %d year olds).%n", score3, ageCalculator(score3));
                System.out.printf("Coleman" + (char) (8211) + "Liau index: %.2f " + "(about %d year olds).%n", score4, ageCalculator(score4));
                break;
        }
        double average = ((double) ageCalculator(score1) + ageCalculator(score2) + ageCalculator(score3) + ageCalculator(score4)) / 4;
        System.out.printf("This text should be understood in average by %.2f year olds.%n", average);
    }

    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static int countVowels(String word) {
        int vowels = 0;
        word=word.replace("[.,;]","");
        word=word.replaceAll("\\p{P}", "");
        char test[] = word.toLowerCase().toCharArray();
        int len = test.length;
        for (int i = 0; i < len; i++) {
            if (test[i] == 'a' || test[i] == 'e' || test[i] == 'i' || test[i] == 'o' || test[i] == 'u' || test[i] == 'y') {
                vowels++;
            }
        }
        if (test[len - 1] == 'e') {
            vowels--;
            len--;
        }
        for (int i = 0; i < len - 1; i++) {
            if ((test[i] == 'a' || test[i] == 'e' || test[i] == 'i' || test[i] == 'o' || test[i] == 'u' || test[i] == 'y') && (test[i + 1] == 'a' || test[i + 1] == 'e' || test[i + 1] == 'i' || test[i + 1] == 'o' || test[i + 1] == 'u' || test[i + 1] == 'y')) {
                vowels--;
            }
        }
        return vowels;
    }

    public static int ageCalculator(double point) {
        int age = 0;
        switch ((int) Math.round(point)) {
            case 1:
                age = 6;
                break;
            case 2:
                age = 7;
                break;
            case 3:
                age = 9;
                break;
            case 4:
                age = 10;
                break;
            case 5:
                age = 11;
                break;
            case 6:
                age = 12;
                break;
            case 7:
                age = 13;
                break;
            case 8:
                age = 14;
                break;
            case 9:
                age = 15;
                break;
            case 10:
                age = 16;
                break;
            case 11:
                age = 17;
                break;
            case 12:
                age = 18;
                break;
            case 13:
                age = 24;
                break;
            case 14:
                age = 25;
                break;
            default:
                age = 26;
                break;
        }
        return age;
    }
}
