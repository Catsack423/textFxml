package scne2;



import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AcconotscencController {
	
	@FXML
	private Button ArrowButton;
	
	@FXML
	private Text showusernameText;
	
	@FXML
	private Text showpassText;
	

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	
	public void showpassandUsername(String name,String passwordg) {
		showusernameText.setText("Username: "+name);
		showpassText.setText("Password:"+passwordg);
		}
	
	
	
	 public void ArrowButtonAction(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Sample.fxml"));
	    stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
	    scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
		
	}
}