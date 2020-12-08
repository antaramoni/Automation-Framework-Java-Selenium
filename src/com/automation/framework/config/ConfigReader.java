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


        Properties p1 = new Properties();
        p1.load(getClass().getResourceAsStream("TestConfig.properties"));

        // Get Test data from config file
        Settings.SingleKey = p1.getProperty("SingleKey");
        Settings.DoubleKey = p1.getProperty("DoubleKey");
        Settings.InvalidKey = p1.getProperty("InvalidKey");
        Settings.ValidKey1 = p1.getProperty("ValidKey1");
        Settings.PartialValidKey = p1.getProperty("PartialValidKey");
        Settings.ValidKey2 = p1.getProperty("ValidKey2");

    }
}
