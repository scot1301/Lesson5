package dice;
import java.util.Random;
public class Dice {
private int diceLength;
	private int[] rolls;
	private int[] sides;
	private int numRolls = 0;
	public Dice (int nDice) {
		diceLength = nDice;
		rolls = new int[nDice];
		sides = new int[nDice];
	}
	void addResult(int val, int sides) {
		rolls[numRolls] = val;
		this.sides[numRolls++] = sides;
	}
	
	void addResult(i... dice) {
		for (int i = 0; i < dice.length; i++) {
			addResult(dice[i].getLastRoll(), dice[i].getSides());
		}
	}
	public int getRoll(int i) {
		if (i < 0 || i >= numRolls) throw new IllegalArgumentException("No such die!");
		return rolls[i];
	}
	public int getSides(int i) {
		if (i < 0 || i >= numRolls) throw new IllegalArgumentException("No such die!");
		return sides[i];
	}
	public int getSum() {
		int sum = 0;
		for (int i = 0; i < numRolls; i++) {
			sum += rolls[i];
		}
		return sum;
	}
	public int getDiceLength() {
		return diceLength;
	}
	public int getNumRolls() {
		return numRolls;
	}
}