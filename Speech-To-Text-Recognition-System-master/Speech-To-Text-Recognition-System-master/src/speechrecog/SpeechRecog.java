/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speechrecog;
import javax.speech.*;
import javax.speech.recognition.*;
import java.io.FileReader;
import java.util.Locale;
import javax.swing.JOptionPane;


/**
 *
 * @author int3ll3ct
 */
public class SpeechRecog {
    //Speech recognizer declaration
    static Recognizer rec;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error in main method: "+ex.getMessage());
        }
        
    }
    public void resultAccepted(ResultEvent e){
        Result r = (Result)e.getSource();
        ResultToken tokens[] = r.getBestTokens();
        for(int i=0;i<tokens.length;i++){
            System.out.print(tokens[i].getText()+" "); 
            System.out.println("");
        }
        //deallocating the recognizer and exiting
        try{
        rec.deallocate();
        System.exit(0);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Deallocation/Exiting error: "+ex.getMessage());
        }
        
    }
    
}
