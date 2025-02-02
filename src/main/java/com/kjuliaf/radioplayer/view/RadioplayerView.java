package com.kjuliaf.radioplayer.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class RadioplayerView {

    /**
     * Creates view.
     */
    public RadioplayerView() {
        JFrame frame = new JFrame("SR Radioplayer");
        frame.setMinimumSize(new Dimension(700, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(buildTopPanel(), BorderLayout.NORTH);
        frame.setVisible(true);
    }

    /**
     * Builds top panel containing logo and title.
     * @return top panel.
     */
    private JPanel buildTopPanel() {
        JPanel topPanel = new JPanel();

        topPanel.setBackground(Color.BLACK);
        addLogo(topPanel);
        addTitle(topPanel);

        return topPanel;
    }

    /**
     * Adds logo to panel.
     * @param panel the panel to add the logo to.
     */
    private void addLogo(JPanel panel) {
        JLabel logo = new JLabel();
        BufferedImage logoImg = null;
        try {
            logoImg = resize(ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/logo.jpg"))));
        } catch (IOException | NullPointerException e) { System.out.println("Could not load img"); }
        if (logoImg != null) {
            logo.setIcon(new ImageIcon(logoImg));
            panel.add(logo);
        }
    }

    /**
     * Adds title to panel.
     * @param panel the panel to add the title to.
     */
    private void addTitle(JPanel panel) {
        JLabel title = new JLabel("Radioplayer");
        title.setFont(new Font("Sansserif", Font.BOLD, 24));
        title.setForeground(Color.WHITE);

        panel.add(title);
    }

    /**
     * Resizes image to 70x70x.
     * @param img the image to resize.
     * @return the resized image.
     */
    private BufferedImage resize(BufferedImage img) {
        Image temp = img.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        BufferedImage resizedImg = new BufferedImage(70, 70, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = resizedImg.createGraphics();
        g2d.drawImage(temp, 0, 0, null);
        g2d.dispose();

        return resizedImg;
    }
}
