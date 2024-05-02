package proyecto_01;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

//TRABAJO VERDADERO
public class Visual extends javax.swing.JFrame {

    String[] palabras = {"tigre", "comer", "lugar", "mesas", "luces"}; // Lista de palabras posibles
    Random random = new Random();
    String palabra1 = palabras[random.nextInt(palabras.length)];

    int nivel = 1;
    int size = 1;
    int contador = 4;
    int intento1 = 5;
    int intento2 = 5;

    public Visual() {
        initComponents();
        lblpista.setText(palabra1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField16 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        con = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        txt19 = new javax.swing.JTextField();
        txt16 = new javax.swing.JTextField();
        txt17 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        txt18 = new javax.swing.JTextField();
        txt21 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        txt25 = new javax.swing.JTextField();
        txt23 = new javax.swing.JTextField();
        txt24 = new javax.swing.JTextField();
        lblintentos = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblpista = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        frase = new javax.swing.JLabel();
        puntos = new javax.swing.JLabel();

        jTextField16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("A");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        con.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("ENCUENTRA LA PALABRA");

        txt1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt15.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt17.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt20.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt20.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt18.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt22.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt25.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt25.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt23.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt24.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt24.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblintentos.setBackground(new java.awt.Color(255, 255, 255));
        lblintentos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblintentos.setText("5");

        ingresar.setBackground(new java.awt.Color(255, 255, 255));
        ingresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Intentos:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        lblpista.setBackground(new java.awt.Color(255, 255, 255));
        lblpista.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Puntos:");

        frase.setBackground(new java.awt.Color(255, 255, 255));
        frase.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        puntos.setBackground(new java.awt.Color(255, 255, 255));
        puntos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        puntos.setText("0");

        javax.swing.GroupLayout conLayout = new javax.swing.GroupLayout(con);
        con.setLayout(conLayout);
        conLayout.setHorizontalGroup(
            conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
            .addGroup(conLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(conLayout.createSequentialGroup()
                .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(conLayout.createSequentialGroup()
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(conLayout.createSequentialGroup()
                                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(conLayout.createSequentialGroup()
                                .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(conLayout.createSequentialGroup()
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(conLayout.createSequentialGroup()
                                .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(conLayout.createSequentialGroup()
                                .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(conLayout.createSequentialGroup()
                                            .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(conLayout.createSequentialGroup()
                                            .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(conLayout.createSequentialGroup()
                                        .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(conLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(conLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblintentos))
                            .addGroup(conLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(conLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(frase, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblpista, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(conLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        conLayout.setVerticalGroup(
            conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresar)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblintentos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblpista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(frase)
                    .addComponent(puntos))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(con, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed

        switch (intento1) {
            case 5:
                encontrarpalabra1();
                break;
            case 4:
                encontrarPalabra2();
                break;
            case 3:
                encontrarPalabra3();
                break;
            case 2:
                encontrarPalabra4();
                break;
            case 1:
                encontrarPalabra5();
                break;
            default:
                break;
        }

    }//GEN-LAST:event_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel con;
    private javax.swing.JLabel frase;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JLabel lblintentos;
    private javax.swing.JLabel lblpista;
    private javax.swing.JLabel puntos;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt23;
    private javax.swing.JTextField txt24;
    private javax.swing.JTextField txt25;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables

    private void encontrarpalabra1() {
        try {
            int i;
            System.out.println(palabra1);
            String PrimeraLetra = txt1.getText();
            String SegundaLetra = txt2.getText();
            String TerceraLetra = txt3.getText();
            String CuartaaLetra = txt4.getText();
            String QuintaaLetra = txt5.getText();
            String Resultado = PrimeraLetra + SegundaLetra + TerceraLetra + CuartaaLetra + QuintaaLetra;

            if (Resultado.equalsIgnoreCase(palabra1)) {
                JOptionPane.showMessageDialog(null, "Primera Palabra encontrada");
                txt1.setBackground(Color.GREEN);
                txt2.setBackground(Color.GREEN);
                txt3.setBackground(Color.GREEN);
                txt4.setBackground(Color.GREEN);
                txt5.setBackground(Color.GREEN);

                contador--;
                nivel++;
                int R = recursividad(Resultado, 0);
                puntos.setText(String.valueOf(R));

                int a = JOptionPane.showConfirmDialog(rootPane, "Avanzar a la siguiente palabra");
                if (a == 0) {
                    LimpiarTodo();
                }

            } else {
//Primer Espacio
                if (PrimeraLetra.charAt(0) == palabra1.charAt(0)) {
                    txt1.setBackground(Color.GREEN);
                } else {
                    String mensaje = "esta no es la palabra";
                    for (i = 0; i < 5; i++) {
                        char letraPuesta = PrimeraLetra.charAt(0);
                        char letraObjetivo = palabra1.charAt(i);

                        if (letraPuesta == letraObjetivo) {
                            txt1.setBackground(Color.yellow);
                        } else if (palabra1.contains(String.valueOf(letraPuesta))) {
                            txt1.setBackground(Color.yellow);
                        } else {
                            txt1.setBackground(Color.red);
                        }
                    }
                }
//Segundo Espacio
                    if (SegundaLetra.charAt(0) == palabra1.charAt(1)) {
                        txt2.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = SegundaLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt2.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt2.setBackground(Color.yellow);
                            } else {
                                txt2.setBackground(Color.red);
                            }
                        }
                    }
                    //Tercer Espacio       

                    if (TerceraLetra.charAt(0) == palabra1.charAt(2)) {
                        txt3.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = TerceraLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt3.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt3.setBackground(Color.yellow);
                            } else {
                                txt3.setBackground(Color.red);
                            }
                        }
                    }
                    //Cuarto Espacio     
                    if (CuartaaLetra.charAt(0) == palabra1.charAt(3)) {
                        txt4.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = CuartaaLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt4.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt4.setBackground(Color.yellow);
                            } else {
                                txt4.setBackground(Color.red);
                            }
                        }
                    }
                    //quinto Espacio                   

                    if (QuintaaLetra.charAt(0) == palabra1.charAt(4)) {
                        txt5.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = QuintaaLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt5.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt5.setBackground(Color.yellow);
                            } else {
                                txt5.setBackground(Color.red);
                            }
                        }
                    }
                    //Tercer Espacio                   

                
            }

            intento1--;
            lblintentos.setText(String.valueOf(intento1));
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Un espacio esta vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void encontrarPalabra2() {
        //fila 4
        try {
            int i;
            System.out.println(palabra1);
            String PrimeraLetra = txt6.getText();
            String SegundaLetra = txt7.getText();
            String TerceraLetra = txt8.getText();
            String CuartaaLetra = txt9.getText();
            String QuintaaLetra = txt10.getText();
            String Resultado = PrimeraLetra + SegundaLetra + TerceraLetra + CuartaaLetra + QuintaaLetra;

            if (Resultado.equalsIgnoreCase(palabra1)) {
                JOptionPane.showMessageDialog(null, "Primera Palabra encontrada");
                txt6.setBackground(Color.GREEN);
                txt7.setBackground(Color.GREEN);
                txt8.setBackground(Color.GREEN);
                txt9.setBackground(Color.GREEN);
                txt10.setBackground(Color.GREEN);
                contador--;
                nivel++;
                int R = recursividad(Resultado, 0);
                puntos.setText(String.valueOf(R));
                int a = JOptionPane.showConfirmDialog(rootPane, "Avanzar a la siguiente palabra");
                if (a == 0) {
                    LimpiarTodo();

                }

            } else {
//Primer Espacio
                if (PrimeraLetra.charAt(0) == palabra1.charAt(0)) {
                    txt6.setBackground(Color.GREEN);
                } else {
                    String mensaje = "esta no es la palabra";

                    for (i = 0; i < 5; i++) {
                        char letraPuesta = PrimeraLetra.charAt(0);
                        char letraObjetivo = palabra1.charAt(i);

                        if (letraPuesta == letraObjetivo) {
                            txt6.setBackground(Color.yellow);
                        } else if (palabra1.contains(String.valueOf(letraPuesta))) {
                            txt6.setBackground(Color.yellow);
                        } else {
                            txt6.setBackground(Color.red);
                        }
                    }
                }
//Segundo Espacio
                if (SegundaLetra.charAt(0) == palabra1.charAt(1)) {
                    txt7.setBackground(Color.GREEN);
                } else {

                    for (i = 0; i < 5; i++) {
                        char letraPuestaA = SegundaLetra.charAt(0);
                        char letraObjetivoA = palabra1.charAt(i);

                        if (letraPuestaA == letraObjetivoA) {
                            txt7.setBackground(Color.yellow);
                        } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                            txt7.setBackground(Color.yellow);
                        } else {
                            txt7.setBackground(Color.red);
                        }
                    }
                }
                //Tercer Espacio       

                if (TerceraLetra.charAt(0) == palabra1.charAt(2)) {
                    txt8.setBackground(Color.GREEN);
                } else {

                    for (i = 0; i < 5; i++) {
                        char letraPuestaA = TerceraLetra.charAt(0);
                        char letraObjetivoA = palabra1.charAt(i);

                        if (letraPuestaA == letraObjetivoA) {
                            txt8.setBackground(Color.yellow);
                        } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                            txt8.setBackground(Color.yellow);
                        } else {
                            txt8.setBackground(Color.red);
                        }
                    }
                }
                //Cuarto Espacio     
                if (CuartaaLetra.charAt(0) == palabra1.charAt(3)) {
                    txt9.setBackground(Color.GREEN);
                } else {

                    for (i = 0; i < 5; i++) {
                        char letraPuestaA = CuartaaLetra.charAt(0);
                        char letraObjetivoA = palabra1.charAt(i);

                        if (letraPuestaA == letraObjetivoA) {
                            txt9.setBackground(Color.yellow);
                        } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                            txt9.setBackground(Color.yellow);
                        } else {
                            txt9.setBackground(Color.red);
                        }
                    }
                }
                //quinto Espacio                   

                if (QuintaaLetra.charAt(0) == palabra1.charAt(4)) {
                    txt10.setBackground(Color.GREEN);
                } else {

                    for (i = 0; i < 5; i++) {
                        char letraPuestaA = QuintaaLetra.charAt(0);
                        char letraObjetivoA = palabra1.charAt(i);

                        if (letraPuestaA == letraObjetivoA) {
                            txt10.setBackground(Color.yellow);
                        } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                            txt10.setBackground(Color.yellow);
                        } else {
                            txt10.setBackground(Color.red);
                        }
                    }
                }

            }
            intento1--;
            lblintentos.setText(String.valueOf(intento1));
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Un espacio esta vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void encontrarPalabra3() {
        //fila 3
        try {
            int i;
            System.out.println(palabra1);
            String PrimeraLetra = txt11.getText();
            String SegundaLetra = txt12.getText();
            String TerceraLetra = txt13.getText();
            String CuartaaLetra = txt14.getText();
            String QuintaaLetra = txt15.getText();
            String Resultado = PrimeraLetra + SegundaLetra + TerceraLetra + CuartaaLetra + QuintaaLetra;

            if (Resultado.equalsIgnoreCase(palabra1)) {
                JOptionPane.showMessageDialog(null, "Primera Palabra encontrada");
                txt11.setBackground(Color.GREEN);
                txt12.setBackground(Color.GREEN);
                txt13.setBackground(Color.GREEN);
                txt14.setBackground(Color.GREEN);
                txt15.setBackground(Color.GREEN);
                contador--;
                nivel++;
                int R = recursividad(Resultado, 0);
                puntos.setText(String.valueOf(R));

                int a = JOptionPane.showConfirmDialog(rootPane, "Avanzar a la siguiente palabra");
                if (a == 0) {
                    LimpiarTodo();

                }

            } else {
//Primer Espacio
                if (PrimeraLetra.charAt(0) == palabra1.charAt(0)) {
                    txt11.setBackground(Color.GREEN);
                } else {
                    String mensaje = "esta no es la palabra";
                    for (i = 0; i < 5; i++) {
                        char letraPuesta = PrimeraLetra.charAt(0);
                        char letraObjetivo = palabra1.charAt(i);

                        if (letraPuesta == letraObjetivo) {
                            txt11.setBackground(Color.yellow);
                        } else if (palabra1.contains(String.valueOf(letraPuesta))) {
                            txt11.setBackground(Color.yellow);
                        } else {
                            txt11.setBackground(Color.red);
                        }
                    }
                }
//Segundo Espacio
                    if (SegundaLetra.charAt(0) == palabra1.charAt(1)) {
                        txt12.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = SegundaLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt12.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt12.setBackground(Color.yellow);
                            } else {
                                txt12.setBackground(Color.red);
                            }
                        }
                    }
                    //Tercer Espacio       

                    if (TerceraLetra.charAt(0) == palabra1.charAt(2)) {
                        txt13.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = TerceraLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt13.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt13.setBackground(Color.yellow);
                            } else {
                                txt13.setBackground(Color.red);
                            }
                        }
                    }
                    //Cuarto Espacio     
                    if (CuartaaLetra.charAt(0) == palabra1.charAt(3)) {
                        txt14.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = CuartaaLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt14.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt14.setBackground(Color.yellow);
                            } else {
                                txt14.setBackground(Color.red);
                            }
                        }
                    }
                    //quinto Espacio                   

                    if (QuintaaLetra.charAt(0) == palabra1.charAt(4)) {
                        txt15.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = QuintaaLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt15.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt15.setBackground(Color.yellow);
                            } else {
                                txt15.setBackground(Color.red);
                            }
                        }
                    }
                    //Tercer Espacio                   

                
            }

            intento1--;
            lblintentos.setText(String.valueOf(intento1));
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Un espacio esta vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void encontrarPalabra4() {
        //fila 3
        try {
            int i;
            System.out.println(palabra1);
            String PrimeraLetra = txt16.getText();
            String SegundaLetra = txt17.getText();
            String TerceraLetra = txt18.getText();
            String CuartaaLetra = txt19.getText();
            String QuintaaLetra = txt20.getText();
            String Resultado = PrimeraLetra + SegundaLetra + TerceraLetra + CuartaaLetra + QuintaaLetra;

            if (Resultado.equalsIgnoreCase(palabra1)) {
                JOptionPane.showMessageDialog(null, "Primera Palabra encontrada");
                txt16.setBackground(Color.GREEN);
                txt17.setBackground(Color.GREEN);
                txt18.setBackground(Color.GREEN);
                txt19.setBackground(Color.GREEN);
                txt20.setBackground(Color.GREEN);

                contador--;
                nivel++;
                int R = recursividad(Resultado, 0);
                puntos.setText(String.valueOf(R));
                int a = JOptionPane.showConfirmDialog(rootPane, "Avanzar a la siguiente palabra");
                if (a == 0) {
                    LimpiarTodo();

                }

            } else {
//Primer Espacio
                if (PrimeraLetra.charAt(0) == palabra1.charAt(0)) {
                    txt16.setBackground(Color.GREEN);
                } else {
                    String mensaje = "esta no es la palabra";
                   
                    for (i = 0; i < 5; i++) {
                        char letraPuesta = PrimeraLetra.charAt(0);
                        char letraObjetivo = palabra1.charAt(i);

                        if (letraPuesta == letraObjetivo) {
                            txt16.setBackground(Color.yellow);
                        } else if (palabra1.contains(String.valueOf(letraPuesta))) {
                            txt16.setBackground(Color.yellow);
                        } else {
                            txt16.setBackground(Color.red);
                        }
                    }
                }
//Segundo Espacio
                    if (SegundaLetra.charAt(0) == palabra1.charAt(1)) {
                        txt17.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = SegundaLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt17.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt17.setBackground(Color.yellow);
                            } else {
                                txt17.setBackground(Color.red);
                            }
                        }
                    }
                    //Tercer Espacio       

                    if (TerceraLetra.charAt(0) == palabra1.charAt(2)) {
                        txt18.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = TerceraLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt18.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt18.setBackground(Color.yellow);
                            } else {
                                txt18.setBackground(Color.red);
                            }
                        }
                    }
                    //Cuarto Espacio     
                    if (CuartaaLetra.charAt(0) == palabra1.charAt(3)) {
                        txt19.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = CuartaaLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt19.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt19.setBackground(Color.yellow);
                            } else {
                                txt19.setBackground(Color.red);
                            }
                        }
                    }
                    //quinto Espacio                   

                    if (QuintaaLetra.charAt(0) == palabra1.charAt(4)) {
                        txt20.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = QuintaaLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt20.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt20.setBackground(Color.yellow);
                            } else {
                                txt20.setBackground(Color.red);
                            }
                        }
                    }
                }
            
            intento1--;
            lblintentos.setText(String.valueOf(intento1));
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Un espacio esta vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void encontrarPalabra5() {
        //fila 1
        try {
            int i;
            System.out.println(palabra1);
            String PrimeraLetra = txt21.getText();
            String SegundaLetra = txt22.getText();
            String TerceraLetra = txt23.getText();
            String CuartaaLetra = txt24.getText();
            String QuintaaLetra = txt25.getText();
            String Resultado = PrimeraLetra + SegundaLetra + TerceraLetra + CuartaaLetra + QuintaaLetra;

            if (Resultado.equalsIgnoreCase(palabra1)) {
                JOptionPane.showMessageDialog(null, "Primera Palabra encontrada");
                txt21.setBackground(Color.GREEN);
                txt22.setBackground(Color.GREEN);
                txt23.setBackground(Color.GREEN);
                txt24.setBackground(Color.GREEN);
                txt25.setBackground(Color.GREEN);

                contador--;
                nivel++;
                int R = recursividad(Resultado, 0);
                puntos.setText(String.valueOf(R));
                int a = JOptionPane.showConfirmDialog(rootPane, "Avanzar a la siguiente palabra");
                if (a == 0) {
                    LimpiarTodo();

                }

            } else {
//Primer Espacio
                if (PrimeraLetra.charAt(0) == palabra1.charAt(0)) {
                    txt21.setBackground(Color.GREEN);
                } else {
                    String mensaje = "esta no es la palabra";
                    for (i = 0; i < 5; i++) {
                        char letraPuesta = PrimeraLetra.charAt(0);
                        char letraObjetivo = palabra1.charAt(i);

                        if (letraPuesta == letraObjetivo) {
                            txt21.setBackground(Color.yellow);
                        } else if (palabra1.contains(String.valueOf(letraPuesta))) {
                            txt21.setBackground(Color.yellow);
                        } else {
                            txt21.setBackground(Color.red);
                        }
                    }
                }
//Segundo Espacio
                    if (SegundaLetra.charAt(0) == palabra1.charAt(1)) {
                        txt22.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = SegundaLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt22.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt22.setBackground(Color.yellow);
                            } else {
                                txt22.setBackground(Color.red);
                            }
                        }
                    }
                    //Tercer Espacio       

                    if (TerceraLetra.charAt(0) == palabra1.charAt(2)) {
                        txt23.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = TerceraLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt23.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt23.setBackground(Color.yellow);
                            } else {
                                txt23.setBackground(Color.red);
                            }
                        }
                    }
                    //Cuarto Espacio     
                    if (CuartaaLetra.charAt(0) == palabra1.charAt(3)) {
                        txt24.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = CuartaaLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt24.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt24.setBackground(Color.yellow);
                            } else {
                                txt24.setBackground(Color.red);
                            }
                        }
                    }
                    //quinto Espacio                   

                    if (QuintaaLetra.charAt(0) == palabra1.charAt(4)) {
                        txt25.setBackground(Color.GREEN);
                    } else {

                        for (i = 0; i < 5; i++) {
                            char letraPuestaA = QuintaaLetra.charAt(0);
                            char letraObjetivoA = palabra1.charAt(i);

                            if (letraPuestaA == letraObjetivoA) {
                                txt25.setBackground(Color.yellow);
                            } else if (palabra1.contains(String.valueOf(letraPuestaA))) {

                                txt25.setBackground(Color.yellow);
                            } else {
                                txt25.setBackground(Color.red);
                            }
                        }
                    }
                    //Tercer Espacio                   

                
            }

            intento1--;
            lblintentos.setText(String.valueOf(intento1));
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Un espacio esta vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LimpiarTodo() {
        txt1.setBackground(Color.WHITE);
        txt2.setBackground(Color.WHITE);
        txt3.setBackground(Color.WHITE);
        txt4.setBackground(Color.WHITE);
        txt5.setBackground(Color.WHITE);
        txt6.setBackground(Color.WHITE);
        txt7.setBackground(Color.WHITE);
        txt8.setBackground(Color.WHITE);
        txt9.setBackground(Color.WHITE);
        txt10.setBackground(Color.WHITE);
        txt11.setBackground(Color.WHITE);
        txt12.setBackground(Color.WHITE);
        txt13.setBackground(Color.WHITE);
        txt14.setBackground(Color.WHITE);
        txt15.setBackground(Color.WHITE);
        txt16.setBackground(Color.WHITE);
        txt17.setBackground(Color.WHITE);
        txt18.setBackground(Color.WHITE);
        txt19.setBackground(Color.WHITE);
        txt20.setBackground(Color.WHITE);
        txt21.setBackground(Color.WHITE);
        txt22.setBackground(Color.WHITE);
        txt23.setBackground(Color.WHITE);
        txt24.setBackground(Color.WHITE);
        txt25.setBackground(Color.WHITE);

        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        txt7.setText("");
        txt8.setText("");
        txt9.setText("");
        txt10.setText("");
        txt11.setText("");
        txt12.setText("");
        txt13.setText("");
        txt14.setText("");
        txt15.setText("");
        txt16.setText("");
        txt17.setText("");
        txt18.setText("");
        txt19.setText("");
        txt20.setText("");
        txt21.setText("");
        txt22.setText("");
        txt23.setText("");
        txt24.setText("");
        txt25.setText("");

    }

    private int recursividad(String palabra, int indice) {
        if (indice == palabra.length()) {
            return 0;
        } else {
            char letra = palabra.charAt(indice);
            //hola

            return (int) letra + recursividad(palabra, indice + 1);

        }
    }

}
