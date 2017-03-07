package mainPackage;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
        Layout layout = new Layout();

        // status bar
        /*statusBar = new Label("");
        statusBar.setAlignment(Pos.BOTTOM_CENTER);
        layout.setMargin(statusBar, new Insets(0, 0, 10, 10)); // setting padding
        layout.setBottom(statusBar);

        // the top layout taken from the TopLayout class
        TopLayout topLayout = new TopLayout();
        layout.setTop(topLayout.getLayout());

        // the center layout taken from the CenterLayout class
        CenterLayout centerLayout = new CenterLayout();
        layout.setCenter(centerLayout.getLayout());*/
        
		Scene scene = new Scene(layout, 900, 600);
        primaryStage.setTitle("Movie Information v2.0");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
	}
}
