/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Andreas;

import java.util.ArrayList;
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
        
        quiz.getFile("C:\\Users\\Andreas Styltsvig\\Documents\\NetBeansProjects\\JavaApplication24\\src\\Andreas\\Question1.txt");
        
        assertTrue(quiz.getAnswer().get(0).equals("1 million"));
        assertTrue(quiz.getQuestion().equals("How many people lives in London?"));
        
     
    }
    
    @Test
    public void testFile(){
        FileHandler file = new FileHandler();
        ArrayList hehe = new ArrayList();
        
        hehe = file.load("C:\\Users\\Andreas Styltsvig\\Documents\\NetBeansProjects\\JavaApplication24\\src\\Andreas\\Question1.txt");
        System.out.println(hehe.get(5));
    }
    
}
