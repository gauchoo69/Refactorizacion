public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int m_score1, int m_score2) {
        String score = "";
        int tempScore=0;

        if (m_score1 == m_score2) {
            score = PuntuacionEmpate(m_score1);
        }

        else if (m_score1 >=4 || m_score2 >=4)
        {
            int minusResult = m_score1-m_score2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                score = Ventajasmaximas(m_score1, m_score2, i, score);
            }

        }
    return score;
    }

    private static String Ventajasmaximas(int m_score1, int m_score2, int i, String score)

    {
        int tempScore;
        if (i ==1) tempScore = m_score1;
        else { score +="-"; tempScore = m_score2;}
        switch(tempScore)
        {
            case 0:
                score +="Love";
                break;
            case 1:
                score +="Fifteen";
                break;
            case 2:
                score +="Thirty";
                break;
            case 3:
                score +="Forty";
                break;
        }
        return score;
    }

    private static String PuntuacionEmpate(int m_score1) {
        String score;
        switch (m_score1)
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