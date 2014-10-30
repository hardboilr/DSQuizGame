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
    private String name;
    private String nickname;
    private int score;

    @Override
    public String toString() {
        return name + "," + nickname+ "," + score;
    }

    public Person (String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
        this.score = 0;
    }
    
    
}