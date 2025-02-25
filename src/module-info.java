module textFxml {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
    
    

    opens Sellscenc to javafx.graphics, javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
    opens scne2 to javafx.fxml,javafx.graphics;

}
