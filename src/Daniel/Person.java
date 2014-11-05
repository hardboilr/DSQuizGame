/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daniel;

/**
 *
 * @author Daniel
 */
public class Person {
    private String boardingNumber;
    private String nickname;
    private String type;
    private int score;

    @Override
    public String toString() {
        return boardingNumber + "," + nickname+ "," + type;
    }

    public Person (String boardingNumber, String nickname, String type) {
        this.boardingNumber = boardingNumber;
        this.nickname = nickname;
        this.type = type;
        this.score = 0;
    }
    
    public void setScore(int score){
        this.score += score;
    }
    
    public int getScore(){
        return score;
    }
    
    public String getName(){
        return nickname;
    }
}
    
    
    
    
    
