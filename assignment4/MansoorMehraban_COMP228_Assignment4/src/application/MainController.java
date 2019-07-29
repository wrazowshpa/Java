package application;

import java.io.IOException;
import application.Month;
import java.net.URL;
import java.util.ResourceBundle;
import application.PropertySeeker;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class MainController implements Initializable {
	
	PropertySeeker propertySeeker = new PropertySeeker();
	
	   @FXML
	   private Slider numberOneSlider;
	   
	   @FXML
	   private Label lblSliderNumOne = new Label();
	   
	   @FXML
	   private TextArea textAreaDisplay;
	   
	   @FXML
		private Label label;
		
		@FXML
		private ToggleGroup roomsToggleGroup;
		
		@FXML
		private TextField keywordsTextField;
		
		@FXML
		ListView<String> daysList;

		private final ObservableList<Month> months = FXCollections.observableArrayList();

		@FXML
		private ListView<Month> monthsListView;
		
		@FXML
		private ComboBox comboBox;
		
		@FXML
		private CheckBox checkBox;
		
	  
	   @FXML
	   public void handleButtonAction() {
		   
		   propertySeeker.setBuildingType(comboBox.getSelectionModel().getSelectedItem());
		   propertySeeker.setDateStarting(monthsListView.getSelectionModel().getSelectedItem());
		   propertySeeker.setKeywords(keywordsTextField.getText());
		   propertySeeker.setOpenHouse(checkBox.getText());
		   propertySeeker.setPrice((int) numberOneSlider.getValue());
		   propertySeeker.setRooms(((RadioButton)roomsToggleGroup.getSelectedToggle()).getText());

			   textAreaDisplay.setText(
					   String.format(
							   "Price is %d \nNumber of Rooms %s: \nKeywords: %s \nMonth Starting: %s \nBuilding Type: %s \nOpen House: ",
							   (int) numberOneSlider.getValue(), ((RadioButton)roomsToggleGroup.getSelectedToggle()).getText(), 
							   keywordsTextField.getText(), monthsListView.getSelectionModel().getSelectedItem(), 
							   comboBox.getSelectionModel().getSelectedItem(), checkBox.getText()
							   )
					   );
			   
			   
			   
			   try {
					Stage stage = new Stage();
					String fxmlFileName = "SecondWindow.fxml";
					FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
					Parent root = loader.load();
					Scene scene = new Scene(root);
					stage.setScene(scene);
					SecondWindowController controller = loader.<SecondWindowController>getController();
					controller.populateData(propertySeeker);
					stage.show();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   
			   
		   }
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
    	lblSliderNumOne.setText("Price: " + (int) numberOneSlider.getValue());

		numberOneSlider.valueProperty().addListener(
	         new ChangeListener<Number>() {
	            @Override
	            public void changed(ObservableValue<? extends Number> ov, 
	               Number oldValue, Number newValue) {
	            	lblSliderNumOne.setText("Price: " + newValue.intValue());
	            }
	         }
	      );
				
		months.add(new Month(1, "January"));
		months.add(new Month(2, "February"));
		months.add(new Month(3, "March"));
		months.add(new Month(4, "April"));
		months.add(new Month(5, "May"));
		months.add(new Month(6, "June"));
		months.add(new Month(7, "July"));
		months.add(new Month(8, "August"));
		months.add(new Month(9, "September"));
		months.add(new Month(10, "October"));
		months.add(new Month(11, "November"));
		months.add(new Month(12, "December"));
		monthsListView.setItems(months);
		
		comboBox.getItems().removeAll(comboBox.getItems());
		comboBox.getItems().addAll("House","Townhouse","Apartment","Duplex","Triplex");

	}

}
