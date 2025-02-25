package application;

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import scne2.AcconotscencController;

public class SampleController  {
	
	@FXML
	private Button cancelButton ;
	
	@FXML
	private Button loginButton ;
	
	@FXML
	private PasswordField passwordField ;
	
	@FXML
	private TextField userinputTextfiled;
	
	
	@FXML
	private Label ErorLabel;
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	@SuppressWarnings("unused")
	public void cancelAction(ActionEvent e) {
		Stage stage = (Stage) cancelButton.getScene().getWindow();
	    stage.close();
	}
	
	
	
	public void loginAction(ActionEvent e) throws IOException {
		String username = userinputTextfiled.getText();
	    String password = passwordField.getText();
		 if (username.isBlank() && password.isBlank() ) {
			 ErorLabel.setVisible(true);
			 ErorLabel.setText("Username or password fields cannot be empty."); // เพิ่มข้อความ error ที่ชัดเจน
		        return; // ออกจากเมธอดเพื่อไม่ให้ทำงานต่อ
		    }
		    if (username.isEmpty() || password.isEmpty()) { // ตรวจสอบว่าฟิลด์ว่างเปล่า
		    	ErorLabel.setVisible(true);
		    	ErorLabel.setText("Please enter username and password.");
		        return;
		    }
		    
		    
		    
		    
		    FXMLLoader loader = new FXMLLoader(getClass().getResource("/scne2/Accountscenc.fxml"));
		    
		    root = loader.load();
		    AcconotscencController conee = loader.getController();
		    conee.showpassandUsername(username, password);
		    
		    
		    stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		    scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
		   
	}
	
	
}
