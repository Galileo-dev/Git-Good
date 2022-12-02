package com.GameLogic.levels;

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


    public int checkAnswer(String input){
        if(input.equals(AnswerList[AnswerProgression])){
            AnswerProgression += 1;
            return 1;
        }
        return -1;
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
