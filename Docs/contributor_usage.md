# How to extend

In order to add new levels you must create a new class which inherits `BaseLevel`

```
public class MyLevel extends BaseLevel {
    public MyLevel(JTextArea questionArea, JTextArea answerArea) {
        super(questionArea, answerArea);
    }
}
```

now that we have a new level we can implement some logic

to ask a question we first need to
overwrite the start method

```
public class MyLevel extends BaseLevel {
    public MyLevel(JTextArea questionArea, JTextArea answerArea) {
        super(questionArea, answerArea);
    }

    public void start() {

    }
}
```

This is where the story and all game logic will be implemented

To now add text to the `questionArea` we write

```
questionArea.append("Please Select a Level: \n");
```

This should appear in the questionArea when the level is run

we can give options for the different levels:

```
questionArea.append("\n" +
                "1 - Beginner \n" +
                "2 - Intermediate \n" +
                "3 - Advanced \n");
```

Now we can implement the game logic i.e match input command to correct answer.

we want to check which number was entered

```
handleCommandFunction = new LevelLogic() {
            public void run() {
                if (command.equals("1")) {
                    isFinished = true;
                    // Beginner
                    // Level1 level1 = new Level1(questionArea, answerArea);
                    // level1.start();
                } else if (command.equals("2")) {
                    isFinished = true;
                    // Intermediate
                } else if (command.equals("3")) {
                    isFinished = true;
                    // Advanced
                } else {
                    answerArea.append("\n Not a valid level.");
                }
            };
        };
```

this is new LevelLogic is necessary as it is run whenever a new command is inputted

This Question and Logic combos are handled in phases which will change to next phase when `isFinished = true` inside the level logic

`Helpers.WaitUntilNextPhase(handleCommandFunction);` must be called before the next phase to not prematurely move to the next phase

The finished File looks like [this](../gitgood/src/main/java/com/gitgood/game/levels/LevelSelection.java)
