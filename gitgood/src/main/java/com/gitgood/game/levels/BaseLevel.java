package com.gitgood.game.levels;

import javax.swing.JFrame;
import javax.swing.JTextArea;


public class BaseLevel implements Level {
    JTextArea questionArea;
    JTextArea answerArea;


    public BaseLevel(JTextArea questionArea, JTextArea answerArea) {
        this.questionArea = questionArea;
        this.answerArea = answerArea;
    }

    //handle commands
    public void handleCommand(String command) {
        answerArea.append("\n" + command);
    }

    // start of level
    public void start() {

    }

}
