package br.unitins.xadrez.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = 
		FXMLLoader.load(getClass().getResource("/br/unitins/xadrez/view/TabuleiroView.fxml"));
		Scene scene = new Scene(root, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		// executa a aplicacao javafx
		launch(args);
	}

}
