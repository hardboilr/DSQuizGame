/**
 * @author Tobias
 */

package Tobias;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.Timer;

import Andreas.*;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;


public class Panel_TimerClick extends javax.swing.JPanel {
    
    SoundPlayer player1 = new SoundPlayer();
    QuizEngine quizengine = new QuizEngine();
    String bg_fileName; 
    String star_fileName; 
    
    
    
    public Panel_TimerClick() {
        initComponents();
        
        //- Change background image
        bg_fileName = "./art/images/backgroundImages/bg_london.jpg";
        ImageIcon background = new ImageIcon(bg_fileName);
        jLabel_background.setIcon(background);
        //----------------------------------------------
    }
    
    public String jLabel_countDownSetText(String input) {
        jLabel_countDown.setText(input);
        return input;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_countDown = new javax.swing.JLabel();
        jLabel_background = new javax.swing.JLabel();

        setLayout(null);

        jLabel_countDown.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_countDown.setFont(new java.awt.Font("Tunga", 0, 24)); // NOI18N
        jLabel_countDown.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_countDown.setText("countdown");
        jLabel_countDown.setOpaque(true);
        add(jLabel_countDown);
        jLabel_countDown.setBounds(690, 550, 100, 30);
        add(jLabel_background);
        jLabel_background.setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents
    
    public void setLabelVisibility() {
        jLabel_background.setVisible(true);
        jLabel_countDown.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_background;
    private javax.swing.JLabel jLabel_countDown;
    // End of variables declaration//GEN-END:variables
}
