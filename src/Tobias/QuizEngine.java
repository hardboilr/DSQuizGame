/**
 * @author Tobias
 */
package Tobias;

public class QuizEngine {
    
    private int round = 10;

    public QuizEngine() {

    }
    
    public int getRound() {
        return round;
    }
    
    public int subtractRound(int input) {
        round = round + input;
        return round;
    }

}
