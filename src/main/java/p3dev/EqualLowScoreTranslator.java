package p3dev;

public class EqualLowScoreTranslator implements IScoreTranslator {

	private static final String[] names = { "Love", "Fifteen", "Thirty", "Forty" };

	@Override
	public boolean canHandle(GameContext ctx) {
		return ctx.p1Points == ctx.p2Points && ctx.p1Points < 3;
	}

	@Override
	public void handle(GameContext ctx, Player player) {
		if (player == Player.PLAYER1)
			ctx.p1Points++;
		else
			ctx.p2Points++;
	}

	@Override
	public String getScore(GameContext ctx) {
		return names[ctx.p1Points] + "-All";
	}
}
