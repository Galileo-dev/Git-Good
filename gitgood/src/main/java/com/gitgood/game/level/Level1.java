package com.gitgood.game.level;

import javax.swing.JTextArea;

import com.gitgood.game.levels.BaseLevel;
import com.gitgood.game.levels.LevelLogic;
import com.gitgood.game.utils.Helpers;

public class Level1 extends BaseLevel {

    public Level1(JTextArea questionArea, JTextArea answerArea) {
        super(questionArea, answerArea);
    }

    public void start() {
        questionArea.append("\nWelcome to Level 1! In this level, you will learn how to type basic Git commands.\n");

        // Present the player with a list of basic Git commands to type
        String[] commands = { "git init", "git status", "git add", "git commit", "git log" };

        for (String command : commands) {
            questionArea.append("\nType the following command: " + command);

            handleCommandFunction = new LevelLogic() {
                public void run() {
                    // Check if the player typed the correct command
                    if (command.equals(this.command)) {
                        answerArea.append("\nCorrect! Good job.");
                        isFinished = true;
                    } else {
                        answerArea.append("\nIncorrect. Please try again.");
                    }
                };
            };

            Helpers.WaitUntilNextPhase(handleCommandFunction);
        }

        questionArea.append("\nYou have successfully completed Level 1! Great work!");
    }
}