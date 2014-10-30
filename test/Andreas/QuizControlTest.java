/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Andreas;

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
        
        quiz.getFile("Question1.txt");
    }
    
}
