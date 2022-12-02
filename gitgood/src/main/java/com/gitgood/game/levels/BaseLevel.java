package com.gitgood.game.levels;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class BaseLevel implements Level {
    LevelLogic handleCommandFunction;
    JTextArea questionArea;
    JTextArea answerArea;

    public BaseLevel(JTextArea questionArea, JTextArea answerArea) {
        this.handleCommandFunction = new LevelLogic() {
            public void run() {
                System.out.println("No handleCommand function defined, this is a bug.");
            }
        };

        this.questionArea = questionArea;
        this.answerArea = answerArea;
    }

    // handle commands
    public void handleCommand(String command) {
        answerArea.append("\n" + command);
        handleCommandFunction.run(command);
    }

    // start of level
    public void start() {

    }

}
