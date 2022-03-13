package cz.cvut.fel.pjv.semestralka;

/**
 *
 * @author ondra
 */
public class Player {

    public boolean isPlayerOne;
    public boolean isAI;
    public String playerName;
    public Army army;
    public int scorePoints;
    public int skillPoints;

    public Player(boolean isPlayerOne, boolean isAI, String playerName, Army army) {
        this.isPlayerOne = isPlayerOne;
        this.isAI = isAI;
        this.playerName = playerName;
        this.army = army;
        
        // Score and skill points always start at zero 
        this.scorePoints = 0;
        this.skillPoints = 0;
    }

    public boolean isIsPlayerOne() {
        return isPlayerOne;
    }

    public void setIsPlayerOne(boolean isPlayerOne) {
        this.isPlayerOne = isPlayerOne;
    }

    public int getScorePoints() {
        return scorePoints;
    }

    public void setScorePoints(int scorePoints) {
        this.scorePoints = scorePoints;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }
}
