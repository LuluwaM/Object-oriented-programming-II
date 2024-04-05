
package projecttechapp;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class Win3Controller implements Initializable {

    @FXML
    private Button Cancellation;
    @FXML
    private Button Confirmation;
    @FXML
    private Label Gender;
    @FXML
    private Label Ticket;
    @FXML
    private TextField YName;
    @FXML
    private DatePicker calender;
    @FXML
    private Label date;
    @FXML
    private TextField em;
    @FXML
    private Label email;
    @FXML
    private Label errorLbl;
    @FXML
    private ToggleGroup genderWM;
    @FXML
    private RadioButton man;
    @FXML
    private Label name;
    @FXML
    private Label personal_infor;
    @FXML
    private TextField ph;
    @FXML
    private Label phoneNum;
    @FXML
    private ComboBox<String> tick;
    @FXML
    private VBox v_box;
    @FXML
    private RadioButton women;
    
    String filename="receipt.txt";
    
    @FXML       
    void CancellationEvents(ActionEvent event) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("win3.fxml"));
       Stage stage = (Stage) Cancellation.getScene().getWindow();
       Scene scene=new Scene(root);
       stage.setTitle("Tech Application");            
       stage.setScene(scene);
       stage.close();
       
        if(event.getSource() ==Cancellation){
        JOptionPane.showMessageDialog(null,"***Thanks for your visit***");
        }
    }
      @FXML
      void ConfirmationEvents(ActionEvent event) throws FileNotFoundException,IOException {
        
        if(YName.getText().equals("")||em.getText().equals("")||ph.getText().equals("")||tick.getValue()==(null)||calender.getValue()==(null)){
            errorLbl.setText("Please fill in all information");
        }else  {
        FileWriter file = new FileWriter(filename);  //"receipt.txt"
        PrintWriter write= new PrintWriter(file);
    
        write.print("-------------------------------------------------------------------------\n");
        write.print("\n\t\t********INVOICE INFORMATION********\n");
        write.print("\n-------------------------------------------------------------------------\n");
        write.print("\n\t\t\tCOSTUMER INFORMATION\n");
        write.println("\t#Customer Name : "+YName.getText());
        write.println("\t#Customer phone number: "+ph.getText());
        write.println("\t#Email:"+em.getText());
        write.println("\t#Date:"+calender.getValue());
        write.print("\n-------------------------------------------------------------------------\n");
     
        write.print("\t#Tickite: $"+tick.getValue()); 
        write.print("\t#Price: Free");
        write.print("\n\t\t\tThank you for shopping\n");
        write.print("\n-------------------------------------------------------------------------\n\n\n\n");
        write.close();
        JOptionPane.showMessageDialog(null," Is conferm");

       Parent root = FXMLLoader.load(getClass().getResource("win4.fxml"));
       Stage stage=new Stage();       
       stage.setTitle("Tech Application"); 
       Scene scene = new Scene(root);

       stage.setScene(scene);
       stage.show();
       ((Node)(event.getSource())).getScene().getWindow().hide();
        }
              
    }

    @FXML
    void ticketNum(ActionEvent event) {
        
    }
    @FXML
    void getCalender(ActionEvent event) {

    }      
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        ObservableList<String>list=FXCollections.observableArrayList("1","2","3","4","5","6","7","8","9","10");
        tick.setItems(list);        
    }    
}
