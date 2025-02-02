package com.kjuliaf.radioplayer.controller;

import com.kjuliaf.radioplayer.model.RadioplayerModel;
import com.kjuliaf.radioplayer.view.RadioplayerView;

public class RadioplayerController {
    private final RadioplayerModel radioPlayerModel;
    private final RadioplayerView radioplayerView;

    /**
     * Creates controller.
     */
    public RadioplayerController() {
        radioPlayerModel = new RadioplayerModel();
        radioplayerView = new RadioplayerView();
    }
}
