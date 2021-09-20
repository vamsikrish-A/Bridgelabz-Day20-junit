package com.mechanitis.demo.intelliji;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
/*
* Testcase for Mood Analyser
* @author: vamsi Krishna A
* @purpose: Junit test case for moodAnalyser class work practice
* @date:20/09/2021*/
public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis() throws Exception {

        MoodAnalyser moodAnalyser =  new MoodAnalyser();

        String mood = moodAnalyser.analyseMood("this is a sad message.");

        //Writing Assertions with Hamcrest
        /* by using GRADLE dependency , by implementing hamcrest-library, we get assertThat()
        * method in junit5, writing a class for boolean  values */
        @DisplayName("write assertions for booleans")
        class BooleanAssertionsTest {
            @Nested
            @DisplayName("When boolean is true")
            class WhenBooleanIsTrue {
                @Test
                @DisplayName("should be true")
                void shouldBeTrue() {
                    assertThat(mood,is("SAD"));
                }

            }
        }


    }
    @Test
    public void Happymood() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("this is Happy message.");

        //Writing Assertions with Hamcrest

        /* by using GRADLE dependency , by implementing hamcrest-library, we get assertThat()
         * method in junit5, writing a class for boolean  values */

        @DisplayName("write assertions for booleans")
        class BooleanAssertionsTest {
            @Nested
            @DisplayName("When boolean is true")
            class WhenBooleanIsTrue {
                @Test
                @DisplayName("should be true")
                void shouldBeTrue() {
                    assertThat(mood,is("SAD"));
                }

            }
        }

    }
}
