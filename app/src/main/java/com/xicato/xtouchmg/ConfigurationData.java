package com.xicato.xtouchmg;

import java.util.Map;

/**
 * Created by andy on 12/8/17.
 */

class ConfigurationData {
    Map<String, String> serverTokens;
    String network;
    ButtonConfiguration[] buttonConfigs;
    String foregroundColor;
    String backgroundColor;
    String savedUser;
    String savedPassword;

    ConfigurationData(Map<String,String> serverTokens, String network, ButtonConfiguration[] buttonConfigs) {
        this.serverTokens = serverTokens;
        this.network = network;
        this.buttonConfigs = buttonConfigs;
    }
}
