package com.gitgood.game.levels;

import java.util.Map;

public abstract class LevelLogic implements Runnable {
    public String command;
    public boolean isFinished = false;
    public Map<String, String> config;;

    public LevelLogic(Map<String, String> config) {
        this.config = config;
        // run the function that was passed in
    }

    public LevelLogic() {
    }

    public void run(String command) {
        this.command = command;
        // run the function that was passed in
        run();

    }

    public void run() {

    }
}