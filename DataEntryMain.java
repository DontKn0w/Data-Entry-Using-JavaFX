package application;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class DataEntryMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/UI.fxml"));
			Scene scene = new Scene(root,1280,700);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.getIcons().add(new Image("/icon/DataEntry.png"));
			primaryStage.setTitle("VIRTAUCOM");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		//creates a file for saving days count
		try {
			File file = new File("C:\\Database\\Resource\\xyxC.txt");//C is count
			File file2 = new File("C:\\Database\\Resource\\mnbD.txt");//D is Day
				if (!file.exists() && !file2.exists()) {
						file.createNewFile();
						file2.createNewFile();
						PrintWriter pw = new PrintWriter(file);
						PrintWriter pw2 = new PrintWriter(file2);
						pw.println(0);
						pw2.println(0);
						pw.close(); pw2.close();
				}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		launch(args);
	}
}
