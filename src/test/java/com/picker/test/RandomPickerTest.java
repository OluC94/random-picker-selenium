package com.picker.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RandomPickerTest {

    @BeforeEach
    public void setUp() {
        Configuration.browserSize = "1200x800";
        open("https://random-picker-olu.netlify.app/");
    }

    @Test
    public void randomPickerTest() {

        // Verify initial state
        $("[data-testid='selected-word']").shouldHave(exactText("Click the button"));
        $("[data-testid='input-area']").shouldHave(exactText("JavaScript\nPython\nPHP\nJava\nC#"));
    }
}
