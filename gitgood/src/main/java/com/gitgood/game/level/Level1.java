package com.gitgood.game.level;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JTextArea;

import com.gitgood.game.levels.BaseLevel;
import com.gitgood.game.levels.LevelLogic;
import com.gitgood.game.levels.LevelSelection;
import com.gitgood.game.utils.Helpers;

public class Level1 extends BaseLevel {

    public Level1(JTextArea questionArea, JTextArea answerArea) {
        super(questionArea, answerArea);
    }

    public void start() {
        questionArea.setText("");
        
        // Present the player with a list of basic Git commands to type
        // String[] story = {"Narrator: Welcome to Git good. You need to input the Git Commands which are shown on the right to finish the game.\n I will give hints along the way where it is needed. Good luck!\n" ,
        //     "Lebron James: Hey there, I need you to make my basketball team better by replacing some players on the team.\n You should check out some of the players on other teams which are good right now.\n"};

        // for (String section : story) {
        //     questionArea.append("\n" + section);

        //     Map<String, String> config = new HashMap<>();
        //     config.put("section", section);
        questionArea.setText("");
        questionArea.append("\nWelcome to Level 1! In this level, you will learn how to type basic Git commands.\n\nNarrator: Welcome to Git good. You need to input the Git Commands which are shown on the right to finish the game.\n I will give hints along the way where it is needed. Good luck!\n\n Lebron James: Hey there, I need you to make my basketball team better by replacing some players on the team.\n You should check out some of the players on The-San-Francisco-Supersonics.\n\n Type next to continue\n");

        handleCommandFunction = new LevelLogic() {
            public void run() {
                // Check if the player typed the correct command
                if (this.command.toLowerCase().indexOf("next") == 0) {
                    questionArea.setText("");
                    answerArea.append("\nGood job.");
                    isFinished = true;
                } else {
                    answerArea.append("\nTry again. It's literally just next");
                }
            };
        };

        Helpers.WaitUntilNextPhase(handleCommandFunction);
        questionArea.setText("");
        questionArea.append("\nNarrator: Try listing the directories in the FileSystem \n");
        handleCommandFunction = new LevelLogic() {
            public void run() {
                // Check if the player typed the correct command
                
                questionArea.append("\nNarrator: Try listing the directories in the FileSystem \n");
                if (this.command.toLowerCase().indexOf("git ls") == 0) {
                    questionArea.setText("");
                    answerArea.append("\nWell done!\n C:/Teams to scout\n SF-SuperSonics  Urbanstown Rangers \n");
                    isFinished = true;
                } else {
                    answerArea.append("\nTry LISTING THE SYSTEM contents");
                }
            };
        };

        Helpers.WaitUntilNextPhase(handleCommandFunction);
        questionArea.setText("");
        questionArea.append("\nNarrator: Try changing directories in SF-Supersonics \n");
        handleCommandFunction = new LevelLogic() {
            public void run() {
                // Check if the player typed the correct command

                if (this.command.toLowerCase().indexOf("git cd sf-supersonics") == 0) {
                    answerArea.setText("");
                    answerArea.append("\nWell done");
                    isFinished = true;
                } else {
                    answerArea.append("\nTry CHANGING DIRECTORIES into SF-Supersonics.");
                }
            };
        };

        Helpers.WaitUntilNextPhase(handleCommandFunction);
        questionArea.setText("");
        questionArea.append("\nNarrator: Now list the players in this folder\n");
        handleCommandFunction = new LevelLogic() {
            public void run() {
                // Check if the player typed the correct command
                
//list
                if (this.command.toLowerCase().indexOf("git ls") == 0) {
                    answerArea.setText("");
                    answerArea.append("\nCorrect! Good job. C:/Teams to scout/SF-SuperSonics ...");
                    isFinished = true;
                } else {
                    answerArea.append("\nSame as before, would you believe? Try again");
                }
            };
        };

        Helpers.WaitUntilNextPhase(handleCommandFunction);
        questionArea.setText("");
        questionArea.append("\nLebron James: Move the best player to our team\n C:/Teams to scout/SF-SuperSonics ...\n");
        handleCommandFunction = new LevelLogic() {
            public void run() {
                // Check if the player typed the correct command
                
//lsit
                if (this.command.toLowerCase().indexOf("git mv") == 0) {
                    answerArea.setText("");
                    answerArea.append("\nLeBron James: He's good, nice choice");
                    isFinished = true;
                } else {
                    answerArea.append("\nLeBron James: There are better players to pick");
                }
            };
        };

        Helpers.WaitUntilNextPhase(handleCommandFunction);
        questionArea.setText("");

    questionArea.append("\nNow try checking the other team\n Narrator: Hint, try putting a . before a slash to go up a level\n");

    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
           
            if (this.command.toLowerCase().indexOf("git cd ./") == 0) {
                answerArea.setText("");
                answerArea.append("\nC:/Teams to scout ");
                isFinished = true;
            } else {
                answerArea.append("\nYou got his, try putting a . BEFORE the slash\nHint: use cd space ___");
            }
        };
    };

    Helpers.WaitUntilNextPhase(handleCommandFunction);
    questionArea.setText("");
    questionArea.append("\nList the folders again to see the next team \nC:/Teams to scout");


handleCommandFunction = new LevelLogic() {
    public void run() {
        // Check if the player typed the correct command
        
        if (this.command.toLowerCase().indexOf("git ls") == 0) {
            answerArea.setText("");
            answerArea.append("\nWell done!\n C:/Teams to scout\n SF-SuperSonics  Urbanstown-Rangers \n");
            isFinished = true;
        } else {
            answerArea.append("\nTry LISTING THE SYSTEM contents");
        }
    };
};

Helpers.WaitUntilNextPhase(handleCommandFunction);
questionArea.setText("");
questionArea.append("\nNow change into that teams directory to see their roster \n C:/Teams to scout");
handleCommandFunction = new LevelLogic() {
    public void run() {
        // Check if the player typed the correct command
        
        if (this.command.toLowerCase().indexOf("git cd urbanstown-rangers") == 0) {
            answerArea.setText("");
            answerArea.append("\nWell done!\n C:/Teams to scout/Urbanstown-Rangers \n");
            isFinished = true;
        } else {
            answerArea.append("\nTry CHANGING into Urbanstown-Rangers\nHint: cd is used");
        }
    };
};

Helpers.WaitUntilNextPhase(handleCommandFunction);
questionArea.setText("");
questionArea.append("\nLeBron: You better pick the best player on this team \n C:/Teams to scout");
handleCommandFunction = new LevelLogic() {
    public void run() {
        // Check if the player typed the correct command
        
        if (this.command.toLowerCase().indexOf("git mv") == 0) {
            answerArea.setText("");
//team lsit     
            answerArea.append("\nWell done!\n C:/Teams to scout/Urbanstown-Rangers \n");
            isFinished = true;
        } else {
            answerArea.append("\nLeBron: You know that players trash, try again\nHint: MoVe onto the next team");
        }
    };
};

    Helpers.WaitUntilNextPhase(handleCommandFunction);
    questionArea.setText("");
questionArea.append("\nNarrator: after picking the team members you go to _____  to begin the new team roster(hint its a git command)\n LeBron: We've got to initaise a new team roster for the upcoming matches\n Can you do that for me? \nC:/TeamRoster");
    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            
            if (this.command.toLowerCase().indexOf("git init") == 0) {
                answerArea.setText("");
                answerArea.append("\nWell done!\n The team has been initiaised\n");
                isFinished = true;
            } else {
                answerArea.append("\nHint:Try INITialising the team in git");
            }
        };
    };
    Helpers.WaitUntilNextPhase(handleCommandFunction);
    questionArea.setText("");
    questionArea.append("\nLeBron: Now can you check the team to see the layout\nC:/TeamRoster");
    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            
            if (this.command.toLowerCase().indexOf("git ls") == 0) {
                answerArea.setText("");
                answerArea.append("\nLeBron: Looks like I'm missing from the list you better add me to it or else\n");
                isFinished = true;
            } else {
                answerArea.append("\nListing... you should know it at this stage");
            }
        };
    };
    Helpers.WaitUntilNextPhase(handleCommandFunction);
    questionArea.setText("");
    questionArea.append("\nC:/TeamRoster");
    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            
            if (this.command.toLowerCase().indexOf("git cd ./") == 0) {
                answerArea.setText("");
                answerArea.append("\nC:\n");
                isFinished = true;
            } else {
                answerArea.append("\nCHANGE DIRECTORY into the C drive\nsame as last time cd __");
            }
        };
    };
    Helpers.WaitUntilNextPhase(handleCommandFunction);
    questionArea.setText("");
    questionArea.append("\nLeBron: Now make a new team roster for the Urbanstown-rangers, ____ should be good against them\n Narrator: Switch to a new Branch to do this Hint(You'll need a -c for this)) \nC:/TeamRoster");
    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            
            if (this.command.toLowerCase().indexOf("git switch -c urbanstown-rangers") == 0) {
                answerArea.setText("");
                answerArea.append("\nTeam looks good to me\n");
                isFinished = true;
            } else {
                answerArea.append("\nTry SWTICHING to a new branch\nhint: switch to urbanstown rangers");
            }
        };
    };
    Helpers.WaitUntilNextPhase(handleCommandFunction);
    questionArea.setText("");
    questionArea.append("\n Narrator: Do git branch to see what branch you're on");
    handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            
            if (this.command.toLowerCase().indexOf("git branch") == 0) {
                answerArea.setText("");
                answerArea.append("\nbenchwarmers\n\n");
                isFinished = true;
            } else {
                answerArea.append("\nTry SWTICHING to a new branch");
            }
        };
    };
    Helpers.WaitUntilNextPhase(handleCommandFunction);
    questionArea.setText("");
    questionArea.append("\nLebron: The next team we are going to face are very good on defense so I need you to put one of our players which is on the bench on the team based on that. This is the skills of the players on the bench at the moment.\n\nSteph Curry: Very good for far shots and good against defenders\n\nFrank Ntilikina: good defender\n\nChristano Ronaldo: doesn't play basketball\n\nNarrator: use git switch -c ______(player name) to make a new team with that player");
        handleCommandFunction = new LevelLogic() {
        public void run() {
            // Check if the player typed the correct command
            
            if (this.command.toLowerCase().indexOf("git switch -c steph-curry") == 0) {
                answerArea.setText("");
                answerArea.append("\nLebron: Thanks thats a great decision now I think we have a winning team.\n\n");
                isFinished = true;
            } else {
                answerArea.append("\nTry a different player\n\nHint- keep a - for spaces");
            }
        };
    };
    Helpers.WaitUntilNextPhase(handleCommandFunction);
    // go back to level selection
    nextLevel = new LevelSelection(questionArea, answerArea);

    };
     


}


    
