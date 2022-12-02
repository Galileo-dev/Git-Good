package com.GameLogic.Player;

public class Player {
    
    private int lifeCount;

    //constructor
    public Player(int lifeCount) {

        this.lifeCount = lifeCount;

    }

    public int getLifeCount() {
        return lifeCount;
    }

    public void setLifeCount(int lifeCount) {
        this.lifeCount = lifeCount;
    }

    //lose life method
    public void loseLife() {

        this.lifeCount--;
        restart();

        if (this.lifeCount <= 0) {
            endgame();
        }
    }

    //restart game method
    public void restart() {

        //clearscreen();
    }

    public void endgame() {
        this.lifeCount = 5;
    }
}
