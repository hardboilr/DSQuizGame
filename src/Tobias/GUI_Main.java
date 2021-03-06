/**
 * @author Tobias
 */
package Tobias;

import Andreas.FileHandler;
import Andreas.Panel_QuizGUI;
import Andreas.QuizControl;
import Daniel.Person;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class GUI_Main extends javax.swing.JFrame {

    private final ImageIcon next_unselected_icon = new ImageIcon("./art/images/icons/next_unselected.png");
    private final ImageIcon next_entered_icon = new ImageIcon("./art/images/icons/next_entered.png");
    //private final ImageIcon next_pressed_icon = new ImageIcon("./art/images/icons/next_pressed.png");
    
    private final ImageIcon back_unselected_icon = new ImageIcon("./art/images/icons/back_unselected.png");
    private final ImageIcon back_entered_icon = new ImageIcon("./art/images/icons/back_entered.png");

    private final ImageIcon star_icon = new ImageIcon("./art/images/icons/star.png");

    private int posX;
    private int posY;
    
    private Boolean highscoreSaved;

    Random random = new Random();

    Panel_Intro intro;
    Panel_QuizRules quizrules;
    public static Panel_CharacterSelection characterselection;
    Panel_TimerClick timerclick;
    Panel_Highscore highscore;
    Panel_Statistics statistics;
    Panel_Again again;
    Daniel.Panel_Login login;
    Daniel.Person person;

    QuizEngine quizengine = new QuizEngine();

    QuizControl quizControl = new QuizControl();
    Panel_QuizGUI quiz;

    Person personInfo;
    
    String boardingNumber;
    String nickname;
    String password;
    

    Boolean wrongPassword = false;
    private Boolean isQuiz = false;
    Boolean isNavigation = true;

    int currentPanel = 0;

    //timer variables
    private JLabel label;
    private Timer timer;
    private final int COUNT_TIME = 4;
    private int counter; // the duration
    private final int DELAY = 1000; // every 1 second
    private boolean timeUp = false;
    
    ArrayList<String> highscoreList = new ArrayList();

    public GUI_Main() {

        initComponents();
        this.setLocationRelativeTo(null);
        //init icons
        jLabel_next.setIcon(next_unselected_icon);
        jLabel_back.setIcon(back_unselected_icon);
        jLabel_star.setIcon(star_icon);
        jLabel_next.setVisible(true);
        jLabel_back.setVisible(false);
        jLabel_star.setVisible(false);

        //set background color
        getContentPane().setBackground(Color.orange);

        //init panels
        intro = new Panel_Intro();
        again = new Panel_Again();
        login = new Daniel.Panel_Login();
        characterselection = new Panel_CharacterSelection();
        quizrules = new Panel_QuizRules();
        timerclick = new Panel_TimerClick();
        highscore = new Panel_Highscore();

        this.setLayout(new BorderLayout());
        this.add(intro, BorderLayout.CENTER);
        this.setVisible(true);
        
        statistics = new Panel_Statistics();
        this.add(statistics, BorderLayout.CENTER);
        statistics.setVisible(false);
        
        highscoreSaved = false;
        
        

        //this.list = FileHandler.load("text.txt"); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_next = new javax.swing.JLabel();
        jLabel_star = new javax.swing.JLabel();
        jLabel_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Destination Game");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_nextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_nextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_nextMousePressed(evt);
            }
        });
        getContentPane().add(jLabel_next);
        jLabel_next.setBounds(650, 460, 110, 70);

        jLabel_star.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_starMousePressed(evt);
            }
        });
        getContentPane().add(jLabel_star);
        jLabel_star.setBounds(370, 250, 60, 70);

        jLabel_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_backMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_backMousePressed(evt);
            }
        });
        getContentPane().add(jLabel_back);
        jLabel_back.setBounds(60, 460, 110, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_nextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_nextMouseExited
        jLabel_next.setIcon(next_unselected_icon);
    }//GEN-LAST:event_jLabel_nextMouseExited

    private void jLabel_nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_nextMousePressed
        System.out.println("Quiz is: " + isQuiz);
        System.out.println("Navigation is: " + isNavigation);
        System.out.println(currentPanel);
        if (isNavigation == true) {
            currentPanel++;
            Navigation();
        } else if (isQuiz == true) {
            Quiz();
        }
    }//GEN-LAST:event_jLabel_nextMousePressed

    private void jLabel_starMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_starMousePressed
        //start quiz
        quizengine.subtractRound(-1);
        System.out.println("Number of rounds left:" + quizengine.getRound());
        timer.stop();
        quiz = new Panel_QuizGUI(quizControl);
        this.add(quiz);
        timerclick.setVisible(false);
        jLabel_star.setVisible(false);
        quiz.setVisible(true);
        jLabel_next.setVisible(true);
        isQuiz = true;
        isNavigation = false;
    }//GEN-LAST:event_jLabel_starMousePressed

    private void jLabel_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_backMouseEntered
        jLabel_back.setIcon(back_entered_icon);
    }//GEN-LAST:event_jLabel_backMouseEntered

    private void jLabel_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_backMouseExited
        jLabel_back.setIcon(back_unselected_icon);
    }//GEN-LAST:event_jLabel_backMouseExited

    private void jLabel_backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_backMousePressed
        currentPanel--;
        Navigation();
    }//GEN-LAST:event_jLabel_backMousePressed

    private void jLabel_nextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_nextMouseEntered
        jLabel_next.setIcon(next_entered_icon);
    }//GEN-LAST:event_jLabel_nextMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Main().setVisible(true);
            }
        });
    }

    public void Navigation() {
        switch (currentPanel) {
            case 1: //Login (import from Daniel package)
                //login = new Daniel.Panel_Login();
                this.add(login);
                login.setVisible(true);
                intro.setVisible(false);
                break;
            case 2: //Grab data from login panel
                boardingNumber = login.getjText_boarding();
                nickname = login.getjText_nickname();
                password = "EH270";
                ArrayList<String> file = FileHandler.load("./person/nicknames.txt");
                if(file.contains(nickname))
                {
                    JOptionPane.showMessageDialog(rootPane, "Your nickname is busy");
                    currentPanel = 1;
                }
                else if (password.equals(boardingNumber)) 
                {
                    ArrayList tmp = file;
                    tmp.add(nickname);
                    //go on to character selection
                    //characterselection = new Panel_CharacterSelection();
                    this.add(characterselection);
                    FileHandler.savePersons(tmp, "./person/nicknames.txt");
                    characterselection.setVisible(true);
                    login.setVisible(false);
                    jLabel_next.setVisible(false);
                }
                else if (boardingNumber.equals ("")) 
                {
                    JOptionPane.showMessageDialog(rootPane, "You need to input boarding number");
                    //wrongPassword = true;
                    currentPanel = 1;      
                            
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Incorrect boarding number");
                    //wrongPassword = true;
                    currentPanel = 1;
                }
                break;
            case 3: //QuizRules
                //Add person object
                personInfo = new Person(boardingNumber, nickname, characterselection.getType());
                //System.out.println(characterselection.getType());
                //System.out.println(p);
                //quizrules = new Panel_QuizRules();
                this.add(quizrules);
                characterselection.setVisible(false);
                quizrules.setVisible(true);
                break;
            case 4: //Timer-click
                setCountDown(); //start timer
                //timerclick = new Panel_TimerClick();
                this.add(timerclick);
                quizrules.setVisible(false);
                jLabel_next.setVisible(false);
                timerclick.setVisible(true);
                jLabel_star.setVisible(true);
                break;
            case 5: //Game statistics, we also call this from countDown method
                add(statistics);
                statistics.setTable(quizControl.getStatistics());
                highscore.setVisible(false);
                statistics.setVisible(true);
                jLabel_next.setVisible(true);
                jLabel_back.setVisible(false);
                break;
                    
            case 6:
                //highscore = new Panel_Highscore();
                getHighScoreFile();
                setHighscore();
                highscore.setTable(highscoreList);
                this.add(highscore);
                statistics.setVisible(false);
                again.setVisible(false);
                highscore.setVisible(true);
                jLabel_next.setVisible(true);
                jLabel_back.setVisible(true);
                break;   
            case 7: 
                //again = new Panel_Again();
                this.add(again);
                highscore.setVisible(false);
                jLabel_next.setVisible(false);
                again.setVisible(true);
                jLabel_back.setVisible(true);
                break;
        }
    }
    
    public void Quiz() {
        //grab data from quiz
        quiz.compareButtonAndRightAnswer();
        
        //go back to timed panel
        timer.start();
        //timerclick = new Panel_TimerClick();
        this.add(timerclick);
        quiz.setVisible(false);
        jLabel_next.setVisible(false);
        jLabel_star.setLocation(randomPosX(), randomPosY());
        jLabel_star.setVisible(true);
        counter = COUNT_TIME;
        timerclick.setVisible(true);
        currentPanel = 4;
    }

    public void setCountDown() {
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                //timeUp = false;
                if (counter == 0) {
                    quizengine.subtractRound(-1);
                    System.out.println("Number of rounds left: " + quizengine.getRound());
                    //timeUp = true;
                    timerclick.jLabel_countDownSetText("Time is up!");
                    jLabel_star.setLocation(randomPosX(), randomPosY());
                    counter = COUNT_TIME;

                } else {
                    timerclick.jLabel_countDownSetText(counter - 1 + "sec");
                    counter--;
                }
                
                if (quizengine.getRound() ==0) {
                    System.out.println("Game over!");
                    currentPanel = 5;
                    isNavigation = true;
                    isQuiz = false;
                    add(statistics);
                    statistics.setTable(quizControl.getStatistics());
                    statistics.setVisible(true);
                    timerclick.setVisible(false);
                    jLabel_star.setVisible(false);
                    
                    jLabel_next.setVisible(true);
                    timer.stop();
                    
                }
            }
        };

        counter = COUNT_TIME;
        timer = new Timer(DELAY, action);
        timer.setInitialDelay(0);
        timer.setRepeats(true);
        timer.start();
        setVisible(true);
    }

    public int randomPosX() {
        posX = random.nextInt(700) + 30;
        return posX;
    }

    public int randomPosY() {
        posY = random.nextInt(500) + 30;
        return posY;
    }
    
    public void closeProgram() {
        this.dispose();
    }
    
    public void getHighScoreFile(){
        if (highscoreSaved != true) {
        highscoreList = FileHandler.load("./highscore/highscore.txt");
        System.out.println(highscoreList);
        }
    }
    
    
    
    public void setHighscore(){
        if (highscoreSaved != true) {
        int score = statistics.getScore();
        String info = personInfo.getName() +" |"+score;
        highscoreList.add(info);
        FileHandler.savePersons(highscoreList, "./highscore/highscore.txt");
        }
        highscoreSaved = true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jLabel_back;
    public static javax.swing.JLabel jLabel_next;
    private javax.swing.JLabel jLabel_star;
    // End of variables declaration//GEN-END:variables
}
