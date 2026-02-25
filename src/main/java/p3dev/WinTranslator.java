package p3dev;

public class WinTranslator implements IScoreTranslator {

	@Override
	public boolean canHandle(GameContext ctx) {
		int max = Math.max(ctx.p1Points, ctx.p2Points);
		int diff = Math.abs(ctx.p1Points - ctx.p2Points);
		return max >= 4 && diff >= 2;
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
		Player winner = ctx.p1Points > ctx.p2Points ? Player.PLAYER1 : Player.PLAYER2;
		return winner.displayName() + " wins";
	}

}
