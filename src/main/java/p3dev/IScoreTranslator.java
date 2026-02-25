package p3dev;

public interface IScoreTranslator {
	boolean canHandle(GameContext context);

	void handle(GameContext context, Player player);

	String getScore(GameContext context);
}
