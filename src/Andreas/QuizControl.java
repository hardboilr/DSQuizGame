package Andreas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Andreas Styltsvig
 */
public class QuizControl {

    String question;
    String rightAnswer;
    String Quiztype;
    String QuizTypeUrl;
    ArrayList<String> answer;
    FileHandler fileHandler = new FileHandler();
    ArrayList<String> file;
    ArrayList<String> pictureURL;
    ArrayList<String> questionFilenameUsed = new ArrayList();
    ArrayList<String> questionUsed = new ArrayList();
    String[][] statistics = new String[3][10];
    int x = 0;
    int y = 0;
    

    Random random = new Random();

    public void getFile(String filename) {
        
        file = new ArrayList();
        answer = new ArrayList();
        pictureURL = new ArrayList();
        file = fileHandler.load(filename);

        //Get the quizType from file (Picture, soundClip or video)
        Quiztype = file.get(0).substring(file.get(0).indexOf(":") + 1, file.get(0).indexOf("|")).replaceAll(" ", "");
        //Get the Main URL to either picture, soundClip or video
        QuizTypeUrl = file.get(0).substring(file.get(0).indexOf("|") + 2);

        //Get the question from file
        question = file.get(1).substring(file.get(1).indexOf(":") + 2, file.get(1).indexOf("?") + 1);

        //Fetch the right one answer from 4 answer options
        for (int i = 2; i < 6; i++) {
            if (file.get(i).contains("(r)")) {
                rightAnswer = file.get(i).substring(0, file.get(i).indexOf("("));
            }

        }

        //Add 4 answers in arraylist
        for (int i = 2; i < 6; i++) {
            try {
                answer.add(file.get(i).replaceAll("\\(r", "").replaceAll("\\)", ""));
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        //Get picture URL from file
        for (int i = 0; i < 4; i++) {
            try {
                pictureURL.add(file.get(i + 6));
            } catch (Exception e) {
                //If empty URL or wrong URL, simply add "" as URL
                pictureURL.add("");
            }
        }

    }

    public String getQuiztype() {
        return Quiztype;
    }

    public String getQuizTypeUrl() {
        return QuizTypeUrl;
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
        String randomFile = "./questions/Question" + Integer.toString(random.nextInt(18) + 1) + ".txt";
        if (questionFilenameUsed.contains(randomFile)) {
            return getRandomFile();
        } 
        else 
        {
            questionFilenameUsed.add(randomFile);
            questionUsed.add(question);
            return randomFile;
        }

    }

    public ArrayList<String> getURLS() {
        return pictureURL;
    }
    
    public void setStatistics(String selectedAnswer, boolean result){
        statistics[0][y] = question;
        statistics[1][y] = selectedAnswer;
        statistics[2][y] = String.valueOf(result);
        y++;
    }
    
    public String[][] getStatistics(){
        return statistics;
    }
   

}
