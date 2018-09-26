package com.xicato.xtouchmg;

/**
 * Created by andy on 12/8/17.
 */

enum Operation {
    RECALLSCENE,
    SETINTENSITY,
    RESETRESPONSE,
    DISABLERESPONSE
}

class ButtonConfiguration {
    boolean isEnabled;
    boolean isGroup;
    Operation operation;
    String id;
    String targetNumber;
    String fading;
    String label;

    ButtonConfiguration(boolean isEnabled, boolean isGroup, Operation operation, String id, String targetNumber, String fading, String label){
        this.isEnabled = isEnabled;
        this.isGroup = isGroup;
        this.operation = operation;
        this.id = id;
        this.targetNumber = targetNumber;
        this.fading = fading;
        this.label = label;
    }
}
