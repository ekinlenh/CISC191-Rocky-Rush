package edu.sdccd.cisc191.Scenes;

import edu.sdccd.cisc191.Player;
import edu.sdccd.cisc191.Scenes.GameTimer;
import edu.sdccd.cisc191.Scenes.ProgressScenes;
import edu.sdccd.cisc191.Scenes.SceneController;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ArrayList;


public class GUI extends Application {

    protected static Player adventurer = new Player();
    protected static Stage currentStage;
    protected static int gamesWon = 0;
    protected static Label timerLabel = new Label();
    protected static Timeline timer;

    protected static ArrayList<String> games = new ArrayList<>();
    protected static Image[] backgrounds;
    protected static int count = 0;
    protected static int backGroundImage = 0;

    @Override
    public void start(Stage primaryStage) throws Exception{
        ProgressScenes.randomizeGameOrder();
        ProgressScenes.setBackground();

        currentStage = primaryStage;
        SceneController scenes = new SceneController();
        scenes.updateGoldLabel();
        scenes.createIntroScreen();
        currentStage.setResizable(false);
        currentStage.show();
        GameTimer timer = new GameTimer();
        timer.runTimer();

    }

    public static void main(String[] args) {
        launch(args);
    }
}