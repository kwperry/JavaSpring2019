package application;







import java.util.List;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("Harris Benedict Calculator");
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setVgap(10);
			grid.setHgap(10);
			grid.setPadding(new Insets(25,25,25,25));

			Text scenetitle = new Text("Welcome");	
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grid.add(scenetitle, 0,0,2,1);

			Label lblHeight = new Label("Height: ");
			grid.add(lblHeight, 0, 1);


			TextField txtHeight = new TextField();
			txtHeight.setText("Enter your Height(in)");
			grid.add(txtHeight, 1, 1); 

			Label lblWeight = new Label("Weight: ");
			grid.add(lblWeight, 0, 2);


			TextField txtWeight = new TextField();
			txtWeight.setText("Enter Your weight(lbs)");
			grid.add(txtWeight, 1, 2); 


			Label lblAge = new Label("Age: ");
			grid.add(lblAge, 0, 3);


			TextField txtAge = new TextField();
			txtAge.setText("Enter your age in yrs");
			grid.add(txtAge, 1, 3); 


			RadioButton rbM = new RadioButton("Male");
			RadioButton rbF = new RadioButton("Female");

			final ToggleGroup Sex = new ToggleGroup();
			rbM.setToggleGroup(Sex);
			rbF.setToggleGroup(Sex);

			rbM.setSelected(true);
			grid.add(rbM, 0, 4);
			grid.add(rbF, 1, 4);


			ChoiceBox activitylvl =
					new ChoiceBox(FXCollections.observableArrayList("Active", "Highly Active" , 
							"Sedentary", "Somewhat Active"));

			activitylvl.getSelectionModel().selectFirst();
			grid.add(activitylvl, 0, 5);


			Button calcCandy = new Button("Calculate");
			Label lblOutput = new Label("Number of candy bars you can eat");


			grid.add(calcCandy, 0, 6);
			grid.add(lblOutput, 0, 7);

			calcCandy.setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent e)
				{
					try {
						float height = Float.valueOf(txtHeight.getText());
						float weight = Float.valueOf(txtWeight.getText());
						float age = Float.valueOf(txtAge.getText());
						float multiplier = HarrisBenedict.getMultiplier(activitylvl.getValue().toString());
						float calorieCount = 0;
						if(rbM.isSelected())
						{
							calorieCount = HarrisBenedict.calcBMGMale(weight, (int) age, height);
						} else if (rbF.isSelected())
						{
							calorieCount = HarrisBenedict.calcBMGFemale(weight, (int)age, height);
						}
						
						float numCandyBars = (int)((calorieCount * multiplier)/HarrisBenedict.CandyBar); 
						lblOutput.setText("The number of candybars you can eat is: " + numCandyBars);
					}catch(Exception exc)
					{
						lblOutput.setText("A required field was not filled in, or an invalid character was entered");
					}

				}
			});

			
			Scene scene = new Scene(grid,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
