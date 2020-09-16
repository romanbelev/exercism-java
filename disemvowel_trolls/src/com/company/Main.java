/*
Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel.
*/

package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    String text = "This website is for losers LOL!";
        Troll troll = new Troll();
        System.out.println(troll.disemvowel(text));
    }
}

class Troll {
    public String disemvowel(String text) {

        String[] vowels = {"A", "E", "I", "O", "U"};
        Set<String> vowelsSet = new HashSet<String>(Arrays.asList(vowels));
        StringBuilder diseText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            String currentLetter = Character.toString(text.charAt(i));
            if (! vowelsSet.contains(currentLetter.toLowerCase()) && ! vowelsSet.contains(currentLetter.toUpperCase())) {
                diseText.append(currentLetter);
                System.out.println(currentLetter);
            }
        }

        return diseText.toString();
    }
}
