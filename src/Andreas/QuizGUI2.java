/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Andreas;

import javax.swing.ImageIcon;


/**
 *
 * @author Andreas Styltsvig
 */

public class QuizGUI2 extends javax.swing.JFrame {
    
    QuizControl quiz;
    /**
     * Creates new form QuizGUI2
     */
    public QuizGUI2() {
        quiz = new QuizControl();
        initComponents();
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
        jVideoPanel = new javax.swing.JPanel();
        jQuestion = new javax.swing.JLabel();
        jAnswer1 = new javax.swing.JRadioButton();
        jAnswer2 = new javax.swing.JRadioButton();
        jAnswer3 = new javax.swing.JRadioButton();
        jAnswer4 = new javax.swing.JRadioButton();
        jNext = new javax.swing.JButton();
        jPictureLabel4 = new javax.swing.JLabel();
        jPictureLabel2 = new javax.swing.JLabel();
        jPictureLabel1 = new javax.swing.JLabel();
        jPictureLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 1000));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setPreferredSize(new java.awt.Dimension(500, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jVideoPanelLayout = new javax.swing.GroupLayout(jVideoPanel);
        jVideoPanel.setLayout(jVideoPanelLayout);
        jVideoPanelLayout.setHorizontalGroup(
            jVideoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jVideoPanelLayout.setVerticalGroup(
            jVideoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        getContentPane().add(jVideoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 700, 310));

        jQuestion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(jQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        buttonGroup1.add(jAnswer1);
        getContentPane().add(jAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, -1, -1));

        buttonGroup1.add(jAnswer2);
        getContentPane().add(jAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, -1, -1));

        buttonGroup1.add(jAnswer3);
        getContentPane().add(jAnswer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 870, -1, -1));

        buttonGroup1.add(jAnswer4);
        getContentPane().add(jAnswer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 870, -1, -1));

        jNext.setText("Next");
        jNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNextActionPerformed(evt);
            }
        });
        getContentPane().add(jNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 960, -1, -1));
        getContentPane().add(jPictureLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 740, -1, -1));
        getContentPane().add(jPictureLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, -1, -1));
        getContentPane().add(jPictureLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));
        getContentPane().add(jPictureLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 740, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNextActionPerformed
        setQuiz();
    }//GEN-LAST:event_jNextActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void setQuiz(){
        
        quiz.getFile(quiz.getRandomFile());
        
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
        
        ImageIcon selectImage4 = new ImageIcon(quiz.getURLS().get(0));
        jPictureLabel4.setIcon(selectImage4);
        }
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
            java.util.logging.Logger.getLogger(QuizGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizGUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jAnswer1;
    private javax.swing.JRadioButton jAnswer2;
    private javax.swing.JRadioButton jAnswer3;
    private javax.swing.JRadioButton jAnswer4;
    private javax.swing.JButton jNext;
    private javax.swing.JLabel jPictureLabel1;
    private javax.swing.JLabel jPictureLabel2;
    private javax.swing.JLabel jPictureLabel3;
    private javax.swing.JLabel jPictureLabel4;
    private javax.swing.JLabel jQuestion;
    private javax.swing.JPanel jVideoPanel;
    // End of variables declaration//GEN-END:variables
}
