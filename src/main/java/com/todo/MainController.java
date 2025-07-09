package com.todo;

public class MainController {

    public void startOnAction() {
        try {
            App.setRoot("login");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exitOnAction() {
        System.exit(0);
    }
}
