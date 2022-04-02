/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.GestionarMotos;

import Modelo.Empleado;
import Modelo.Moto;
import Vista.VistaParqueadero;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class RegistrarEntrada extends javax.swing.JFrame {

    private Empleado empleado;
    
    /**
     * Creates new form RegistrarEntrada
     */
    public RegistrarEntrada() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * Constructor para transferir el empleado que registrará la entrada
     * @param empleado 
     */
    public RegistrarEntrada(Empleado empleado) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.empleado = empleado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrarEntrada = new javax.swing.JButton();
        txtPlaca = new javax.swing.JTextField();
        cbxHoraEntrada = new javax.swing.JComboBox<>();
        cbxFase = new javax.swing.JComboBox<>();
        rbtnCasco = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cbxDiaEntrada = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbxMesEntrada = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtAnioEntrada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setText("Placa");

        jLabel2.setText("Hora de llegada");

        btnRegistrarEntrada.setText("Registrar Entrada");
        btnRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEntradaActionPerformed(evt);
            }
        });

        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });

        cbxHoraEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cbxFase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        rbtnCasco.setText("Dejó casco");

        jLabel3.setText("Dia");

        cbxDiaEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel4.setText("Mes");

        cbxMesEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel5.setText("Año:");

        txtAnioEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioEntradaKeyTyped(evt);
            }
        });

        jLabel6.setText("Sistema para registrar entrada de motos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarEntrada)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(rbtnCasco))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbxMesEntrada, javax.swing.GroupLayout.Alignment.LEADING, 0, 97, Short.MAX_VALUE)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxHoraEntrada, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxDiaEntrada, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAnioEntrada))
                                .addGap(18, 18, 18)
                                .addComponent(cbxFase, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel6)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxDiaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxMesEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnioEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnCasco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnRegistrarEntrada)
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnVolver)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que vuelve a la ventana para gestionar las motos por medio del boton volver
     * @param evt 
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        GestionarMotos ventanaMotos = new GestionarMotos();
        ventanaMotos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    
    /**
     * Metodo para reiniciar los textFields
     */
    private void limpiarInputs(){
        txtPlaca.setText("");
        cbxHoraEntrada.setSelectedItem("1");
        cbxDiaEntrada.setSelectedItem("1");
        cbxMesEntrada.setSelectedItem("1");
        txtAnioEntrada.setText("");
    }
    
    /**
     * Metodo que maneja el evento del boton de registrar la entrada
     * @param evt 
     */
    private void btnRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaActionPerformed
        String placa = txtPlaca.getText();
        int horaEntrada = Integer.parseInt(cbxHoraEntrada.getSelectedItem().toString());
        String fase = cbxFase.getSelectedItem().toString();
        
        if( fase.equals("AM") && horaEntrada == 12 ){
            horaEntrada=0;
        }else if( fase.equals("PM") ){
            horaEntrada+=12;
        }
        
        boolean casco = rbtnCasco.isSelected();
        int diaEntrada = Integer.parseInt(cbxDiaEntrada.getSelectedItem().toString());
        int mesEntrada = Integer.parseInt(cbxMesEntrada.getSelectedItem().toString());
        int anioEntrada = Integer.parseInt(txtAnioEntrada.getText());
        
        Date fechaEntrada = new Date(anioEntrada, mesEntrada-1, diaEntrada, horaEntrada, 0);
      
        Moto moto = new Moto( placa , casco , fechaEntrada , empleado);
        
        boolean registrada = VistaParqueadero.cp.registrarEntradaMoto(moto);
        
        if(registrada){
            JOptionPane.showMessageDialog(null, "Se ha registrado la moto con la placa " + placa);
            limpiarInputs();
        }else{
            JOptionPane.showMessageDialog(null, "No se ha registrado la moto");
        }
    }//GEN-LAST:event_btnRegistrarEntradaActionPerformed

    /**
     * Metodo para supervisar que digita el usuario en el textField de la placa
     * @param evt 
     */
    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        VistaParqueadero.vg.validarCaracteresEspeciales(evt);
    }//GEN-LAST:event_txtPlacaKeyTyped

    /**
     * Metodo para supervisar que digita el usuario en el textField del año de la entrada
     * @param evt 
     */
    private void txtAnioEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioEntradaKeyTyped
        VistaParqueadero.vg.validarCaracteresEspeciales(evt);
        VistaParqueadero.vg.soloNumeros(evt);
    }//GEN-LAST:event_txtAnioEntradaKeyTyped

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
            java.util.logging.Logger.getLogger(RegistrarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarEntrada;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxDiaEntrada;
    private javax.swing.JComboBox<String> cbxFase;
    private javax.swing.JComboBox<String> cbxHoraEntrada;
    private javax.swing.JComboBox<String> cbxMesEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtnCasco;
    private javax.swing.JTextField txtAnioEntrada;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
