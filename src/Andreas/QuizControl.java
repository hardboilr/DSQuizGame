
package Andreas;

import java.util.ArrayList;

/**
 *
 * @author Andreas Styltsvig
 */
public class QuizControl {
    
    String question;
    ArrayList<String> answer;
    FileHandler fileHandler = new FileHandler();
    ArrayList<String> file;
    
    public void getFile(String filename){
        file = new ArrayList();
        file = fileHandler.load(filename);
        
        question = file.get(0).substring(file.get(0).indexOf(":"), file.get(0).indexOf("?")+1);
        
        System.out.println(question);
    }
    
    
    
    
}
           