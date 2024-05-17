/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Juego;

import Clases.Jugador;
import Clases.Tablero;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class Tablero15X15 extends javax.swing.JFrame {

    Tablero tablero = new Tablero();
    JPanel vector[] = new JPanel[225];

    /**
     * Creates new form Tablero15X15
     */
    public Tablero15X15() {
        initComponents();
        setLocationRelativeTo(null);
        //TODO: ESTO NO VA AQUI; TIENES QUE  HACER UN JOPTION PANEL QUE INDIQUE LA CANTIDAD DE JUGADORES
        tablero.crearJugador(3);

        //Imprimimos los jugadores haber si funciona
        for (Jugador jugador : tablero.getCasillasTablero()[0].getJugadores()) {
            System.out.println(jugador.getColor());
        }

        /*
            GENERAR MANUALMENTE UN GRID LAYOUT;
            A ESE GRID LAYOUT INSERTAR 100 JPANELES
            A CADA PANEL SE LE ASIGNA UNA POSICION
        
            
         */
        for (int row = 14; row >= 0; row--) {
            for (int col = 0; col < 15; col++) {
                int number;

                if (row % 2 == 0) { // Filas pares (0, 2, 4, ...) en orden normal
                    number = row * 13 + (12 - col) + 1;
                } else { // Filas impares (1, 3, 5, ...) en orden inverso
                    number = row * 13 + col + 1;
                }

                JPanel subPanel = new JPanel(new BorderLayout());
                subPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Borde negro para separar los paneles

                // Asignar un nombre específico al panel (ejemplo: jpanel_pos1, jpanel_pos2, etc.)
                String panelName = "jpanel_pos" + number;
                subPanel.setName(panelName);

                // Crear un JLabel con el número del panel
                JLabel label = new JLabel(String.valueOf(number));
                label.setFont(label.getFont().deriveFont(Font.BOLD, 12)); // Ajustar el tamaño de la fuente del JLabel
                label.setHorizontalAlignment(JLabel.RIGHT); // Alinear a la derecha
                label.setVerticalAlignment(JLabel.TOP); // Alinear en la parte superior

                // Crear un JPanel para los JLabels de color
                JPanel colorPanel = new JPanel(new GridLayout(2, 2, 0, 0));
                colorPanel.setOpaque(false); // Hacer el colorPanel transparente

                JLabel JColor = new JLabel("  ");
                JColor.setName("--");
                JColor.setFont(label.getFont().deriveFont(Font.BOLD, 12)); // Ajustar el tamaño de la fuente del JLabel
                JColor.setBackground(Color.BLUE);
                JColor.setOpaque(false);
                JColor.setPreferredSize(new Dimension(10, 10)); // Establecer el tamaño del JLabel

                JLabel JColor2 = new JLabel("  ");
                JColor2.setName("--");
                JColor2.setFont(label.getFont().deriveFont(Font.BOLD, 12)); // Ajustar el tamaño de la fuente del JLabel
                JColor2.setBackground(Color.RED);
                JColor2.setOpaque(false);
                JColor2.setPreferredSize(new Dimension(10, 10)); // Establecer el tamaño del JLabel

                JLabel JColor3 = new JLabel("  ");
                JColor3.setName("--");
                JColor3.setFont(label.getFont().deriveFont(Font.BOLD, 12)); // Ajustar el tamaño de la fuente del JLabel
                JColor3.setBackground(Color.GREEN);
                JColor3.setOpaque(false);
                JColor3.setPreferredSize(new Dimension(10, 10)); // Establecer el tamaño del JLabel

                JLabel JColor4 = new JLabel("  ");
                JColor4.setName("--");
                JColor4.setFont(label.getFont().deriveFont(Font.BOLD, 12)); // Ajustar el tamaño de la fuente del JLabel
                JColor4.setBackground(new Color(128, 0, 128));
                JColor4.setOpaque(false);
                JColor4.setPreferredSize(new Dimension(10, 10)); // Establecer el tamaño del JLabel

                // Añadir los JLabels de color al colorPanel
                colorPanel.add(JColor);
                colorPanel.add(JColor2);
                colorPanel.add(JColor3);
                colorPanel.add(JColor4);

                //vector [number-1] = JColor;
                vector[number - 1] = colorPanel;

                // Añadir el JLabel del número y el colorPanel al subPanel
                subPanel.add(label, BorderLayout.NORTH);
                subPanel.add(colorPanel, BorderLayout.WEST);

                panel2.add(subPanel); // Agregar el subpanel al jPanelJuego
            }
        }

        //tablero.crearJugador(4);
        /////////////////////////////////ubicar todos los jugadores en la primera casilla
        int ultFicha = panel2.getComponents().length - 1;
        JPanel casilla = (JPanel) panel2.getComponent(ultFicha);
        JPanel fichasContainer = ((JPanel) casilla.getComponent(1));

        for (Jugador jugador : tablero.getJugadores()) {
            if ("AZUL".equals(jugador.getColor())) {
                ((JLabel) fichasContainer.getComponent(0)).setOpaque(true);
                ((JLabel) fichasContainer.getComponent(0)).repaint();
            }
            if ("ROJO".equals(jugador.getColor())) {
                ((JLabel) fichasContainer.getComponent(1)).setOpaque(true);
                ((JLabel) fichasContainer.getComponent(1)).repaint();
            }
            if ("VERDE".equals(jugador.getColor())) {
                ((JLabel) fichasContainer.getComponent(2)).setOpaque(true);
                ((JLabel) fichasContainer.getComponent(2)).repaint();
            }
            if ("MORADO".equals(jugador.getColor())) {
                ((JLabel) fichasContainer.getComponent(3)).setOpaque(true);
                ((JLabel) fichasContainer.getComponent(3)).repaint();
            }
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204), 3));

        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 3));
        panel2.setLayout(new java.awt.GridLayout(15, 15, 5, 5));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new java.awt.GridLayout());

        jButton1.setText("Tirar dado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int jAct = tablero.getJugadorAct();
        int posicionAct = tablero.getJugadores()[jAct].getPosicion();

        int jMover = tablero.moverJugador15(tablero.getJugadorAct(), tablero.tirarDado());

        JPanel casilla = (JPanel) panel2.getComponent(panel2.getComponents().length - 1 - posicionAct);
        JPanel fichasContainer = ((JPanel) casilla.getComponent(1));

        for (Jugador jugador : tablero.getJugadores()) {
            if ("AZUL".equals(jugador.getColor()) && jugador.getPosicion() != posicionAct) {
                ((JLabel) fichasContainer.getComponent(0)).setOpaque(false);
                ((JLabel) fichasContainer.getComponent(0)).repaint();
            }
            if ("ROJO".equals(jugador.getColor()) && jugador.getPosicion() != posicionAct) {
                ((JLabel) fichasContainer.getComponent(1)).setOpaque(false);
                ((JLabel) fichasContainer.getComponent(1)).repaint();
            }
            if ("VERDE".equals(jugador.getColor()) && jugador.getPosicion() != posicionAct) {
                ((JLabel) fichasContainer.getComponent(2)).setOpaque(false);
                ((JLabel) fichasContainer.getComponent(2)).repaint();
            }
            if ("MORADO".equals(jugador.getColor()) && jugador.getPosicion() != posicionAct) {
                ((JLabel) fichasContainer.getComponent(3)).setOpaque(false);
                ((JLabel) fichasContainer.getComponent(3)).repaint();
            }
        }

        casilla = (JPanel) panel2.getComponent(panel2.getComponents().length - 1 - jMover);
        fichasContainer = ((JPanel) casilla.getComponent(1));
        for (Jugador jugador : tablero.getJugadores()) {
            if ("AZUL".equals(jugador.getColor()) && jugador.getPosicion() == jMover) {
                ((JLabel) fichasContainer.getComponent(0)).setOpaque(true);
                ((JLabel) fichasContainer.getComponent(0)).repaint();
            }
            if ("ROJO".equals(jugador.getColor()) && jugador.getPosicion() == jMover) {
                ((JLabel) fichasContainer.getComponent(1)).setOpaque(true);
                ((JLabel) fichasContainer.getComponent(1)).repaint();
            }
            if ("VERDE".equals(jugador.getColor()) && jugador.getPosicion() == jMover) {
                ((JLabel) fichasContainer.getComponent(2)).setOpaque(true);
                ((JLabel) fichasContainer.getComponent(2)).repaint();
            }
            if ("MORADO".equals(jugador.getColor()) && jugador.getPosicion() == jMover) {
                ((JLabel) fichasContainer.getComponent(3)).setOpaque(true);
                ((JLabel) fichasContainer.getComponent(3)).repaint();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tablero15X15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero15X15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero15X15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero15X15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero15X15().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
