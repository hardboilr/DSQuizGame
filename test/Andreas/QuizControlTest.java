/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Andreas;

import java.util.ArrayList;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andreas Styltsvig
 */
public class QuizControlTest {
    
    public QuizControlTest() {
    }

    @Test
    public void testSomeMethod() {
        QuizControl quiz = new QuizControl();
        
        quiz.getFile("./questions/Question1.txt");
        
        assertTrue(quiz.getAnswer().get(0).equals("1 million"));
        assertTrue(quiz.getQuestion().equals("How many people lives in London?"));
        
     
    }
    
    @Test
    public void testFile(){
        FileHandler file = new FileHandler();
        ArrayList hehe = new ArrayList();
        
        hehe = file.load("./questions/Question1.txt");
        try {
           // System.out.println(hehe.get(9));
        } catch (Exception e) {
            System.out.println("fy fan");
        }
    }
    
    @Test
    public void testRandom(){
        Random random = new Random();
        
    }
    
    @Test
    public void testRightAnser(){
        QuizControl quiz = new QuizControl();
        quiz.getFile(quiz.getRandomFile());
        System.out.println(quiz.getQuestion());
        System.out.println(quiz.getRightAnswer());
        
    }
}
