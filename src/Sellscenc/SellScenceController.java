package Sellscenc;


import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

public class SellScenceController {
	



	    @FXML
	    private ImageView productImage1;

	    @FXML
	    private Label productName1;

	    @FXML
	    private Label productPrice1;
	    
	    @FXML
	    private ImageView productImage2;

	    @FXML
	    private Label productName2;

	    @FXML
	    private Label productPrice2;

	    // Add more @FXML declarations as needed for additional products

	    public void initialize() {
	        // Set product details for each item
	        productImage1.setImage(new Image("/Sellscenc/Untitled.png"));
	        productName1.setText("Product 1");
	        productPrice1.setText("100 บาท");

	        productImage2.setImage(new Image("/Sellscenc/Untitled (1).png"));
	        productName2.setText("Product 2");
	        productPrice2.setText("200 บาท");

	        // Set details for more products
	    }
	}

