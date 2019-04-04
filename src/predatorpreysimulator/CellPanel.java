/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package predatorpreysimulator;

import java.awt.Color;

/**
 *
 * @author Sikder Huq
 */
public class CellPanel extends javax.swing.JPanel {
    String type;
    /**
     * Creates new form CellPanel
     */
    public CellPanel() {
        initComponents();       
        setBackground(InitPanel.gridBgColor);
    }
    
    public void setType(String type){
        this.type = type;
        if (type.equalsIgnoreCase("doodlebugs"))
            iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bug.png")));
        else
            iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ant.png")));
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconLabel = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        iconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(iconLabel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    // End of variables declaration//GEN-END:variables
}
