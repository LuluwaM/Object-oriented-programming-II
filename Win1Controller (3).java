package projecttechapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class Win1Controller implements Initializable {

    @FXML
    private Button ev;
    @FXML
    private Button hackathon;
    @FXML
    private MenuBar menu;
    @FXML
    private Label tech;
    @FXML
    private MenuItem aboutMenu;

    @FXML
    private MenuItem closeMenu;
    @FXML
    private MenuBar tools;
    @FXML
            
    void About(ActionEvent event) throws IOException {
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
    @FXML
    void showEvents(ActionEvent event) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("win2.fxml"));
       Stage stage = (Stage) ev.getScene().getWindow();
       Scene scene=new Scene(root);
       stage.setTitle("Tech Application");              
       stage.setScene(scene);
       stage.show();

    }

    @FXML
    private void showHackathon(ActionEvent event)throws IOException {
            if(event.getSource() ==hackathon){
                JOptionPane.showMessageDialog(null,"***Soon***");
            } 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}    
    

