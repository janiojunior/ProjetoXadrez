package br.unitins.xadrez.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
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
    private HBox hbox00;

    @FXML
    private ImageView torrePretaEsquerda;

    @FXML
    private HBox hbox10;

    @FXML
    private ImageView cavaloPretoEsquerda;

    @FXML
    private HBox hbox20;

    @FXML
    private ImageView bispoPretoDireita;

    @FXML
    private HBox hbox30;

    @FXML
    private ImageView rainhaPreta;

    @FXML
    private HBox hbox40;

    @FXML
    private ImageView reiPreto;

    @FXML
    private HBox hbox50;

    @FXML
    private ImageView bispoPretoEsquerda;

    @FXML
    private HBox hbox60;
    
    @FXML
    private ImageView cavaloPretoDireita;

    @FXML
    private HBox hbox70;

    @FXML
    private ImageView torrePretaDireita;

    @FXML
    private HBox hbox01;

    @FXML
    private ImageView peaoPreto01;

    @FXML
    private HBox hbox11;

    @FXML
    private ImageView peaoPreto11;

    @FXML
    private HBox hbox21;

    @FXML
    private ImageView peaoPreto12;

    @FXML
    private HBox hbox31;

    @FXML
    private ImageView peaoPreto13;

    @FXML
    private HBox hbox41;

    @FXML
    private ImageView peaoPreto14;

    @FXML
    private HBox hbox51;

    @FXML
    private ImageView peaoPreto15;

    @FXML
    private HBox hbox61;

    @FXML
    private ImageView peaoPreto16;

    @FXML
    private HBox hbox71;

    @FXML
    private ImageView peaoPreto17;

    @FXML
    private HBox hbox02;

    @FXML
    private HBox hbox12;

    @FXML
    private HBox hbox22;

    @FXML
    private HBox hbox32;

    @FXML
    private HBox hbox42;

    @FXML
    private HBox hbox52;

    @FXML
    private HBox hbox62;

    @FXML
    private HBox hbox72;

    @FXML
    private HBox hbox03;

    @FXML
    private HBox hbox13;

    @FXML
    private HBox hbox23;

    @FXML
    private HBox hbox33;

    @FXML
    private HBox hbox43;

    @FXML
    private HBox hbox53;

    @FXML
    private HBox hbox63;

    @FXML
    private HBox hbox73;

    @FXML
    private HBox hbox04;

    @FXML
    private HBox hbox14;

    @FXML
    private HBox hbox24;

    @FXML
    private HBox hbox34;

    @FXML
    private HBox hbox44;

    @FXML
    private HBox hbox54;

    @FXML
    private HBox hbox64;

    @FXML
    private HBox hbox74;

    @FXML
    private HBox hbox05;

    @FXML
    private HBox hbox15;

    @FXML
    private HBox hbox25;

    @FXML
    private HBox hbox35;

    @FXML
    private HBox hbox45;

    @FXML
    private HBox hbox55;

    @FXML
    private HBox hbox65;

    @FXML
    private HBox hbox75;

    @FXML
    private HBox hbox06;

    @FXML
    private ImageView peaoBranco06;

    @FXML
    private HBox hbox16;

    @FXML
    private ImageView peaoBranco16;

    @FXML
    private HBox hbox26;

    @FXML
    private ImageView peaoBranco26;

    @FXML
    private HBox hbox36;

    @FXML
    private ImageView peaoBranco36;

    @FXML
    private HBox hbox46;

    @FXML
    private ImageView peaoBranco46;

    @FXML
    private HBox hbox56;

    @FXML
    private ImageView peaoBranco56;

    @FXML
    private HBox hbox66;

    @FXML
    private ImageView peaoBranco66;

    @FXML
    private HBox hbox76;

    @FXML
    private ImageView peaoBranco76;

    @FXML
    private HBox hbox07;

    @FXML
    private ImageView torreBrancaEsquerda;

    @FXML
    private ImageView peaoBranco68;

    @FXML
    private HBox hbox17;

    @FXML
    private ImageView cavaloBrancoEsquerda;

    @FXML
    private HBox hbox27;

    @FXML
    private ImageView bispoBrancoEsquerdo;

    @FXML
    private HBox hbox37;

    @FXML
    private ImageView rainhaBranca;

    @FXML
    private HBox hbox47;

    @FXML
    private ImageView reiBranco;

    @FXML
    private HBox hbox57;

    @FXML
    private ImageView bispoBrancoDireito;

    @FXML
    private HBox hbox67;

    @FXML
    private ImageView cavaloBrancoDireito;

    @FXML
    private HBox hbox77;

    @FXML
    private ImageView torreBrancaDireita;

	private final DataFormat buttonFormat = new DataFormat("com.example.myapp.formats.button");

	private Node nodeReference;

	@Override
	public void initialize(URL location, ResourceBundle resources) {


		addDropHandling(hbox00);
		addDropHandling(hbox10);
		addDropHandling(hbox20);
		addDropHandling(hbox30);
		addDropHandling(hbox40);
		addDropHandling(hbox50);
		addDropHandling(hbox60);
		addDropHandling(hbox70);
		addDropHandling(hbox01);
		addDropHandling(hbox11);
		addDropHandling(hbox21);
		addDropHandling(hbox31);
		addDropHandling(hbox41);
		addDropHandling(hbox51);
		addDropHandling(hbox61);
		addDropHandling(hbox71);
		addDropHandling(hbox02);
		addDropHandling(hbox12);
		addDropHandling(hbox22);
		addDropHandling(hbox32);
		addDropHandling(hbox42);
		addDropHandling(hbox52);
		addDropHandling(hbox62);
		addDropHandling(hbox72);
		addDropHandling(hbox03);
		addDropHandling(hbox13);
		addDropHandling(hbox23);
		addDropHandling(hbox33);
		addDropHandling(hbox43);
		addDropHandling(hbox53);
		addDropHandling(hbox63);
		addDropHandling(hbox73);
		addDropHandling(hbox04);
		addDropHandling(hbox14);
		addDropHandling(hbox24);
		addDropHandling(hbox34);
		addDropHandling(hbox44);
		addDropHandling(hbox54);
		addDropHandling(hbox64);
		addDropHandling(hbox74);
		addDropHandling(hbox05);
		addDropHandling(hbox15);
		addDropHandling(hbox25);
		addDropHandling(hbox35);
		addDropHandling(hbox45);
		addDropHandling(hbox55);
		addDropHandling(hbox65);
		addDropHandling(hbox75);
		addDropHandling(hbox06);
		addDropHandling(hbox16);
		addDropHandling(hbox26);
		addDropHandling(hbox36);
		addDropHandling(hbox46);
		addDropHandling(hbox56);
		addDropHandling(hbox66);
		addDropHandling(hbox76);
		addDropHandling(hbox07);
		addDropHandling(hbox17);
		addDropHandling(hbox27);
		addDropHandling(hbox37);
		addDropHandling(hbox47);
		addDropHandling(hbox57);
		addDropHandling(hbox67);
		addDropHandling(hbox77);

		//Pecas Pretas
		addEventHandler(torrePretaEsquerda);
		addEventHandler(cavaloPretoEsquerda);
		addEventHandler(bispoPretoEsquerda);
		addEventHandler(rainhaPreta);
		addEventHandler(reiPreto);
		addEventHandler(bispoPretoDireita);
		addEventHandler(cavaloPretoDireita);
		addEventHandler(torrePretaDireita);
		addEventHandler(peaoPreto01);
		addEventHandler(peaoPreto11);
		addEventHandler(peaoPreto12);
		addEventHandler(peaoPreto13);
		addEventHandler(peaoPreto14);
		addEventHandler(peaoPreto15);
		addEventHandler(peaoPreto16);
		addEventHandler(peaoPreto17);
		//Pecas Brancas
		addEventHandler(torreBrancaEsquerda);
		addEventHandler(cavaloBrancoEsquerda);
		addEventHandler(bispoBrancoEsquerdo);
		addEventHandler(rainhaBranca);
		addEventHandler(reiBranco);
		addEventHandler(bispoBrancoDireito);
		addEventHandler(cavaloBrancoDireito);
		addEventHandler(torreBrancaDireita);
		addEventHandler(peaoBranco06);
		addEventHandler(peaoBranco16);
		addEventHandler(peaoBranco26);
		addEventHandler(peaoBranco36);
		addEventHandler(peaoBranco46);
		addEventHandler(peaoBranco56);
		addEventHandler(peaoBranco66);
		addEventHandler(peaoBranco76);



//		for (int i = 0; i < 64; i++) {
//			HBox x = new HBox();
//			x.setAlignment(Pos.CENTER);
//			x.setStyle("-fx-background-color: black");
//			x.getChildren().add(x);

//			addDropHandling(x);
//			gridPane.getChildren().add(x);

//		}

	}

	private void addEventHandler(Node node) {
		node.setOnDragDetected(e -> {
			Dragboard db = node.startDragAndDrop(TransferMode.MOVE);
			db.setDragView(node.snapshot(null, null));
			ClipboardContent cc = new ClipboardContent();
			cc.put(buttonFormat, "button");
			db.setContent(cc);
			nodeReference = node;
		});
		node.setOnDragDone(e -> nodeReference = null);
	}

	private void addDropHandling(Pane pane) {
		pane.setOnDragOver(e -> {
			Dragboard db = e.getDragboard();
			if (db.hasContent(buttonFormat) && nodeReference != null && nodeReference.getParent() != pane) {
				e.acceptTransferModes(TransferMode.MOVE);
			}
		});

		pane.setOnDragDropped(e -> {
			Dragboard db = e.getDragboard();
			if (db.hasContent(buttonFormat)) {

//            	if (peca.move(1,0)) {

				// remove o componente do antigo hbox
				((Pane) nodeReference.getParent()).getChildren().remove(nodeReference);
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
