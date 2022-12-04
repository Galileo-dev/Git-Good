package com.GameLogic.levels;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BaseLevel {
    private String[] Narrative; 
    private String[] AnswerList;
    private int AnswerProgression;    
    private int StoryProgression;

    public BaseLevel (String[] Narrative, String[] AnswerList){
        this.Narrative = Narrative;
        this.AnswerList = AnswerList;
        this.AnswerProgression = 0;
        this.StoryProgression = 0;
    }

    public String[] getNarrativeList(String filename){
        String NarrativeNotList = "";
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              NarrativeNotList += data;
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          String[] NarrativeList = NarrativeNotList.split("||");

        return NarrativeList;
    }

    public int checkAnswer(String input){
        if(input.equals(AnswerList[AnswerProgression])){
            AnswerProgression += 1;
            return 1;
        }
        return -1;
    }

    public String concatinateFilename(String level) {
        return ("level" + level + ".txt");
    }


    public String getCurrentstory(){
        return Narrative[StoryProgression];
    }




    public String[] getAnswerList() {
        return AnswerList;
    }


    public void setAnswerList(String[] answerList) {
        AnswerList = answerList;
    }


    public String[] getNarrative() {
        return Narrative;
    }


    public void setNarrativename(String[] narrative) {
        Narrative = narrative;
    }

    
}
