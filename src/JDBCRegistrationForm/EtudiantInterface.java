/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCRegistrationForm;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author walid
 */
public class EtudiantInterface extends javax.swing.JFrame {
int questionCounter=1;
int qcmScore=0;

int currentQuestionID = -1;

 String[] currentAnswers = new String[3];
    int[] correcyAnswers = new int[3];
    int[] correcyAnswersIds = new int[3];

ArrayList<String> QuestionsList;
ArrayList<Integer> QuestionsIDsList;
    /**
     * Creates new form EtudiantInterface
     */
    public EtudiantInterface() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelQuestionCounter = new javax.swing.JLabel();
        jlName2 = new javax.swing.JLabel();
        jtfQuestion = new javax.swing.JTextField();
        jRadioButtonA = new javax.swing.JRadioButton();
        jRadioButtonB = new javax.swing.JRadioButton();
        jRadioButtonC = new javax.swing.JRadioButton();
        jtfReponseC = new javax.swing.JTextField();
        jtfReponseB = new javax.swing.JTextField();
        jtfReponseA = new javax.swing.JTextField();
        jlName3 = new javax.swing.JLabel();
        jlName4 = new javax.swing.JLabel();
        jlName5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Interface Etudiant");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Temps pour QCM");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Question:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("/4");

        jLabelQuestionCounter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelQuestionCounter.setText("1");

        jlName2.setText("Question: ");

        jtfQuestion.setBackground(new java.awt.Color(51, 102, 255));
        jtfQuestion.setForeground(new java.awt.Color(255, 255, 255));
        jtfQuestion.setText("Question?");

        jRadioButtonA.setBackground(new java.awt.Color(51, 102, 255));
        buttonGroup1.add(jRadioButtonA);
        jRadioButtonA.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonA.setSelected(true);
        jRadioButtonA.setText("Correct");

        jRadioButtonB.setBackground(new java.awt.Color(51, 102, 255));
        buttonGroup1.add(jRadioButtonB);
        jRadioButtonB.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonB.setText("Correct");

        jRadioButtonC.setBackground(new java.awt.Color(51, 102, 255));
        buttonGroup1.add(jRadioButtonC);
        jRadioButtonC.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonC.setText("Correct");

        jtfReponseC.setBackground(new java.awt.Color(51, 102, 255));
        jtfReponseC.setForeground(new java.awt.Color(255, 255, 255));
        jtfReponseC.setText("ReponseC");

        jtfReponseB.setBackground(new java.awt.Color(51, 102, 255));
        jtfReponseB.setForeground(new java.awt.Color(255, 255, 255));
        jtfReponseB.setText("ReponseB");

        jtfReponseA.setBackground(new java.awt.Color(51, 102, 255));
        jtfReponseA.setForeground(new java.awt.Color(255, 255, 255));
        jtfReponseA.setText("ReponseA");

        jlName3.setText("ReponseA: ");

        jlName4.setText("ReponseB: ");

        jlName5.setText("ReponseC: ");

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Suivant");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlName2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 16, Short.MAX_VALUE)
                                .addComponent(jtfQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlName3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfReponseA, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonA))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(189, 189, 189)
                                        .addComponent(jLabel3)
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabelQuestionCounter)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(jLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlName4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlName5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfReponseC, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                            .addComponent(jtfReponseB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonB)
                            .addComponent(jRadioButtonC))
                        .addGap(16, 16, 16))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(285, 285, 285))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabelQuestionCounter))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlName2)
                    .addComponent(jtfQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlName3)
                    .addComponent(jtfReponseA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlName4)
                    .addComponent(jtfReponseB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlName5)
                    .addComponent(jtfReponseC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonC))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     //  incrementQuestionCounter();
       
       int answerAValue = jRadioButtonA.isSelected()?1:0;
       int answerBValue = jRadioButtonB.isSelected()?1:0;
       int answerCValue = jRadioButtonC.isSelected()?1:0;
       
        jtfReponseA.setText(currentAnswers[0]);
        if(correcyAnswers[0] == answerAValue && correcyAnswers[1] == answerBValue && correcyAnswers[2] == answerCValue)
        {
            System.out.println("Correct Answer!");
           qcmScore++;
        }
        else
            System.out.println("SORRY! Uncorrect Answer!");
        incrementQuestionCounter();
        generateRandomQCM();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       QuestionsList = new ArrayList<String>();
         QuestionsIDsList= new ArrayList<Integer>();
         RetrieveQuestions();
         
         generateRandomQCM();
         
         
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(EtudiantInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EtudiantInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EtudiantInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EtudiantInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EtudiantInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelQuestionCounter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonA;
    private javax.swing.JRadioButton jRadioButtonB;
    private javax.swing.JRadioButton jRadioButtonC;
    private javax.swing.JLabel jlName2;
    private javax.swing.JLabel jlName3;
    private javax.swing.JLabel jlName4;
    private javax.swing.JLabel jlName5;
    private javax.swing.JTextField jtfQuestion;
    private javax.swing.JTextField jtfReponseA;
    private javax.swing.JTextField jtfReponseB;
    private javax.swing.JTextField jtfReponseC;
    // End of variables declaration//GEN-END:variables



private void incrementQuestionCounter()
{

questionCounter++;
jLabelQuestionCounter.setText(questionCounter+"");

if(questionCounter>4)
{

jLabel1.setText("Fin de QCM");
jLabel2.setText("Votre score est: "+ qcmScore + "/4");



jLabel3.setVisible(false);
jLabel4.setVisible(false);
jLabelQuestionCounter.setVisible(false);

jlName2.setVisible(false);
jlName3.setVisible(false);
jlName4.setVisible(false);
jlName5.setVisible(false);

jtfQuestion.setVisible(false);
jtfReponseA.setVisible(false);
jtfReponseB.setVisible(false);
jtfReponseC.setVisible(false);
jButton1.setVisible(false);

jRadioButtonA.setVisible(false);
jRadioButtonB.setVisible(false);
jRadioButtonC.setVisible(false);

}


}


void RetrieveQuestions()
{


    ResultSet res = null;
        String req = "SELECT * FROM questiontable ;";
         try
        {
            Connection cnx =  DBConnection.connect();
            PreparedStatement ps = cnx.prepareStatement(req);

          res = ps.executeQuery();
         
          int answerI=0;
        
           while(res.next())
           {
           
             QuestionsList.add(res.getString("enonce"));
             QuestionsIDsList.add(res.getInt("idQuest"));
             
            
           System.out.println("Query exists");
           answerI++;
           
           }   
         System.out.println("Retrived "+answerI+" questions");
           

        }catch (SQLException ex)
        {
            System.err.println("PConnection Problem !!");
        }
    



}

private static int getRandomNumberInRange(int min, int max) 
{

	if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
	}

	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
}

private void generateRandomQCM()
{
    
   int randomIndex =  getRandomNumberInRange(0,  QuestionsList.size()-1);
    System.out.println("Random number generated is "+ randomIndex);
   
    jtfQuestion.setText( QuestionsList.get( randomIndex));
    generateAnswersToQuestion(QuestionsIDsList.get(randomIndex));
    
    jtfReponseA.setText(currentAnswers[0]);
    jtfReponseB.setText(currentAnswers[1]);
    jtfReponseC.setText(currentAnswers[2]);

}



private void generateAnswersToQuestion(int idQuest)
{

   ResultSet res = null;
        String req = "SELECT * FROM reponsetable WHERE idQuest = ?;";
         try
        {
            Connection cnx =  DBConnection.connect();
            PreparedStatement ps = cnx.prepareStatement(req);
            
            ps.setInt(1,idQuest);

          res = ps.executeQuery();
         
          int answerI=0;
           while(res.next())
           {
           
             currentAnswers[answerI] = res.getString("enonce");
             correcyAnswers[answerI] = res.getInt("correct");
             correcyAnswersIds[answerI] = res.getInt("idRep");
            System.out.println("answer "+ answerI +" with id" + correcyAnswersIds[answerI]);
           System.out.println("Query exists");
           answerI++;
           
           }   
         
           

        }catch (SQLException ex)
        {
            System.err.println("PConnection Problem !!");
        }
    



}


}
