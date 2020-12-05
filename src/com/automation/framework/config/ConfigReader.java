package com.automation.framework.config;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static void PopulateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }

    private void ReadProperty() throws IOException {

        Properties p = new Properties();
        p.load(getClass().getResourceAsStream("GlobalConfig.properties"));

        // Get Test url from config file
        Settings.TestUrl = p.getProperty("TestURL");

    }
}
