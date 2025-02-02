package com.kjuliaf.radioplayer;

import com.kjuliaf.radioplayer.controller.RadioplayerController;

import javax.swing.*;

public class Radioplayer {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(RadioplayerController::new);
    }
}
