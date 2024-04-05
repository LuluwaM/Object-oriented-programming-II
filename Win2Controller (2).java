
package projecttechapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class Win2Controller implements Initializable {

    @FXML
    private ImageView AiEvents;

    @FXML
    private Button AiReg;

    @FXML
    private ImageView LeapEvents;

    @FXML
    private Button LeapReg;

    @FXML
    private ImageView atHackEvents;

    @FXML
    private Button atHackReg;

    @FXML
    private Button back;

    @FXML
    private MenuItem closeMenu;
    @FXML
    private MenuItem aboutt;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    } 
    
    @FXML
     void Ai_reg(ActionEvent event) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("win3.fxml"));
       Stage stage = (Stage) AiReg.getScene().getWindow();
       Scene scene=new Scene(root);
       stage.setTitle("Tech Application ");          
       stage.setScene(scene);
       stage.show();

    }

    @FXML
    void atHack_reg(ActionEvent event) throws IOException{
       Parent root = FXMLLoader.load(getClass().getResource("win3.fxml"));
       Stage stage = (Stage) atHackReg.getScene().getWindow();
       Scene scene=new Scene(root);
       stage.setTitle("Tech Application ");     
       stage.setScene(scene);
       stage.show();
    }
    
    @FXML
    void leap_reg(ActionEvent event) throws IOException{
       Parent root = FXMLLoader.load(getClass().getResource("win3.fxml"));     
       Stage stage = (Stage) LeapReg.getScene().getWindow();
       Scene scene=new Scene(root);
       stage.setTitle("Tech Application ");                
       stage.setScene(scene);
       stage.show();
    }
    @FXML
    void backReg(ActionEvent event) throws IOException{
       Parent root = FXMLLoader.load(getClass().getResource("win1.fxml"));    
       Stage stage = (Stage) back.getScene().getWindow();
       Scene scene=new Scene(root);
       stage.setTitle("Tech Application ");            
       stage.setScene(scene);
       stage.show();
    }

    @FXML
    void aboutInfor(ActionEvent event) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("about.fxml"));
       Stage stage = new Stage();
       Scene scene=new Scene(root);
       stage.setTitle("Tech Application");
       stage.setScene(scene);
       stage.show();
    }
    @FXML
    void close(ActionEvent event) {
        System.exit(0);
    }
   
        
}
