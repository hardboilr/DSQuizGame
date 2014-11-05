/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Andreas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
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
    public void testFile() {
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
    public void testRightAnser() {
        QuizControl quiz = new QuizControl();
        quiz.getFile(quiz.getRandomFile());
        System.out.println(quiz.getQuestion());
        System.out.println(quiz.getRightAnswer());

    }

    @Test
    public void test() {
        HashMap<Integer, ArrayList<String>> hashmap = new HashMap();
        int score;
        String name;
        
        ArrayList<String> person = new ArrayList();
        ArrayList<String> person2 = new ArrayList();

        person.add("hejsa");
        person.add("hmm");
        person.add("æælasd");
        person.add("aorll");
        
        person2.add("poul");
        
        hashmap.put(500, person);
        hashmap.put(100, person2);
        hashmap.put(150, person2);
        
        System.out.println(hashmap.size());
        System.out.println(hashmap.keySet());
        System.out.println(hashmap.get(100));
        
        
    }
}
