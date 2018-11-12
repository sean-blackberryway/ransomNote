package com.blackberryway.ransom.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RansomeService {

    public boolean isRansomPossible(String ransomNote, String article){
        boolean verdict = false;
        String[] articleWords = article.split("\\s+");
        String[] noteWords = ransomNote.split("\\s+");
        List listOfArticlewrds = Arrays.asList(articleWords);
        List<String> alreadyInUse = new ArrayList<String>();

        for(int i =0; i < noteWords.length ; i++) {
            if (alreadyInUse.contains(noteWords[i])) {
                System.out.println("duplicate break");
                verdict = false; break;
            }

            if(listOfArticlewrds.contains(noteWords[i])) {
                verdict = true;
                alreadyInUse.add(noteWords[i]);
                System.out.print( " " + noteWords[i]  + " ");
            } else {
                verdict = false; break;
            }
        }
        return verdict;
    }
}
