package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SecondWindowController implements Initializable {
	
	@FXML
	private TextArea secondWindowTextArea;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	

	public void populateData(PropertySeeker propertySeeker) {
	
		secondWindowTextArea.setText("Keywords: " + propertySeeker.getKeywords() + "\n" +
		propertySeeker.getOpenHouse() +"\nPrice: "+ propertySeeker.getPrice() +"\nHow many rooms? "+ propertySeeker.getRooms() +"\nBuilding type: "+ propertySeeker.getBuildingType() + "\nDate Starting: " + propertySeeker.getdateStarting());
		
	}

}
