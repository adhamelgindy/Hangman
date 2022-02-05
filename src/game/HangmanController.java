package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class HangmanController implements Initializable {

	@FXML
	private Text hangmanTextArea;

	@FXML
	private TextField guess;

	@FXML
	private Text textForWord;

	@FXML
	private Text endOfGameText;

	@FXML
	private Text numberLivesLeft;

	@FXML
	private Button playAgainButton;


	//***************
	@FXML
	private Rectangle stick1;

	@FXML
	private Rectangle stick2;

	@FXML
	private Rectangle stick3;

	@FXML
	private Rectangle rope;

	@FXML
	private Circle head;

	@FXML
	private Rectangle body;

	@FXML
	private Rectangle Rhand1;

	@FXML
	private Rectangle Lhand1;

	@FXML
	private Rectangle RL1;

	@FXML
	private Rectangle LL1;

	@FXML
	private Circle Rhand2;

	@FXML
	private Circle Lhand2;

	@FXML
	private Circle RL;

	@FXML
	private Circle LL2;
	//******************

	private StringBuilder secretWord = new StringBuilder();

	private int livesPos = 0;

	HangmanModel game = new HangmanModel();

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		hangmanTextArea.setText(game.hangManLives.get(livesPos));

	}

	private String word;

	@FXML
	public void getTextInput(ActionEvent event) {

		if(word == null){
			word = game.generateRandomWord();
			setupWord();
			guess.clear();
		} else{
			playTurn();
		}

	}

	//	String setSecretWord() {
	//		return "******";
	//	}

	@FXML
	public void setupWord(){
		int wordLength = word.length();
		secretWord.append("*".repeat(wordLength));
		textForWord.setText(String.valueOf(secretWord));
	}

	@FXML
	public void playTurn(){
		String guess = this.guess.getText();//gets the written word by the player
		ArrayList<Integer> positions = new ArrayList<>(); //position of letters in the correct word
		char[] wordChars = word.toCharArray();
		char letterGuess = guess.charAt(0);

		if(word.equals(guess)){
			endOfGameText.setText("U saved me, I owe you my life!! ＼(°o°)／");
			hangmanTextArea.setText("                 +---+\r\n"
					+               "                       |\r\n"
					+               "                      |\r\n"
					+               "             O       |\r\n"
					+               "            /|\\     |\r\n"
					+               "            / \\      |\r\n"
					+               "         =========");
			return;
		}
		//String [] lives = {"6", "5", "4", "3", "2", "1", "0"};
		if(word.contains(guess)){ // if the word contains those characters

			numberLivesLeft.setText("✓"); //right letter
			for (int i = 0; i < word.length(); i++) { //iterate over all the letters of the word 
				if(wordChars[i] == letterGuess){
					positions.add(i);
				}
			}
			positions.forEach(pos ->{
				secretWord.setCharAt(pos,letterGuess);
			});

			textForWord.setText(String.valueOf(secretWord));
		} else {
			hangmanTextArea.setText(game.hangManLives.get(++livesPos));

			numberLivesLeft.setText("✗");



			if(livesPos == 6){
				endOfGameText.setText("Your hero died!! (个_个)");
			}
		}
	}

	@FXML
	void reset(ActionEvent event) {
		secretWord.setLength(0);
		textForWord.setText("");
		word = null;
		//		getTextInput(event);
		livesPos = 0;
		hangmanTextArea.setText(game.hangManLives.get(0));
		endOfGameText.setText("");
	}
}