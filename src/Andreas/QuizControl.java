package Andreas;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Andreas Styltsvig
 */
public class QuizControl {

    String question;
    String rightAnswer;
    ArrayList<String> answer;
    FileHandler fileHandler = new FileHandler();
    ArrayList<String> file;
    ArrayList<String> pictureURL;
    ArrayList<String> questionUsed;

    Random random = new Random();

    public void getFile(String filename) {
        questionUsed = new ArrayList();
        file = new ArrayList();
        answer = new ArrayList();
        pictureURL = new ArrayList();
        file = fileHandler.load(filename);
        question = file.get(0).substring(file.get(0).indexOf(":") + 2, file.get(0).indexOf("?") + 1);

        for (int i = 1; i < 5; i++) {
            if (file.get(i).contains("(r)")) {
                rightAnswer = file.get(i).substring(0, file.get(i).indexOf("("));
            }

        }

        for (int i = 0; i < 4; i++) {
            try {
                answer.add(file.get(i + 1).replaceAll("\\(r", "").replaceAll("\\)", ""));
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        for (int i = 0; i < 4; i++) {
            try {
                pictureURL.add(file.get(i + 5));
            } catch (Exception e) {
                pictureURL.add("");
            }
        }

    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public String getRandomFile() {
        String randomFile = "./questions/Question"+ Integer.toString(random.nextInt(5) + 1) + ".txt";
        /*if(questionUsed.contains(randomFile))
         getRandomFile();
         else
         {
         questionUsed.add(randomFile); 
         }*/
        return randomFile;
    }

    public ArrayList<String> getURLS() {
        return pictureURL;
    }

}
