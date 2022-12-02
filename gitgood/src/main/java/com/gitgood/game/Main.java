package com.gitgood.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.security.Key;

import com.gitgood.game.levels.BaseLevel;
import com.gitgood.game.levels.Level;
import com.gitgood.game.levels.beginner.Level1;
import com.gitgood.game.utils.StretchIcon;

/**
 * Hello world!
 *
 */

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

}

class App {
    private JFrame frame;
    private SpringLayout layout;
    private Level level; 
    private JTextArea questionArea;
    private JTextArea answerArea;
    public void run() {
        createAndShowGUI();
        level = new BaseLevel(questionArea, answerArea);
        level.start();

    }

    void createAndShowGUI() {
        setDarkMode();
        this.frame = new JFrame("LeGit (Git Good)     ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        // create a layout manager
        this.layout = new SpringLayout();
        frame.setLayout(layout);

        // add bottom panel to frame
        JPanel bottomPanel = bottomPanel();

        // add top left panel to frame
        JPanel topLeftPanel = topLeftPanel();

        // add top right panel to frame
        JPanel topRightPanel = topRightPanel();

        // attach top left panel to bottom panel
        // attach top left panel to top right panel
        layout.putConstraint(SpringLayout.EAST, topLeftPanel, 0, SpringLayout.WEST, topRightPanel);

        // attach top right panel to bottom panel
        layout.putConstraint(SpringLayout.SOUTH, topLeftPanel, 0, SpringLayout.NORTH, bottomPanel);

        frame.add(bottomPanel);
        frame.add(topLeftPanel);
        frame.add(topRightPanel);

        frame.setVisible(true);
    }

    JPanel bottomPanel() {
        // anchor bottom panel to bottom of frame

        JPanel bottomPanel = new JPanel();

        layout.putConstraint(SpringLayout.WEST, bottomPanel, 0, SpringLayout.WEST, frame.getContentPane());
        layout.putConstraint(SpringLayout.EAST, bottomPanel, 0, SpringLayout.EAST, frame.getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, bottomPanel, 0, SpringLayout.SOUTH, frame.getContentPane());

        JLabel command = new JLabel("command");
        bottomPanel.add(command);

        final JTextField commandText = new JTextField(20);
        commandText.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyPressed(KeyEvent e) {
                // print out the key that was pressed
                System.out.println(e.getKeyChar());
                // if the key that was pressed was enter
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // get the text from the command text field
                    String command = commandText.getText();
                    // if the command is "help"
                    matchCommand(command);

                    // clear the command text field
                    commandText.setText("");
                }


            }

           

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub

            }
        });

        bottomPanel.add(commandText);
        return bottomPanel;

    }


    
    JPanel topLeftPanel() {
        JPanel topLeftPanel = new JPanel();
        layout.putConstraint(SpringLayout.WEST, topLeftPanel, 0, SpringLayout.WEST, frame.getContentPane());
        layout.putConstraint(SpringLayout.NORTH, topLeftPanel, 0, SpringLayout.NORTH, frame.getContentPane());

        // big text area
        questionArea = new JTextArea(8, 40);
        questionArea.setEditable(false);
        questionArea.setLineWrap(true);
        questionArea.setWrapStyleWord(true);
        questionArea.setText("Question Area");
        
        JScrollPane questionAreaScroll = new JScrollPane (questionArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);


        topLeftPanel.add(questionAreaScroll);

        // big text area
        answerArea = new JTextArea(20, 40);
        answerArea.setEditable(false);
        answerArea.setLineWrap(true);
        answerArea.setWrapStyleWord(true);
        answerArea.setText("Text Area");
       
        JScrollPane answerAreaScroll = new JScrollPane (answerArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        topLeftPanel.add(answerAreaScroll);
        return topLeftPanel;
    }

    JPanel topRightPanel() {
        JPanel topRightPanel = new JPanel();
        layout.putConstraint(SpringLayout.EAST, topRightPanel, 0, SpringLayout.EAST, frame.getContentPane());
        layout.putConstraint(SpringLayout.NORTH, topRightPanel, 0, SpringLayout.NORTH, frame.getContentPane());
        // stretch icon to fit panel

        // Image image = new ImageIcon("src/main/resoug").getImage();
        // StretchIcon icon = new StretchIcon(image);
        // JLabel label = new JLabel(icon);
        // topRightPanel.add(label);

        // add an image level1.png
        // ImageIcon imageIcon = new ImageIcon("gitgood/level1.png");
        // JLabel imageLabel = new JLabel(imageIcon);
        // topRightPanel.add(imageLabel);

        JLabel label = new JLabel(new StretchIcon("gitgood/level1.png", false));
        label.setPreferredSize(new Dimension(500, 500));
        topRightPanel.add(label);

        return topRightPanel;
    }

    static void setDarkMode() {
        // set panel to black background

        UIManager.put("control", new Color(128, 128, 128));
        UIManager.put("info", new Color(128, 128, 128));
        UIManager.put("nimbusBase", new Color(18, 30, 49));
        UIManager.put("nimbusAlertYellow", new Color(248, 187, 0));
        UIManager.put("nimbusDisabledText", new Color(128, 128, 128));
        UIManager.put("nimbusFocus", new Color(115, 164, 209));
        UIManager.put("nimbusGreen", new Color(176, 179, 50));
        UIManager.put("nimbusInfoBlue", new Color(66, 139, 221));
        UIManager.put("nimbusLightBackground", new Color(18, 30, 49));
        UIManager.put("nimbusOrange", new Color(191, 98, 4));
        UIManager.put("nimbusRed", new Color(169, 46, 34));
        UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
        UIManager.put("nimbusSelectionBackground", new Color(104, 93, 156));
        UIManager.put("text", new Color(230, 230, 230));
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (javax.swing.UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Show your JFrame
    }


    private void matchCommand(String command) {
        level.handleCommand(command);
    }



}
