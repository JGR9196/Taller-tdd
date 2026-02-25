package p3dev;

public class InitialScoreTranslator implements IScoreTranslator {

	@Override
	public boolean canHandle(GameContext ctx) {
		return ctx.p1Points == 0 && ctx.p2Points == 0;
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
		return "Love-Love";
	}
}
