package com.adaptionsoft.games.trivia;

import com.adaptionsoft.games.trivia.runner.GameRunner;
import org.junit.Test;

import java.util.Random;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

public class SomeTest {

	@Test
	public void true_is_true() throws Exception {
		assertTrue(true);
	}



	@Test
	public void should_generate_same_game_results() throws Exception {
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int seed = rand.nextInt();
            assertThat(GameRunner.runGameOld(seed)).isEqualTo(GameRunner.runGameNew(seed));
        }
    }
}
