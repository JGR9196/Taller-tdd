package p3dev;

import java.util.List;

public class ScoreTranslatorChain {

	private final List<IScoreTranslator> translators = List.of(new WinTranslator(), new AdvantageTranslator(),
			new DeuceTranslator(), new InitialScoreTranslator(), new EqualLowScoreTranslator(),
			new NormalScoreTranslator());

	public void pointWon(GameContext ctx, Player player) {
		for (IScoreTranslator t : translators) {
			if (t.canHandle(ctx)) {
				t.handle(ctx, player);
				return;
			}
		}
	}

	public String getScore(GameContext ctx) {
		for (IScoreTranslator t : translators) {
			if (t.canHandle(ctx))
				return t.getScore(ctx);
		}
		throw new IllegalStateException();
	}
}
