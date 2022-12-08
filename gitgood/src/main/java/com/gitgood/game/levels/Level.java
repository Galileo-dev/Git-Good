package com.gitgood.game.levels;

public interface Level {

    public void handleCommand(String command);

    public Level getNextLevel();

    public void start();
}