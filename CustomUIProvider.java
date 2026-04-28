package com.yourusername.burpextension.ui;

import burp.api.montoya.MontoyaApi;
import javax.swing.*;
import java.awt.*;

public class CustomUIProvider {
    private final JPanel mainPanel;

    public CustomUIProvider(MontoyaApi api) {
        mainPanel = new JPanel(new BorderLayout());
        
        // Add a clean label and a button to start
        JLabel title = new JLabel("Advanced JWT Manipulator", SwingConstants.CENTER);
        JButton startButton = new JButton("Start Multithreaded Scan");
        
        // Example of starting a new thread when clicked to prevent UI freezing
        startButton.addActionListener(e -> {
            api.logging().logToOutput("Starting task...");
            new Thread(() -> {
                // Call your core multithreaded logic here
                // JwtProcessor.processCustomLogic();
                api.logging().logToOutput("Task running in background thread...");
            }).start();
        });

        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(startButton, BorderLayout.CENTER);
    }

    public Component getTabComponent() {
        return mainPanel;
    }
}
