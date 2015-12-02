
package com.adaptionsoft.games.uglytrivia;
import java.util.Random;


public class GameRunner {

	private static boolean notAWinner;

	public static void main(String[] args) {
        runGameOld(6);
	}

    public static String runGame(Game game, int seed) {
        game.add("Chet");
        game.add("Pat");
        game.add("Sue");

        Random rand = new Random(seed);

        do {
            game.roll(rand.nextInt(5) + 1);
            if (rand.nextInt(9) == 7) {
                notAWinner = game.wrongAnswer();
            } else {
                notAWinner = game.wasCorrectlyAnswered();
            }
        } while (notAWinner);

        return String.valueOf(game.getGameResume());
    }

    public static String runGameOld(int seed) {
        Game gameOld = new Game();
        return runGame(gameOld, seed);
    }

    public static String runGameNew(int seed) {
        NewGame newGame = new NewGame();
        return runGame(newGame, seed);
    }

}
