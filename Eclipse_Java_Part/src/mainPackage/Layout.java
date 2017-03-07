package mainPackage;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Layout extends BorderPane
{
	
	
	public Layout()
	{
		
		
		// set a gray-ish background color
		this.setStyle("-fx-background-color: #E8E8E8");
		
		this.setTop(topLayout());
	}
	
	private HBox topLayout()
	{
		
		HBox layout = new HBox();
		
		// search text field
		TextField searchField = new TextField();
        searchField.setAlignment(Pos.TOP_CENTER);
        searchField.setPromptText("Search");
        searchField.setPrefSize(200, 10); // set the size of the field
        HBox.setMargin(searchField, new Insets(20, 0, 0, 450-100));
        
        // action
        searchField.setOnAction(e -> enterClicked(searchField));
        
        // adding the object
        layout.getChildren().add(searchField);
        
        return layout;
	}
	
	// when the enter clicked in the search movie box
	private void enterClicked(TextField searchField)
	{
		System.out.println(SQLLibrary.getInstance().queryDataBase("SELECT * FROM Movies WHERE MovieName = " + searchField.getText()));
	}
	
	/*private VBox centerLayout()
	{
		
	}
	
	private HBox bottomLayout()
	{
		
	}*/
}
