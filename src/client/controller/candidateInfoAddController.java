package client.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class candidateInfoAddController implements Initializable {
	@FXML private ImageView candidateListBtn;
	@FXML private TextField name; // 이름
	@FXML private TextField number;  // 기호
	@FXML private TextField partyName; // 정당명
	@FXML private TextField birth; // 생년월일
	@FXML private ImageView candidateImage; // 후보 사진
	@FXML private ImageView candidatePartyImage; // 후보 정당 사진
	@FXML private TextArea career; // 경력
	@FXML private TextArea pledge; // 공약

    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
        candidateListBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
            	changePreElectionCandidateList();
      	  };
     });
    }
    
    public void changePreElectionCandidateList()
    {
    	try
    	{
    	Parent main = FXMLLoader.load(getClass().getResource("../fxml/candidateListAdd.fxml"));
    	AnchorPane root = (AnchorPane)candidateListBtn.getScene().getRoot();
    	ScrollPane sp = (ScrollPane)root.getChildren().get(6);
    	sp.setContent(main);
    	}
    	catch(Exception e) { System.out.println("error");}
    }
    
    public void changePreElectionCandidateList2()
    {
    	try
    	{
    	Parent main = FXMLLoader.load(getClass().getResource("../fxml/candidateList2Add.fxml"));
    	AnchorPane root = (AnchorPane)candidateListBtn.getScene().getRoot();
    	ScrollPane sp = (ScrollPane)root.getChildren().get(6);
    	sp.setContent(main);
    	}
    	catch(Exception e) { System.out.println("error");}
    }
}
