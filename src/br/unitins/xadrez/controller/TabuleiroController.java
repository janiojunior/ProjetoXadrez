package br.unitins.xadrez.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DataFormat;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class TabuleiroController implements Initializable {
    @FXML
    private GridPane gridPane;

    @FXML
    private Button bTorreBrancaEsquerda;

    @FXML
    private Button bTorreBrancaDireita;
    
    @FXML
    private HBox hbox00;
    
    @FXML
    private HBox hbox10;
    
    private final DataFormat buttonFormat = new DataFormat("com.example.myapp.formats.button");
    
    private Node nodeReference;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		bTorreBrancaDireita.setText("Torre Branca Direita");
		bTorreBrancaEsquerda.setText("Torre Branca Esquerda");
		
		addDropHandling(hbox00);
		addDropHandling(hbox10);
		
		addEventHandler(bTorreBrancaDireita);
		addEventHandler(bTorreBrancaEsquerda);
		
//		for (int i = 0; i < 64; i++) {
//			HBox x = new HBox();
//			x.setAlignment(Pos.CENTER);
//			x.setStyle("-fx-background-color: black");
//			x.getChildren().add(e)
//			
//			addDropHandling(x);
//			gridPane.getChildren().add(x);
//			
//		}
		
		
		
		
		
		
	}
	
	private void addEventHandler(Node node) {
		node.setOnDragDetected(e -> {
            Dragboard db = node.startDragAndDrop(TransferMode.MOVE);
            db.setDragView(node.snapshot(null, null));
            ClipboardContent cc = new ClipboardContent();
            cc.put(buttonFormat, "button");
            db.setContent(cc);
            nodeReference = node ;
        });
        node.setOnDragDone(e -> nodeReference = null);	
	}
	
	private void addDropHandling(Pane pane) {
        pane.setOnDragOver(e -> {
            Dragboard db = e.getDragboard();
            if (db.hasContent(buttonFormat) 
                    && nodeReference != null 
                    && nodeReference.getParent() != pane) {
                e.acceptTransferModes(TransferMode.MOVE);
            }
        });

        pane.setOnDragDropped(e -> {
            Dragboard db = e.getDragboard();
            if (db.hasContent(buttonFormat)) {
            	
//            	if (peca.move(1,0)) {
            	
	            	// remove o componente do antigo hbox
	                ((Pane)nodeReference.getParent()).getChildren().remove(nodeReference);
	                // limpa (se tiver) o componente do novo hbox
	                pane.getChildren().clear();
	                // adiciona o componente no novo hbox
	                pane.getChildren().add(nodeReference);
	                // finaliza a acao do drop
	                e.setDropCompleted(true);
//            	}
            }           
        });
	}
	
//	@FXML
//    void handleActionBTorreBrancaEsquerda(ActionEvent event) {
//		Alert alert = new Alert(AlertType.INFORMATION);
//		alert.setTitle("Informação");
//		alert.setHeaderText(null);
//		alert.setContentText("Olá Mundo!!!");
//		alert.showAndWait();
//    }

}
