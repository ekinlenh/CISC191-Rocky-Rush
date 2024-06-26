package edu.sdccd.cisc191;

import edu.sdccd.cisc191.Leaderboard.Leaderboard;
import edu.sdccd.cisc191.MOT.MOTGameScreen;
import edu.sdccd.cisc191.MemoryCard.MemoryCardGameScreen;
import edu.sdccd.cisc191.Player;
import edu.sdccd.cisc191.Scenes.GameTimer;
import edu.sdccd.cisc191.Scenes.ProgressScenes;
import edu.sdccd.cisc191.Scenes.SceneController;
import edu.sdccd.cisc191.aFinalBossBattle.ActOne;
import edu.sdccd.cisc191.aFinalBossBattle.BossBattle;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ArrayList;


public class GUI extends Application {

    protected static Player adventurer = new Player();
    protected static Stage currentStage;
    protected static Label timerLabel = new Label();
    protected static Timeline timer;
    protected static ArrayList<String> games = new ArrayList<>();
    public static SinglyLinkedList<Image> backgrounds = new SinglyLinkedList();
    protected static int count = 0;
    protected static Leaderboard leaderboard = new Leaderboard();

    @Override
    public void start(Stage primaryStage) throws Exception{

        ProgressScenes.randomizeGameOrder();
        ProgressScenes.setBackground();
        currentStage = primaryStage;
        SceneController.createIntroScreen();
        currentStage.setResizable(false);
        currentStage.show();
        GameTimer timer = new GameTimer();
        timer.runTimer();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
