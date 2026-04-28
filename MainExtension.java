package com.yourusername.burpextension;

import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import burp.api.montoya.logging.Logging;
import com.yourusername.burpextension.ui.CustomUIProvider;

public class MainExtension implements BurpExtension {

    @Override
    public void initialize(MontoyaApi api) {
        // Set the name of the extension
        api.extension().setName("Niche JWT Manipulator");

        // Set up logging
        Logging logging = api.logging();
        logging.logToOutput("Extension loaded successfully!");

        // Register your custom UI tab
        CustomUIProvider uiProvider = new CustomUIProvider(api);
        api.userInterface().registerSuiteTab("JWT Tool", uiProvider.getTabComponent());
    }
}
