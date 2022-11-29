package com.gitgood.game.levels;

// import jcurses 
import jcurses.widgets.Window;

public class Level1 extends Level {
    public Level1() {
        super();
    }
}

class Level {
    // start of level
    public static void start() {
        // start of level
        Window window = new Window(50, 50, false, "hello");
        window.show();

    }
}
