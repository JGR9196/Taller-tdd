package p3dev;

public class TennisGame {

	private final GameContext context = new GameContext();
	private final ScoreTranslatorChain chain = new ScoreTranslatorChain();

	public void pointWonBy(Player player) {
		chain.pointWon(context, player);
	}

	public String getScore() {
		return chain.getScore(context);
	}
}
