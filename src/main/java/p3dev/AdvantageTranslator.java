
package p3dev;

public class AdvantageTranslator implements IScoreTranslator {

	@Override
	public boolean canHandle(GameContext ctx) {
		return ctx.p1Points >= 3 && ctx.p2Points >= 3 && Math.abs(ctx.p1Points - ctx.p2Points) == 1;
	}

	@Override
	public void handle(GameContext ctx, Player player) {

		if (player == Player.PLAYER1)
			ctx.p1Points++;
		else
			ctx.p2Points++;

		if (Math.abs(ctx.p1Points - ctx.p2Points) >= 2) {
			ctx.finished = true;
			ctx.winner = ctx.p1Points > ctx.p2Points ? Player.PLAYER1 : Player.PLAYER2;
		}
	}

	@Override
	public String getScore(GameContext ctx) {
		Player leader = ctx.p1Points > ctx.p2Points ? Player.PLAYER1 : Player.PLAYER2;
		return "Advantage " + leader.displayName();
	}
}
