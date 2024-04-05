package projecttechapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Win4Controller implements Initializable {
    @FXML
    private Label dataInformation;
    @FXML
    private Label information;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File file=new File("receipt.txt");
        String text="";
        
        try{
         Scanner scan =new Scanner(file);  
         while(scan.hasNext()){
             text+=scan.nextLine()+"\n";   
         }
         information.setText(text);
        }catch(FileNotFoundException e){
            System.out.println("Cannot load file");   
        }
    }      
}  
    

