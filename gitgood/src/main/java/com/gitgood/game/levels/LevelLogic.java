package com.gitgood.game.levels;

public abstract class LevelLogic implements Runnable {
    public String command;

    public void run(String command) {
        this.command = command;
        run();
    }
}