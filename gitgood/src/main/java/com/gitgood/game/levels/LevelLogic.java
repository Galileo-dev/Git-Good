package com.gitgood.game.levels;

public abstract class LevelLogic implements Runnable {
    public String command;
    public boolean isFinished = false;

    public void run(String command) {
        this.command = command;
        // run the function that was passed in
        run();

    }
}