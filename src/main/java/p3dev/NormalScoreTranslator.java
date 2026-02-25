package p3dev;

public class NormalScoreTranslator implements IScoreTranslator {

	private static final String[] names = { "Love", "Fifteen", "Thirty", "Forty" };

	@Override
	public boolean canHandle(GameContext ctx) {
		return true;
	}

	@Override
	public void handle(GameContext ctx, Player player) {

		if (player == Player.PLAYER1)
			ctx.p1Points++;
		else
			ctx.p2Points++;

		if ((ctx.p1Points >= 4 || ctx.p2Points >= 4) && Math.abs(ctx.p1Points - ctx.p2Points) >= 2) {
			ctx.finished = true;
			ctx.winner = ctx.p1Points > ctx.p2Points ? Player.PLAYER1 : Player.PLAYER2;
		}
	}

	@Override
	public String getScore(GameContext ctx) {

		if (ctx.p1Points == ctx.p2Points && ctx.p1Points < 3) {
			return names[ctx.p1Points] + "-All";
		}

		return names[ctx.p1Points] + "-" + names[ctx.p2Points];
	}
}
