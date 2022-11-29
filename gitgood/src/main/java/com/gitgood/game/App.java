package com.gitgood.game;

import javax.swing.*;
import java.awt.*;

import com.gitgood.game.levels.Level1;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        createAndShowGUI();

    }

    static void createAndShowGUI() {
        setDarkMode();
        JFrame frame = new JFrame("LeGit (Git Good)     ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        // create a layout manager
        SpringLayout layout = new SpringLayout();
        frame.setLayout(layout);

        JPanel panel = new JPanel();
        frame.add(panel);

        // panel fill frame
        // layout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH,
        // frame.getContentPane());
        layout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, frame.getContentPane());
        // layout.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST,
        // frame.getContentPane());

        // anchor to the bottom of the frame
        layout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, frame.getContentPane());

        JLabel command = new JLabel("command");
        panel.add(command);

        // add a text field to the frame under the label
        JTextField commandText = new JTextField(20);
        panel.add(commandText);

        // add a button to the frame under the text field
        JButton button = new JButton("Execute");
        panel.add(button);
        // set dark mode

        frame.setVisible(true);

        // set panel to black background
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
