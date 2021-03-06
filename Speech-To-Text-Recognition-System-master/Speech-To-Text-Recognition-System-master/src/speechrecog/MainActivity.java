/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speechrecog;

//import of API classes
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechAligner;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.result.Lattice;
import edu.cmu.sphinx.result.WordResult;
//import of IO classes
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.FileWriter;
import  java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
//import of swing components

/**
 *
 * @author DEJI
 */
public class MainActivity extends javax.swing.JFrame {
    //declaration of paths to attributes
    String a_path = "resource:/edu/cmu/sphinx/models/en-us/en-us";
    String d_path = "resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict";
    String l_path = "resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin";
    //Declaration of other variables
    Configuration config;
    LiveSpeechRecognizer recog;
    SpeechResult result;
    SpeechAligner align;
    /**
     * Creates new form MainActivity
     */
    public MainActivity() {
        initComponents();
        defaultActions();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        speakStart = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultField = new javax.swing.JTextField();
        speakStop = new javax.swing.JButton();
        speakStart1 = new javax.swing.JButton();
        speakStart2 = new javax.swing.JButton();
        restartSpeech = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 40)); // NOI18N
        jLabel1.setText("TRAINABLE SPEECH RECOGNITION SYSTEM ");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 40)); // NOI18N
        jLabel2.setText("BASED ON SYLLABLES");

        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 255));

        speakStart.setBackground(new java.awt.Color(0, 204, 204));
        speakStart.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        speakStart.setText("START SPEAKING");
        speakStart.setToolTipText("Click to Record Speech");
        speakStart.setBorder(null);
        speakStart.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                speakStartMouseMoved(evt);
            }
        });
        speakStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakStartActionPerformed(evt);
            }
        });

        resultField.setBackground(new java.awt.Color(222, 243, 243));
        resultField.setFont(new java.awt.Font("Ubuntu Light", 2, 24)); // NOI18N
        resultField.setToolTipText("Spoken word shows here");
        jScrollPane3.setViewportView(resultField);

        speakStop.setBackground(new java.awt.Color(0, 204, 204));
        speakStop.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        speakStop.setText("STOP SPEAKING");
        speakStop.setToolTipText("Click to Record Speech");
        speakStop.setBorder(null);
        speakStop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                speakStopMouseMoved(evt);
            }
        });
        speakStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakStopActionPerformed(evt);
            }
        });

        speakStart1.setBackground(new java.awt.Color(0, 204, 204));
        speakStart1.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        speakStart1.setText("DISCARD");
        speakStart1.setToolTipText("Click to Record Speech");
        speakStart1.setBorder(null);
        speakStart1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                speakStart1MouseMoved(evt);
            }
        });
        speakStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakStart1ActionPerformed(evt);
            }
        });

        speakStart2.setBackground(new java.awt.Color(0, 204, 204));
        speakStart2.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        speakStart2.setText("SAVE");
        speakStart2.setToolTipText("Click to Record Speech");
        speakStart2.setBorder(null);
        speakStart2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                speakStart2MouseMoved(evt);
            }
        });
        speakStart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakStart2ActionPerformed(evt);
            }
        });

        restartSpeech.setBackground(new java.awt.Color(0, 204, 204));
        restartSpeech.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        restartSpeech.setText("RESTART");
        restartSpeech.setToolTipText("Click to Record Speech");
        restartSpeech.setBorder(null);
        restartSpeech.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                restartSpeechMouseMoved(evt);
            }
        });
        restartSpeech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartSpeechActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(speakStart, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(speakStop, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(speakStart2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(speakStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(restartSpeech, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(speakStart, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(speakStop, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restartSpeech, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speakStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speakStart2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        jTabbedPane1.addTab("Speak", jPanel2);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Word training is done using a total\nof 5 samples. Make sure your voice\nis clear and audible to ensure\nbest results\n");
        jScrollPane1.setViewportView(jTextArea1);

        jInternalFrame1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jInternalFrame1.setFrameIcon(null);
        jInternalFrame1.setVisible(true);

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setToolTipText("Enter Spoken word");

        jButton2.setText("Discard");

        jButton3.setText("Save");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Train", jPanel3);

        jScrollPane2.setViewportView(jTextPane1);

        jTabbedPane1.addTab("tab3", jScrollPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void defaultActions(){
        try{
            config = new Configuration();
            //setting paths to attributes
            config.setAcousticModelPath(a_path);
            config.setDictionaryPath(d_path);
            config.setLanguageModelPath(l_path);
            //adding attribute so a SpeechRecognizer
            recog = new LiveSpeechRecognizer(config);
            
            
            /*Questions to be asked - How to check for certain text in user voice input, 
            how to train the machine with certain words, how to accept user input,
            how to show audio wave audibility strength on JAVA Swing GUI
            */
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error in main method: "+ex.getMessage());
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void speakStartMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speakStartMouseMoved
        speakStart.setBackground(new java.awt.Color(0,205,207));
    }//GEN-LAST:event_speakStartMouseMoved

    private void speakStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakStartActionPerformed
        // TODO add your handling code here:
        //start of audio content recogniton
        recog.startRecognition(true);
        result = recog.getResult(); //result obtained from recognized contents of the audio
        while((result=recog.getResult())!=null){
        resultField.setText("Hypothesis: "+result.getHypothesis());
        }
        //decoding telephone audio quality with sample rate 8000Hz
        config.setSampleRate(8000);

        result.getWords().stream().forEach((w_result) -> {
            System.out.println(w_result);
        });
        //Lattice lattice = null;
        result.getLattice().dumpDot("lattice.dot", "lattice");
        speakStart.setEnabled(false);
    }//GEN-LAST:event_speakStartActionPerformed

    private void speakStopMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speakStopMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_speakStopMouseMoved

    private void speakStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakStopActionPerformed
        // TODO add your handling code here:
        //end of audio content recognition
        recog.stopRecognition();
        speakStop.setEnabled(false);
    }//GEN-LAST:event_speakStopActionPerformed

    private void speakStart1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speakStart1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_speakStart1MouseMoved

    private void speakStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakStart1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speakStart1ActionPerformed

    private void speakStart2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speakStart2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_speakStart2MouseMoved

    private void speakStart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakStart2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speakStart2ActionPerformed

    private void restartSpeechMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restartSpeechMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_restartSpeechMouseMoved

    private void restartSpeechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartSpeechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restartSpeechActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try{
        javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error due to: "+ex.getMessage());
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton restartSpeech;
    private javax.swing.JTextField resultField;
    private javax.swing.JButton speakStart;
    private javax.swing.JButton speakStart1;
    private javax.swing.JButton speakStart2;
    private javax.swing.JButton speakStop;
    // End of variables declaration//GEN-END:variables
}
