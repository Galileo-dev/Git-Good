package com.gitgood.game.utils;

import com.gitgood.game.levels.LevelLogic;

public class Helpers {
    public static void WaitUntilNextPhase(LevelLogic levelLogic) {
        while (!levelLogic.isFinished) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
