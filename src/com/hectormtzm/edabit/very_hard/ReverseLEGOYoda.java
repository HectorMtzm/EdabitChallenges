package com.hectormtzm.edabit.very_hard;

/*
function that takes a string with at least one sentence in it and returns a string with the part(s) after the comma at the beginning of the sentence(s).
Sentences will always end with a period.
HM
 */

public class ReverseLEGOYoda {
    public static void main(String[] args) {
        System.out.println(reverseLegoYoda("Rejected me, my crush has. Ketamine, I need."));
        System.out.println("123456789");
    }

    public static String reverseLegoYoda(String text) {
        String[] sentences = text.split("\\. ");
        StringBuilder completeSentence = new StringBuilder();

        for (String sentence : sentences){
            String[] tempSentence = sentence.split(", ");
            tempSentence[0] = Character.toLowerCase(tempSentence[0].charAt(0)) + tempSentence[0].substring(1);
            tempSentence[1] = Character.toUpperCase(tempSentence[1].charAt(0)) + tempSentence[1].substring(1);

            if (tempSentence[1].charAt(tempSentence[1].length()-1) == '.')
                tempSentence[1] = tempSentence[1].substring(0, tempSentence[1].length()-1);

            completeSentence.append(tempSentence[1]).append(" ").append(tempSentence[0]).append(".");

            if (sentences.length > 1) completeSentence.append(" ");
        }

        if (completeSentence.charAt(completeSentence.length()-1) == ' ')
            completeSentence = new StringBuilder(completeSentence.substring(0, completeSentence.length() - 1));

        return completeSentence.toString();
    }
}