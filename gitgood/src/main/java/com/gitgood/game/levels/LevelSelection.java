package com.gitgood.game.levels;

import javax.swing.JTextArea;

public class LevelSelection extends BaseLevel {

    public LevelSelection(JTextArea questionArea, JTextArea answerArea) {
        super(questionArea, answerArea);
    }

    public void start() {
        questionArea.append("Please Select a Level: \n");
        // 1 - Beginner
        // 2 - Intermediate
        // 3 - Advanced
        questionArea.append("\n" +
                "1 - Beginner \n" +
                "2 - Intermediate \n" +
                "3 - Advanced \n");

        handleCommandFunction = new LevelLogic() {
            public void run() {
                if (command.equals("1")) {
                    // Beginner
                    // Level1 level1 = new Level1(questionArea, answerArea);
                    // level1.start();
                } else if (command.equals("2")) {
                    // Intermediate
                } else if (command.equals("3")) {
                    // Advanced
                } else {
                    answerArea.append("\n Not a valid level.");
                }
            };
        };

    }
}
