package Project.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class candidateInfoAddController implements Initializable {
	@FXML private ImageView candidateListBtn;
	@FXML private TextField name; // �̸�
	@FXML private TextField number;  // ��ȣ
	@FXML private TextField partyName; // �����
	@FXML private TextField birth; // �������
	@FXML private ImageView candidateImage; // �ĺ� ����
	@FXML private ImageView candidatePartyImage; // �ĺ� ���� ����
	@FXML private TextArea career; // ���
	@FXML private TextArea pledge; // ����

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
