package com.gitgood.game;

import javax.swing.*;
import java.awt.*;

import com.gitgood.game.levels.Level1;

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

        // set bottom panel
        JPanel bottomPanel = bottomPanel();

        // add bottom panel to frame
        frame.add(bottomPanel);

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