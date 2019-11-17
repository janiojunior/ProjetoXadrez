package br.unitins.xadrez.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = 
		FXMLLoader.load(getClass().getResource("/br/unitins/xadrez/view/TabuleiroView.fxml"));
		primaryStage.setTitle("XADREZ");
		Scene scene = new Scene(root, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/br/unitins/xadrez/images/CavaloPretoEsquerda.png")));
	}
	
	public static void main(String[] args) {
		// executa a aplicacao javafx
		launch(args);
	}

}
