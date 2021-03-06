/**
 * @author Tobias
 */

package Tobias;

import javax.swing.ImageIcon;

public class Panel_Intro extends javax.swing.JPanel {
    
    private final ImageIcon logo = new ImageIcon("./art/images/backgroundImages/cphairport.png");

    public Panel_Intro() {
        initComponents();
        jLabel_logo.setIcon(logo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel_logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tobias\\Desktop\\Tobias dropbox\\Dropbox\\Datamatiker\\1. semester\\Programming\\JAVA\\Obligatoriske afleveringer\\4_DAT-Service\\DSQuizGame\\art\\images\\backgroundImages\\cphairport.png")); // NOI18N
        jLabel_logo.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Tunga", 1, 40)); // NOI18N
        jLabel1.setText("A GAME - FOR EVERY AGE,");

        jLabel2.setFont(new java.awt.Font("Tunga", 1, 40)); // NOI18N
        jLabel2.setText("EVERY PERSON");

        jLabel3.setFont(new java.awt.Font("Tunga", 1, 40)); // NOI18N
        jLabel3.setText("& EVERY COUNTRY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_logo)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel_logo)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_logo;
    // End of variables declaration//GEN-END:variables
}
