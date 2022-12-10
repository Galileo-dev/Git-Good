package com.gitgood.game.level;


import javax.swing.JTextArea;

import com.gitgood.game.levels.BaseLevel;
import com.gitgood.game.levels.LevelLogic;
import com.gitgood.game.levels.LevelSelection;
import com.gitgood.game.utils.Helpers;

public class Level2 extends BaseLevel {

    public Level2(JTextArea questionArea, JTextArea answerArea) {
        super(questionArea, answerArea);
    }

    public void start() {


        handleCommandFunction = new LevelLogic() {
            public void run() {
                // Check if the player typed the correct command
                if (this.command.toLowerCase().indexOf("next") == 0) {
                    questionArea.setText("");
                    answerArea.setText("");
                    questionArea.append("You're the famous scientist Chuck Norris, a Nobel Prize winner for your self made rocket ship to mars\n");
                    questionArea.append("It's a lazy Sunday  after a long weeks work, you flop onto the couch and turn on the news\nTo your shock and horror the headine is terrible,\nA rocket is on a crash course to your city and upon further inspection its yours!\nOnly you can save the day will you take up this task?\nYes or no? Will you save the day?\n");
                    isFinished = true;
                } else {
                    answerArea.append("\nTry again. It's literally just next");
                }
            };
        };

        Helpers.WaitUntilNextPhase(handleCommandFunction);

        handleCommandFunction = new LevelLogic() {
            public void run() {
                // Check if the player typed the correct command
                if (this.command.toLowerCase().indexOf("yes") == 0) {
                    questionArea.setText("");
                    answerArea.setText("");
                    questionArea.append("You begin to frantically search around your apartment searching for any bit of the code that controls the ship\nTo your dismay you realise you lost it when you switched computers and have no way to retrieve it\nNext to continue");
                    isFinished = true;
                } else {
                    answerArea.append("\nDon't you want to save your town and its people, there's only one way to go you know this\n");
                }
            };
        };

        Helpers.WaitUntilNextPhase(handleCommandFunction);

        handleCommandFunction = new LevelLogic() {
            public void run() {
                // Check if the player typed the correct command
                if (this.command.toLowerCase().indexOf("next") == 0) {
                    questionArea.setText("");
                    answerArea.setText("");
                    questionArea.append("Your only chance is to connect with the rocket itself and clone the code down directly\nFrom the only source left\nThe rocket itself\nNext to continue");
                    isFinished = true;
                } else {
                    answerArea.append("\nTry again. It's literally just next");
                }
            };
        };

        Helpers.WaitUntilNextPhase(handleCommandFunction);



    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            if (this.command.toLowerCase().indexOf("next") == 0) {
                questionArea.setText("");
answerArea.setText("");
                questionArea.append("You look throught your notes and find the link to the repo on the ship https://github.com/test.git\n Using this you can clone down the repo using git\nYou can still save the town");
                isFinished = true;
            } else {
                answerArea.append("\nTry again. It's literally just next");
            }
        };
    };

    Helpers.WaitUntilNextPhase(handleCommandFunction);

    

    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            if (this.command.toLowerCase().indexOf("git clone") == 0) {
                questionArea.setText("");
answerArea.setText("");
                questionArea.append("You cloned down the repo\nNow you need to get to the important files\nGet into the right directory to make the changes\n C:/RocketShipCode");
                isFinished = true;
            } else {
                answerArea.append("\nTry CLONING the repo and putting the URL at the end");
            }
        };
    };

    Helpers.WaitUntilNextPhase(handleCommandFunction);

    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            if (this.command.toLowerCase().indexOf("ls") == 0) {
                questionArea.setText("");
answerArea.setText("");
                questionArea.append("C:/RocketShipCode\nNavigation-files    Engine-files    Readme.md");
                isFinished = true;
            } else {
                answerArea.append("\nYou know how to list files");
            }
        };
    };

    Helpers.WaitUntilNextPhase(handleCommandFunction);

    
    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            if (this.command.toLowerCase().indexOf("cd navigation-files") == 0) {
                questionArea.setText("");
answerArea.setText("");
                questionArea.append("C:/RocketShipCode/Navigation-files");
                isFinished = true;
            } else {
                answerArea.append("\nAs far as you could tell from the news it seems to be a navigation failure in the ship\nThe problem might be with its code\nTry CHANGING DIRECTORY into the relevant one");
            }
        };
    };

    Helpers.WaitUntilNextPhase(handleCommandFunction);

    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            if (this.command.toLowerCase().indexOf("ls") == 0) {
                questionArea.setText("");
answerArea.setText("");
                questionArea.append("C:/RocketShipCode/Navigation-files\nsrc    bin     .gitignore");
                isFinished = true;
            } else {
                answerArea.append("\nSame as before, no hints this time, you just need to find the right folder");
            }
        };
    };


    Helpers.WaitUntilNextPhase(handleCommandFunction);
    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            if (this.command.toLowerCase().indexOf("cd src") == 0) {
                questionArea.setText("");
                answerArea.setText("");
                questionArea.append("C:/RocketShipCode/Navigation-files/src");
                isFinished = true;
            } else {
                answerArea.append("\nWe know code is stored in src");
            }
        };
    };

    Helpers.WaitUntilNextPhase(handleCommandFunction);

    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            if (this.command.toLowerCase().indexOf("ls") == 0) {
                questionArea.setText("");
                answerArea.setText("");
                questionArea.append("C:/RocketShipCode/Navigation-files/src\nERROR -> Navigation.java");
                questionArea.append("\nYou found the broken code!\nYou fix it in a flash!\nAll it was was one semicolon!\nHow did you miss that before?\nNow you need to check the status of the repo before going further.");
                isFinished = true;
            } else {
                answerArea.append("\nYou still need me to tell you what to do at this stage?");
            }
        };
    };

    Helpers.WaitUntilNextPhase(handleCommandFunction);

    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            if (this.command.toLowerCase().indexOf("git status") == 0) {
                questionArea.setText("");
                answerArea.setText("");
                questionArea.append("This is a list of all the changed files in your repo\n You need to save them by adding them to a staging environment");
                questionArea.append("C:/RocketShipCode/Navigation-files/src\nModified -> Navigation.java");
                isFinished = true;
            } else {
                answerArea.append("\nI give up, do you even read the text? It's git status");
            }
        };
    };

    Helpers.WaitUntilNextPhase(handleCommandFunction);

    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            if (this.command.toLowerCase().indexOf("git add") == 0) {
                questionArea.setText("");
                answerArea.setText("Well done!");
                questionArea.append("Now its a good practice to check your status after every change");
                isFinished = true;
            } else {
                answerArea.append("\nTry ADDING the file using git");
            }
        };
    };

    Helpers.WaitUntilNextPhase(handleCommandFunction);

    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            if (this.command.toLowerCase().indexOf("git status") == 0) {
                questionArea.setText("");
                answerArea.setText("");
                questionArea.append("C:/RocketShipCode/Navigation-files/src\nAdded -> Navigation.java\nOnly one stage left, you need to commmit your changes with a memorable message");
                isFinished = true;
            } else {
                answerArea.append("\nYou go this");

            }
        };
    };
    Helpers.WaitUntilNextPhase(handleCommandFunction);

            handleCommandFunction = new LevelLogic() {
                public void run() {
                    // Check if the player typed the correct command
                    if (this.command.toLowerCase().indexOf("git commit -m") == 0) {
                        questionArea.setText("");
                        answerArea.setText("Well done!");
                        questionArea.append("Now your code is ready to be shipped, but just in case do status again");
                        isFinished = true;
                    } else {
                        answerArea.append("\nThe tricky part about this is the part to add a message, its a -m\nAlso no need to specify what you're commiting");
                    }
                };
            };
        
            Helpers.WaitUntilNextPhase(handleCommandFunction);

            handleCommandFunction = new LevelLogic() {
                public void run() {
                    // Check if the player typed the correct command
                    if (this.command.toLowerCase().indexOf("git status") == 0) {
                        questionArea.setText("");
                        answerArea.setText("");
                        questionArea.append("C:/RocketShipCode/Navigation-files/src\nNothing to commit\nNow you need to push it to the ship!\nDon't forget to add the origin of the push\nUse git branch to check what it is");
                        isFinished = true;
                    } else {
                        answerArea.append("\n...");
                    }
                };
            };
        
            Helpers.WaitUntilNextPhase(handleCommandFunction);
            
            handleCommandFunction = new LevelLogic() {
                public void run() {
                    // Check if the player typed the correct command
                    if (this.command.toLowerCase().indexOf("git branch") == 0) {
                        questionArea.setText("");
                        answerArea.setText("");
                        questionArea.append("Now that you know the origin push it to the ship!\nDon't forget to add the origin to it\nOn branch main");
                        isFinished = true;
                    } else {
                        answerArea.append("Try again, you've done this before, think back");
                    }
                };
            };
        
            Helpers.WaitUntilNextPhase(handleCommandFunction);
        
            handleCommandFunction = new LevelLogic() {
                public void run() {
                    // Check if the player typed the correct command
                    if (this.command.toLowerCase().indexOf("git push origin main") == 0) {
                        questionArea.setText("");
                        questionArea.append("As you're about to push you remember you added a failsafe to stop pushing to the main\nYou need to push the code on a branch instead for safety\nMake a new branch to do this");
                        isFinished = true;
                    } else {
                        answerArea.append("\nTry referencing the ORIGIN in the push");
                    }
                };
            };
        
            Helpers.WaitUntilNextPhase(handleCommandFunction);
        
    

    Helpers.WaitUntilNextPhase(handleCommandFunction);

    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            if (this.command.toLowerCase().indexOf("git switch -c") == 0) {
                questionArea.setText("");
                answerArea.setText("Well done!");
                questionArea.append("You're now on the new branch\nAll that's left to do is push the code,\nusing your new origin");
                isFinished = true;
            } else {
                answerArea.append("\nYou remember this from LeBron, its like SWITCHING branches with a little addition.");
            }
        };
    };

    Helpers.WaitUntilNextPhase(handleCommandFunction);

    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            if (this.command.toLowerCase().indexOf("git push origin") == 0) {
                questionArea.setText("");
                questionArea.append("It's done! You pushed the code and sucessfully save the town!\nYou can now kick up your legs and rest easy after this stressful time\n");
                isFinished = true;
            } else {
                answerArea.append("\nTry pushing with the new origin this time");
            }
        };
    };

    Helpers.WaitUntilNextPhase(handleCommandFunction);
    LevelSelection levelSelection = new LevelSelection(questionArea, answerArea);
    levelSelection.start();
    }
}

    
