/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Andreas;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;



/**
 *
 * @author Andreas Styltsvig
 */
public class Panel_QuizGUI extends javax.swing.JPanel {

    QuizControl quiz;
    boolean done;
    /**
     * Creates new form Panel_QuizGUI
     */
    public Panel_QuizGUI(QuizControl quiz) {
        initComponents();
        jPlayVideoButton.setVisible(false);
        this.quiz = quiz;
        setQuiz();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jQuestion = new javax.swing.JLabel();
        jAnswer1 = new javax.swing.JRadioButton();
        jAnswer2 = new javax.swing.JRadioButton();
        jAnswer3 = new javax.swing.JRadioButton();
        jAnswer4 = new javax.swing.JRadioButton();
        jPictureLabel4 = new javax.swing.JLabel();
        jPictureLabel2 = new javax.swing.JLabel();
        jPictureLabel1 = new javax.swing.JLabel();
        jPictureLabel3 = new javax.swing.JLabel();
        jMainImage = new javax.swing.JLabel();
        jNextButton = new javax.swing.JButton();
        jPlayVideoButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jQuestion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonGroup1.add(jAnswer1);

        buttonGroup1.add(jAnswer2);
        jAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnswer2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jAnswer3);

        buttonGroup1.add(jAnswer4);

        jNextButton.setText("Next");
        jNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNextButtonActionPerformed(evt);
            }
        });

        jPlayVideoButton.setText("Play Video!");
        jPlayVideoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlayVideoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jNextButton)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jPlayVideoButton)
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(350, 350, 350)
                            .addComponent(jMainImage))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(410, 410, 410)
                            .addComponent(jPictureLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(jPictureLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(230, 230, 230)
                            .addComponent(jAnswer1)
                            .addGap(219, 219, 219)
                            .addComponent(jAnswer2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(jPictureLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(jPictureLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(230, 230, 230)
                            .addComponent(jAnswer3)
                            .addGap(219, 219, 219)
                            .addComponent(jAnswer4)))
                    .addGap(0, 50, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPlayVideoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 480, Short.MAX_VALUE)
                .addComponent(jNextButton)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jMainImage)
                    .addGap(60, 60, 60)
                    .addComponent(jQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPictureLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPictureLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jAnswer1)
                        .addComponent(jAnswer2))
                    .addGap(39, 39, 39)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPictureLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPictureLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jAnswer3)
                        .addComponent(jAnswer4))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNextButtonActionPerformed
        if (compareButtonAndRightAnswer()) {
            jPlayVideoButton.setVisible(false);
            jMainImage.setVisible(false);
            //setQuiz();
            this.setVisible(false);
            

        }
    }//GEN-LAST:event_jNextButtonActionPerformed

    private void jPlayVideoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlayVideoButtonActionPerformed
        try {
            Desktop.getDesktop().browse(new URL(quiz.getQuizTypeUrl()).toURI());
        } catch (IOException ex) {
            Logger.getLogger(Panel_QuizGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Panel_QuizGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPlayVideoButtonActionPerformed

    private void jAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnswer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAnswer2ActionPerformed

    private boolean compareButtonAndRightAnswer() {
        if (jAnswer1.isSelected()) {
            return jAnswer1.getText().equals(quiz.getRightAnswer());
        }
        if (jAnswer2.isSelected()) {
            return jAnswer2.getText().equals(quiz.getRightAnswer());
        }
        if (jAnswer3.isSelected()) {
            return jAnswer3.getText().equals(quiz.getRightAnswer());
        }
        if (jAnswer4.isSelected()) {
            return jAnswer4.getText().equals(quiz.getRightAnswer());
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public void setQuiz() {
        quiz.getFile(quiz.getRandomFile());

        String quizType = quiz.getQuiztype();

        switch (quizType) {
            case "picture":
                ImageIcon mainImage = new ImageIcon(quiz.getQuizTypeUrl());
                jMainImage.setIcon(mainImage);
                jMainImage.setVisible(true);
                break;
            case "video":
                jPlayVideoButton.setVisible(true);
                break;
            case "soundClip":
                break;
            default:
                break;
        }

        jQuestion.setText(quiz.getQuestion());
        jAnswer1.setText(quiz.getAnswer().get(0));
        jAnswer2.setText(quiz.getAnswer().get(1));
        jAnswer3.setText(quiz.getAnswer().get(2));
        jAnswer4.setText(quiz.getAnswer().get(3));

        ImageIcon selectImage = new ImageIcon(quiz.getURLS().get(0));
        jPictureLabel1.setIcon(selectImage);

        ImageIcon selectImage2 = new ImageIcon(quiz.getURLS().get(1));
        jPictureLabel2.setIcon(selectImage2);

        ImageIcon selectImage3 = new ImageIcon(quiz.getURLS().get(2));
        jPictureLabel3.setIcon(selectImage3);

        ImageIcon selectImage4 = new ImageIcon(quiz.getURLS().get(3));
        jPictureLabel4.setIcon(selectImage4);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jAnswer1;
    private javax.swing.JRadioButton jAnswer2;
    private javax.swing.JRadioButton jAnswer3;
    private javax.swing.JRadioButton jAnswer4;
    private javax.swing.JLabel jMainImage;
    private javax.swing.JButton jNextButton;
    private javax.swing.JLabel jPictureLabel1;
    private javax.swing.JLabel jPictureLabel2;
    private javax.swing.JLabel jPictureLabel3;
    private javax.swing.JLabel jPictureLabel4;
    private javax.swing.JButton jPlayVideoButton;
    private javax.swing.JLabel jQuestion;
    // End of variables declaration//GEN-END:variables
}
