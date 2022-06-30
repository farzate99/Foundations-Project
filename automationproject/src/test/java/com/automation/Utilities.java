package com.automation;

import com.automation.runner.TestRunner;

public class Utilities {
    public static void waitFor(int seconds) {
        // Write code here that turns the phrase above into concrete actions
        try {
            Thread.sleep(1000L * seconds);
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
    }
}
