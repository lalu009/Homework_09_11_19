package com.xcart.demostore.loadproperties;

import com.xcart.demostore.basepage.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class LoadProperties extends BasePage {
    static Properties prop;

    static FileInputStream input;

    String projectPath = System.getProperty("user.dir");

    public String getProperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream(projectPath + "\\src\\test\\java\\com\\xcart\\demostore\\resources\\propertyfiles\\config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

}
