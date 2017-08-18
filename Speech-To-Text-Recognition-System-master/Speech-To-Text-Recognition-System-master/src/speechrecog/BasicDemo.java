/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speechrecog;

import edu.cmu.sphinx.api.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
import javax.swing.JOptionPane;

/**
 *
 * @author DEJI
 */
public class BasicDemo {
    public static void main(String[] args){
        ConfigurationManager config = new ConfigurationManager();
        if(args.length>0){
            config = new ConfigurationManager(args[0]);
        }else{
            try{
            config = new ConfigurationManager(BasicDemo.class.getResource("myconfig.xml"));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "error due to "+ex.getMessage());
            }
        }
        Recognizer recog = (Recognizer)config.lookup("recognition");
        recog.allocate();
        //start of Microphone
        Microphone mich = (Microphone)config.lookup("microphone");
        String action = JOptionPane.showInputDialog("1. Record Voice \n2. Exit");
       if(action=="2"){
           JOptionPane.showMessageDialog(null,"Cannot start recording");
           recog.deallocate();
           System.exit(1);
       }
       else{
       JOptionPane.showMessageDialog(null, "Say:(Good Morning | Hello) (Nice | Fab)");
       mich.startRecording();
       while(true){
           String speakAction=JOptionPane.showInputDialog("Start speaking. Press Ctrl-C to quit \n");
           Result result = recog.recognize();
           if(result!=null){
               String resultText = result.getBestFinalResultNoFiller();
               JOptionPane.showMessageDialog(null, "You said "+resultText+ "\n");
           }else{
               JOptionPane.showMessageDialog(null, "Inaudible statement");
           }
           if(speakAction.equalsIgnoreCase("c")){
               mich.stopRecording();
               JOptionPane.showMessageDialog(null, "System exitted");
           }
       }
       }
        
    }
}
