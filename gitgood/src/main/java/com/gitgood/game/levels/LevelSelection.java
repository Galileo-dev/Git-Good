package com.gitgood.game.levels;

import javax.swing.JTextArea;

import com.gitgood.game.level.Level1;
import com.gitgood.game.level.Level2;
import com.gitgood.game.utils.Helpers;

public class LevelSelection extends BaseLevel {

    public LevelSelection(JTextArea questionArea, JTextArea answerArea) {
        super(questionArea, answerArea);
    }

    public void start() {
        questionArea.append("\nPlease Select a Level: \n");
        questionArea.append("\n" +
                "1 - Beginner \n" +
                "2 - Intermediate \n");

        handleCommandFunction = new LevelLogic() {
            public void run() {
                if (command.equals("1")) {
                    isFinished = true;
                    // Beginner
                } else if (command.equals("2")) {
                    isFinished = true;
                    // Intermediate
                } else {
                    answerArea.append("\n Not a valid level.");
                }
            };
        };

        Helpers.WaitUntilNextPhase(handleCommandFunction);

        // you selected a level

        questionArea.append("\n You selected the level " + command);

        // select level
        switch (command) {
            case "1":
                // Beginner
                nextLevel = new Level1(questionArea, answerArea);
                break;
            case "2":
            questionArea.setText("");
            questionArea.append("Welcome to Level 2! In this level, you will learn how to deal with online repositories in git\nType next to continue");

                // Intermediate
                nextLevel = new Level2(questionArea, answerArea);
                break;
            default:
                break;
        }

    }
}
