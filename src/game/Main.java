package game;
	
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.AudioClip;


public class Main extends Application {
	//--module-path "C:\Beuth\SE1\javafx-sdk-11.0.2\lib" --add-modules=ALL-MODULE-PATH
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("game.fxml"));
			
			AudioClip audioClip = new AudioClip(getClass().getResource("background.mp3").toString());
			audioClip.setCycleCount(AudioClip.INDEFINITE); // Ohne Ende wiederholen
			audioClip.play();

			
			Scene scene = new Scene(root, 700, 500);
			primaryStage.setTitle("Hangman");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		launch(args);
		HangmanController c = new HangmanController();
		//c.getTextInput();
		//Model m = new Model();
		//m.visualisieren();
	}
}
