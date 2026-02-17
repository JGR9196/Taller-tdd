package p3dev;

public class TennisGame {
    private int playerOnePoints;
    private int playerTwoPoints;

    public void playerOneScores() {
        playerOnePoints++;
    }

    public void playerTwoScores() {
        playerTwoPoints++;
    }

    public String getScore() {
        if (isWin()) {
            return leadingPlayerName() + " wins";
        }

        if (isAdvantage()) {
            return "Advantage " + leadingPlayerName();
        }

        if (isDeuce()) {
            return "Deuce";
        }

        if (isTied()) {
            return pointsName(playerOnePoints) + "-All";
        }

        return pointsName(playerOnePoints) + "-" + pointsName(playerTwoPoints);
    }

    private boolean isTied() {
        return playerOnePoints == playerTwoPoints;
    }

    private boolean isDeuce() {
        return isTied() && playerOnePoints >= 3;
    }

    private boolean isAdvantage() {
        return playerOnePoints >= 3 && playerTwoPoints >= 3 && Math.abs(playerOnePoints - playerTwoPoints) == 1;
    }

    private boolean isWin() {
        return (playerOnePoints >= 4 || playerTwoPoints >= 4) && Math.abs(playerOnePoints - playerTwoPoints) >= 2;
    }

    private String leadingPlayerName() {
        return playerOnePoints > playerTwoPoints ? "Player 1" : "Player 2";
    }

    private String pointsName(int points) {
        switch (points) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            default:
                return "Forty";
        }
    }
}
