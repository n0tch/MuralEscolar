package mural.escolar.view;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import mural.escolar.controller.AlunoController;
import mural.escolar.negocio.Aluno;
import mural.escolar.negocio.Hash;
/**
 *
 * @author Frank
 */
public class CadastroAlunoNovo extends javax.swing.JFrame {

    /**
     * Creates new form CadastroAlunoNov
     */
    public CadastroAlunoNovo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTcurso = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTsenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTmatricula = new javax.swing.JTextField();
        TXTnomeAluno = new javax.swing.JTextField();
        TXTemailAluno = new javax.swing.JTextField();
        BTNcadastro = new javax.swing.JButton();
        BTNVoltar = new javax.swing.JButton();
        InvalidNameLabel = new javax.swing.JLabel();
        InvalidSenhaLabel = new javax.swing.JLabel();
        InvalidMatriculaLabel = new javax.swing.JLabel();
        InvalidEmailLabel = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Ola! Seja bem-vindo ao Mural Escolar");

        TXTcurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABI - Ciência da Computação", "Licenciatura em Física", "Eletromecânica" }));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nome completo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Senha:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Matricula:");

        TXTsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTsenhaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Curso:");

        BTNcadastro.setText("Cadastrar");
        BTNcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcadastroActionPerformed(evt);
            }
        });

        BTNVoltar.setText("Voltar");
        BTNVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVoltarActionPerformed(evt);
            }
        });

        InvalidNameLabel.setBackground(new java.awt.Color(255, 51, 51));
        InvalidNameLabel.setForeground(new java.awt.Color(255, 51, 51));
        InvalidNameLabel.setText("Nome Inválido");
        InvalidNameLabel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                InvalidNameLabelComponentHidden(evt);
            }
        });

        InvalidSenhaLabel.setBackground(new java.awt.Color(255, 51, 51));
        InvalidSenhaLabel.setForeground(new java.awt.Color(255, 51, 51));
        InvalidSenhaLabel.setText("A senha deve conter pelomenos 6 caracteres alfanúmericos.");

        InvalidMatriculaLabel.setBackground(new java.awt.Color(255, 51, 51));
        InvalidMatriculaLabel.setForeground(new java.awt.Color(255, 51, 51));
        InvalidMatriculaLabel.setText("Matricula Inválida, a Matricula deve conter 11 digitos");

        InvalidEmailLabel.setBackground(new java.awt.Color(255, 51, 51));
        InvalidEmailLabel.setForeground(new java.awt.Color(255, 51, 51));
        InvalidEmailLabel.setText("Email Inválido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InvalidEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvalidMatriculaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvalidSenhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvalidNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(175, 175, 175)
                            .addComponent(BTNVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BTNcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(TXTemailAluno)
                        .addComponent(TXTmatricula)
                        .addComponent(TXTcurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTnomeAluno)
                        .addComponent(TXTsenha, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)
                        .addComponent(jLabel1)))
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTnomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InvalidNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InvalidSenhaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InvalidMatriculaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTemailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InvalidEmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNcadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        InvalidNameLabel.setVisible(false);
        InvalidSenhaLabel.setVisible(false);
        InvalidMatriculaLabel.setVisible(false);
        InvalidEmailLabel.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTsenhaActionPerformed

    }//GEN-LAST:event_TXTsenhaActionPerformed

    private void BTNcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcadastroActionPerformed
         
        InvalidNameLabel.setVisible(false);
        InvalidSenhaLabel.setVisible(false);
        InvalidMatriculaLabel.setVisible(false);
        
        String msg = "Deseja realmente cadastrar?";
        String title = "Cadastro de Aluno";
        String msg2 = "Seja Bem-vindo ao mural escolar!";
        // Função de Hashing 
        Hash hash = new Hash();
        // Regex's
        String regexemail = " "; 
        String regexname = "^[A-Za-z\\s]+$";
        String regexsenha = "^[a-zA-Z0-9]*$";
        String regexmatricula = "^[0-9]*$";
        boolean teste1 = true;
        boolean teste2 = true;
        boolean teste3 = true;
        boolean teste4 = true;
                
             // Fazer um testes para saber se emails e nome e matricula estão validos
            //caso não esteja exibe mensanges de erro
                
            //EMAIL
              //Pattern pattern = Pattern.compile(regexemail);   
            //  Matcher matcher = pattern.matcher(TXTemailAluno.getText());
              
               // if(!matcher.matches()){
                    // Regex não funciona -.-'
                    //InvalidEmailLabel.setVisible(true);
                    //teste1 = false;
               // }
              //NOME
              Pattern pattern2 = Pattern.compile(regexname);
              Matcher matcher2 = pattern2.matcher(TXTnomeAluno.getText());
               System.out.println(matcher2.matches());
                if(!matcher2.matches()){
                   InvalidNameLabel.setVisible(true);
                   teste2 = false;
                }
               //SENHA
              Pattern pattern3 = Pattern.compile(regexsenha);
              String senha = new String(TXTsenha.getPassword());
              Matcher matcher3 = pattern3.matcher(senha);
              
               System.out.println(matcher3.matches() + "  " + (senha.length() < 6) +"   "+  (senha.length() >= 20));
                if(!matcher3.matches() || ((senha.length() < 6) || (senha.length() >= 20)) ){
                  InvalidSenhaLabel.setVisible(true);
                  teste3 = false;
                }
               //MATRICULA
              Pattern pattern4 = Pattern.compile(regexmatricula);
              Matcher matcher4 = pattern4.matcher(TXTmatricula.getText());
              String mat = TXTmatricula.getText();
               System.out.println(matcher4.matches() + "   " + (mat.length() != 11));
                if(!matcher4.matches() || (mat.length() != 11)){
                   InvalidMatriculaLabel.setVisible(true);
                   teste4 = false;
                }
                
        if (teste1 == true &&  teste2 == true && teste3 ==  true && teste4 == true){ 
        int reply = JOptionPane.showConfirmDialog(null, msg, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
        {
            // Incrementar Banco de Dados
              Aluno aluno = new Aluno();
              AlunoController controllerAluno = new AlunoController();
            
              aluno.setNome(TXTnomeAluno.getText());
              aluno.setEmail(TXTemailAluno.getText());
              aluno.setCurso(TXTcurso.getSelectedItem().toString());
              aluno.setMatricula(TXTmatricula.getText());
            
            try {
                aluno.setSenha( hash.HashSenha(senha));
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException ex) {
                Logger.getLogger(CadastroAlunoNovo.class.getName()).log(Level.SEVERE, null, ex);
            }
                 
            JOptionPane.showMessageDialog(null, controllerAluno.inserir(aluno));
            JOptionPane.showMessageDialog(null, msg2);
          
          dispose();
          LoginForm jF = new LoginForm(); // Abre o formulário de login denovo
          jF.setVisible(true);
         
           }
        }
        
    }//GEN-LAST:event_BTNcadastroActionPerformed

    private void BTNVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVoltarActionPerformed
          //Voltar a tela inicial de login;
      
          LoginForm jF = new LoginForm();
          jF.setVisible(true);
          dispose();
    }//GEN-LAST:event_BTNVoltarActionPerformed

    private void InvalidNameLabelComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_InvalidNameLabelComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_InvalidNameLabelComponentHidden

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
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
            java.util.logging.Logger.getLogger(CadastroAlunoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroAlunoNovo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNVoltar;
    private javax.swing.JButton BTNcadastro;
    private javax.swing.JLabel InvalidEmailLabel;
    private javax.swing.JLabel InvalidMatriculaLabel;
    private javax.swing.JLabel InvalidNameLabel;
    private javax.swing.JLabel InvalidSenhaLabel;
    private javax.swing.JComboBox<String> TXTcurso;
    private javax.swing.JTextField TXTemailAluno;
    private javax.swing.JTextField TXTmatricula;
    private javax.swing.JTextField TXTnomeAluno;
    private javax.swing.JPasswordField TXTsenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
