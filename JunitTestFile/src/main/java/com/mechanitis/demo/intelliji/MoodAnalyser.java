package com.mechanitis.demo.intelliji;


/*
 * Testcase for Mood Analyser
 * @author: vamsi Krishna A
 * @purpose: Junit test case for moodAnalyser class work practice
 * @date:20/09/2021*/

public class MoodAnalyser {
    public String analyseMood(String message) {
        //condition for a test case of Mood Analyser
        if (message.contains(("sad"))) {
            return "SAD";
        }else {
            return "HAPPY";
        }
    }
}
