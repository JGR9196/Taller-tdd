package p3dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisGameTest {

    @Test
    void shouldReturnLoveLove_OnStart() {
        TennisGame game = new TennisGame();

        assertEquals("Love-All", game.getScore());
    }

    @Test
    void testPlayerOneScoresOnce_ShouldBeFifteenLove() {
        TennisGame game = new TennisGame();
        game.playerOneScores();

        assertEquals("Fifteen-Love", game.getScore());
    }

    @Test
    void testPlayerTwoScoresOnce_ShouldBeLoveFifteen() {
        TennisGame game = new TennisGame();
        game.playerTwoScores();

        assertEquals("Love-Fifteen", game.getScore());
    }

    @Test
    void testBothPlayersScoreOnce_ShouldBeFifteenAll() {
        TennisGame game = new TennisGame();
        game.playerOneScores();
        game.playerTwoScores();

        assertEquals("Fifteen-All", game.getScore());
    }

    @Test
    void testPlayerOneScoresTwice_ShouldBeThirtyLove() {
        TennisGame game = new TennisGame();
        game.playerOneScores();
        game.playerOneScores();

        assertEquals("Thirty-Love", game.getScore());
    }

    @Test
    void testPlayerTwoScoresTwice_ShouldBeLoveThirty() {
        TennisGame game = new TennisGame();
        game.playerTwoScores();
        game.playerTwoScores();

        assertEquals("Love-Thirty", game.getScore());
    }

    @Test
    void testScoreIsFortyAll_ShouldBeDeuce() {
        TennisGame game = score(3, 3);

        assertEquals("Deuce", game.getScore());
    }

    @Test
    void testPlayerOneAdvantageAfterDeuce_ShouldBeAdvantagePlayerOne() {
        TennisGame game = score(4, 3);

        assertEquals("Advantage Player 1", game.getScore());
    }

    @Test
    void testPlayerTwoAdvantageAfterDeuce_ShouldBeAdvantagePlayerTwo() {
        TennisGame game = score(3, 4);

        assertEquals("Advantage Player 2", game.getScore());
    }

    @Test
    void testPlayerOneWinsAfterAdvantage_ShouldBeWinPlayerOne() {
        TennisGame game = score(5, 3);

        assertEquals("Player 1 wins", game.getScore());
    }

    @Test
    void testPlayerTwoWinsAfterAdvantage_ShouldBeWinPlayerTwo() {
        TennisGame game = score(3, 5);

        assertEquals("Player 2 wins", game.getScore());
    }

    @Test
    void testAdvantageLost_BackToDeuce() {
        TennisGame game = score(4, 4);

        assertEquals("Deuce", game.getScore());
    }

    @Test
    void testPlayerOneWinsByTwoPoints_ShouldBeWinPlayerOne() {
        TennisGame game = score(4, 2);

        assertEquals("Player 1 wins", game.getScore());
    }

    @Test
    void testPlayerTwoWinsByTwoPoints_ShouldBeWinPlayerTwo() {
        TennisGame game = score(1, 4);

        assertEquals("Player 2 wins", game.getScore());
    }

    private TennisGame score(int playerOnePoints, int playerTwoPoints) {
        TennisGame game = new TennisGame();

        for (int i = 0; i < playerOnePoints; i++) {
            game.playerOneScores();
        }
        for (int i = 0; i < playerTwoPoints; i++) {
            game.playerTwoScores();
        }

        return game;
    }
}
