package clean_code_refactoring.bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int score1, int score2) {
        String result = "";
        int tempScore=0;
        if (score1==score2)
        {
            result = getResultWhenPlayer1DrawPlayer2(score1);
        }
        else if (score1>=4 || score2>=4)
        {
            result = getFinalResult(score1, score2);
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                result = getPlayerResult(score1, score2, result, i);
            }
        }
        return result;
    }

    private static String getPlayerResult(int score1, int score2, String result, int i) {
        int tempScore;
        if (i==1) tempScore = score1;
        else { result+="-"; tempScore = score2;}
        switch(tempScore)
        {
            case 0:
                result+="Love";
                break;
            case 1:
                result+="Fifteen";
                break;
            case 2:
                result+="Thirty";
                break;
            case 3:
                result+="Forty";
                break;
        }
        return result;
    }

    private static String getFinalResult(int score1, int score2) {
        String result;
        int minusResult = score1-score2;
        if (minusResult==1) result ="Advantage player1";
        else if (minusResult ==-1) result ="Advantage player2";
        else if (minusResult>=2) result = "Win for player1";
        else result ="Win for player2";
        return result;
    }

    private static String getResultWhenPlayer1DrawPlayer2(int score1) {
        String score;
        switch (score1)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
