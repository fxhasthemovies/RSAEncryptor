import javafx.scene.Scene;
import javafx.scene.layout.*;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class FxApp extends Application {
	private Stage primaryStage;
	private BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage=primaryStage;
		this.primaryStage.setTitle("Public Key Encrypter");
		showMainView();
	}
	
	private void showMainView() throws IOException{
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation(FxApp.class.getResource("FxView.fxml"));
		mainLayout=loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}