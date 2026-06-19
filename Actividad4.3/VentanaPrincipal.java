package actividad4.pkg3;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        txtCalcular = new javax.swing.JButton();
        txtLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtValorNumerico = new javax.swing.JTextField();
        txtLogaritmoNeperiano = new javax.swing.JTextField();
        txtRaizCuadrada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCalcular.setText("Calcular");
        txtCalcular.addActionListener(this::txtCalcularActionPerformed);

        txtLimpiar.setText("Limpiar");
        txtLimpiar.addActionListener(this::txtLimpiarActionPerformed);

        jLabel1.setText("Valor numerico");

        txtValorNumerico.addActionListener(this::txtValorNumericoActionPerformed);

        jLabel2.setText("Logaritmo Neperiano");

        jLabel3.setText("Raiz Cuadrada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(txtCalcular)
                        .addGap(76, 76, 76)
                        .addComponent(txtLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(46, 46, 46)
                                .addComponent(txtRaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValorNumerico, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLogaritmoNeperiano, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtValorNumerico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogaritmoNeperiano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalcular)
                    .addComponent(txtLimpiar))
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>                        

    private void txtValorNumericoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
    }                                                

    private void txtCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
        double valor = Double.parseDouble(txtValorNumerico.getText());
        double LogaritmoNeperiano = CalculosNumericos.calcularLogaritmoNeperiano(valor);
        double RaizCuadrada = CalculosNumericos.calcularRaizCuadrada(valor);
        
        txtLogaritmoNeperiano.setText(String.valueOf(LogaritmoNeperiano));
        txtRaizCuadrada.setText(String.valueOf(RaizCuadrada));
        
       
    }                                           

    private void txtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        txtValorNumerico.setText("");
        txtLogaritmoNeperiano.setText("");
        txtRaizCuadrada.setText("");
    }                                          

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton txtCalcular;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JTextField txtLogaritmoNeperiano;
    private javax.swing.JTextField txtRaizCuadrada;
    private javax.swing.JTextField txtValorNumerico;
    // End of variables declaration                   
}
