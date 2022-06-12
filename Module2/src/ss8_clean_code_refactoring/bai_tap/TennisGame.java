package ss8_clean_code_refactoring.bai_tap;

public class TennisGame {
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public TennisGame() {
    }

    public static void getScore(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        if (firstPlayerScore == secondPlayerScore) {
            equalScoreSituation(firstPlayerScore);
        } else if (firstPlayerScore >= 4 || secondPlayerScore >= 4) {
            findWinner(firstPlayerName, secondPlayerName, firstPlayerScore, secondPlayerScore);
        } else {
            showCurrentScore(firstPlayerName, secondPlayerName, firstPlayerScore, secondPlayerScore);
        }
    }

    public static void equalScoreSituation(int PlayScore) {
        String currentScore;
        switch (PlayScore) {
            case LOVE:
                currentScore = "Love-All";
                break;
            case FIFTEEN:
                currentScore = "Fifteen-All";
                break;
            case THIRTY:
                currentScore = "Thirty-All";
                break;
            case FORTY:
                currentScore = "Forty-All";
                break;
            default:
                currentScore = "Deuce";
        }
        System.out.println(currentScore);
    }

    public static void findWinner(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        String result;
        int minScore = firstPlayerScore - secondPlayerScore;
        if (minScore == 1) {
            result = "Advantage for " + firstPlayerName;
        } else if (minScore == -1) {
            result = "Advantage for " + secondPlayerName;
        } else if (minScore >= 2) {
            result = "Win for " + firstPlayerName;
        } else {
            result = "Win for " + secondPlayerName;
        }
        System.out.println(result);
    }

    public static void showCurrentScore(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        String playerName;
        String currentScore;
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                playerName = firstPlayerName;
                tempScore = firstPlayerScore;
            } else {
                playerName = secondPlayerName;
                tempScore = secondPlayerScore;
            }
            switch (tempScore) {
                case LOVE:
                    currentScore = "Love";
                    break;
                case FIFTEEN:
                    currentScore = "Fifteen";
                    break;
                case THIRTY:
                    currentScore = "Thirty";
                    break;
                case FORTY:
                    currentScore = "Forty";
                    break;
                default:
                    currentScore = "Deuce";
                    break;
            }
            System.out.println("Current score of " + playerName + ": " + currentScore);
        }
    }
}



