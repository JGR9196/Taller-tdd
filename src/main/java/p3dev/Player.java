package p3dev;

public enum Player {

	PLAYER1(1), PLAYER2(2);

	private final int number;

	Player(int number) {
		this.number = number;
	}

	public String displayName() {
		return "Player " + number;
	}
}
