package client.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class electionInfoAddController implements Initializable {
	@FXML private ImageView election1;
	@FXML private ImageView election2;
	@FXML private ImageView election3;
	@FXML private AnchorPane electionInfo;
	@FXML private Text election1VoteDay; // 첫번째 선거일
	@FXML private Text election2VoteDay; // 두번째 선거일
	@FXML private Text election3VoteDay; // 세번째 선거일
	@FXML private ImageView election1Mark; // 첫번째 선거구분 마크
	@FXML private ImageView election2Mark; // 두번째 선거구분 마크
	@FXML private ImageView election3Mark; // 세번째 선거구분 마크

    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
          election1.setOnMouseClicked(new EventHandler<MouseEvent>() {
      	     public void handle(MouseEvent event) {
      	    	 changeElection1();
      	     };
        });

          election2.setOnMouseClicked(new EventHandler<MouseEvent>() {
      	     public void handle(MouseEvent event) {
      	    	 changeElection2();
      	     };
        });

          election3.setOnMouseClicked(new EventHandler<MouseEvent>() {
      	     public void handle(MouseEvent event) {
      	    	 changeElection3();
      	     };
        });
    }

    
    public void changeElection1()
    {
    	try
    	{
    	Parent main = FXMLLoader.load(getClass().getResource("../fxml/candidateListAdd.fxml"));
    	electionInfo.getChildren().clear();
    	electionInfo.getChildren().add(main);
    	}
    	catch(Exception e) { System.out.println("error");}
    }
    
    public void changeElection2()
    {
    	try
    	{
    	Parent main = FXMLLoader.load(getClass().getResource("../fxml/candidateList2Add.fxml"));
    	electionInfo.getChildren().clear();
    	electionInfo.getChildren().add(main);
    	}
    	catch(Exception e) { System.out.println("error");}
    }
    
    public void changeElection3()
    {
    	try
    	{
    	Parent main = FXMLLoader.load(getClass().getResource("../fxml/candidateList3Add.fxml"));
    	electionInfo.getChildren().clear();
    	electionInfo.getChildren().add(main);
    	}
    	catch(Exception e) { System.out.println("error");}
    }
}
