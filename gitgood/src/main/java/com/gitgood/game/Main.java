package com.gitgood.game;

import javax.swing.*;

import com.GameLogic.levels.Level1;

import java.awt.*;

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

    public void run() {
        createAndShowGUI();

    }

    void createAndShowGUI() {
        setDarkMode();
        this.frame = new JFrame("LeGit (Git Good)     ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        // create a layout manager
        this.layout = new SpringLayout();
        frame.setLayout(layout);

        // add bottom panel to frame
        JPanel bottomPanel = bottomPanel();
        frame.add(bottomPanel);

        // add top left panel to frame
        JPanel topLeftPanel = topLeftPanel();
        frame.add(topLeftPanel);

        // add top right panel to frame
        JPanel topRightPanel = topRightPanel();
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

        JTextField commandText = new JTextField(20);
        bottomPanel.add(commandText);
        return bottomPanel;

    }

    JPanel topLeftPanel() {
        JPanel topLeftPanel = new JPanel();
        layout.putConstraint(SpringLayout.WEST, topLeftPanel, 0, SpringLayout.WEST, frame.getContentPane());
        layout.putConstraint(SpringLayout.NORTH, topLeftPanel, 0, SpringLayout.NORTH, frame.getContentPane());

        // big text area
        JTextArea textArea = new JTextArea(25, 40);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setText("hello world");
        topLeftPanel.add(textArea);

        return topLeftPanel;
    }

    JPanel topRightPanel() {
        JPanel topRightPanel = new JPanel();
        layout.putConstraint(SpringLayout.EAST, topRightPanel, 0, SpringLayout.EAST, frame.getContentPane());
        layout.putConstraint(SpringLayout.NORTH, topRightPanel, 0, SpringLayout.NORTH, frame.getContentPane());

        // add an image level1.png
        ImageIcon imageIcon = new ImageIcon("gitgood/level1.png");
        JLabel imageLabel = new JLabel(imageIcon);
        topRightPanel.add(imageLabel);

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
}
