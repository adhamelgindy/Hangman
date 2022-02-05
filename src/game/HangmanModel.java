package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HangmanModel {
	
	String textForWord;
	
	String guess;
	
	String endOfGameText;
	
	String hangmanTextArea;
	
	String rightWrongText;

	private StringBuilder secretWord = new StringBuilder();

	private int livesPos = 0;
		
	private String word;

	ArrayList<String> hangManLives = new ArrayList<>(Arrays.asList(
	          "            +---+\r\n"
			+ "            |   |\r\n"
			+ "                |\r\n"
			+ "                |\r\n"
			+ "                |\r\n"
			+ "                |\r\n"
			+ "          =========\"\"\"",
			
			          "            +---+\r\n"
					+ "            |   |\r\n"
					+ "            O   |\r\n"
					+ "                |\r\n"
					+ "                |\r\n"
					+ "                |\r\n"
					+ "          =========\"\"\"",
					          "            +---+\r\n"
							+ "            |   |\r\n"
							+ "            O   |\r\n"
							+ "            |   |\r\n"
							+ "                |\r\n"
							+ "                |\r\n"
							+ "          =========\"\"\"",

							          "            +---+\r\n"
									+ "            |   |\r\n"
									+ "            O   |\r\n"
									+ "           /|   |\r\n"
									+ "                |\r\n"
									+ "                |\r\n"
									+ "          =========" ,
									          "            +---+\r\n"
											+ "            |   |\r\n"
											+ "            O   |\r\n"
											+ "           /|\\  |\r\n"
											+ "                |\r\n"
											+ "                |\r\n"
											+ "          =========",
											          "            +---+\r\n"
													+ "            |   |\r\n"
													+ "            O   |\r\n"
													+ "           /|\\  |\r\n"
													+ "           /    |\r\n"
													+ "                |\r\n"
													+ "          =========\"\"",
													          "            +---+\r\n"
															+ "            |   |\r\n"
															+ "            O   |\r\n"
															+ "           /|\\  |\r\n"
															+ "           / \\  |\r\n"
															+ "                 |\r\n"
															+ "          ========="
	));
	
	public StringBuilder getSecretWord() {
		return secretWord;
	}

	public void setSecretWord(StringBuilder secretWord) {
		this.secretWord = secretWord;
	}
	
	public int getLivesPos() {
		return livesPos;
	}

	public void setLivesPos(int livesPos) {
		this.livesPos = livesPos;
	}
	
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public ArrayList<String> getHangManLives() {
		return hangManLives;
	}

	public void setHangManLives(ArrayList<String> hangManLives) {
		this.hangManLives = hangManLives;
	}
	
	
	

	public String generateRandomWord() {

		List<String> superHeroes = new ArrayList<String>();
		
		superHeroes.add("antman");
		superHeroes.add("aquaman");
		superHeroes.add("asterix");
		superHeroes.add("atom");
		superHeroes.add("avenger");
		superHeroes.add("batgirl");
		superHeroes.add("batman");
		superHeroes.add("catwoman");
		superHeroes.add("daredevil");
		superHeroes.add("elektra");
		superHeroes.add("hawkeye");
		superHeroes.add("hellboy");
		superHeroes.add("ironman");
		superHeroes.add("hulk");
		superHeroes.add("spiderman");
		superHeroes.add("superman");
		superHeroes.add("thor");
		superHeroes.add("wolverine");
		superHeroes.add("xmen");
		superHeroes.add("ironMan");
		superHeroes.add("morpheus");
		superHeroes.add("hancock");
		superHeroes.add("robin");
		superHeroes.add("cyborg");
		superHeroes.add("beastboy");
		superHeroes.add("raven");
		superHeroes.add("hercules");
		superHeroes.add("blackpanther");
		superHeroes.add("orion");
		superHeroes.add("greenarrow");
		superHeroes.add("professorx");
		superHeroes.add("adham");
		superHeroes.add("donatello");
		superHeroes.add("flash");
		
		//double i = Math.random();
		Random rn = new Random();
		int number = rn.nextInt(33) + 0;
		String myWord = superHeroes.get(number);
		myWord.toLowerCase();

		return myWord;

	}

}

