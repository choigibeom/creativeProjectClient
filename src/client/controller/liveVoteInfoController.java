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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class liveVoteInfoController implements Initializable {
	@FXML private ImageView candidateAndElectionInfoBtn;
	@FXML private ImageView electionHistoryInfoBtn;
	@FXML private ScrollPane liveVoteInfo;

    public void initialize(URL location, ResourceBundle resoruces) {
    	changeLiveVoteInfo();
    	candidateAndElectionInfoBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
    		public void handle(MouseEvent event) {
    			changeCandidateAndElectionInfo();
    			};
    	});

    	electionHistoryInfoBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
    		public void handle(MouseEvent event) {
    			changeElectionHistoryInfo();
     	     	};
    	});
    }
    
    public void changeCandidateAndElectionInfo()
    {
    	try
    	{
    	Parent main = FXMLLoader.load(getClass().getResource("../fxml/electionInfo.fxml"));
    	Scene scene = new Scene(main,512,540);
        	Thread thread = new Thread() {
        		public void run() {
    	    		Stage primaryStage = (Stage) candidateAndElectionInfoBtn.getScene().getWindow();
        			Platform.runLater(()->{primaryStage.setScene(scene);});
        			Platform.runLater(()->{primaryStage.setTitle("후보자 및 선거 정보");});
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) { System.out.println("error");}
    }
    

    
    public void changeElectionHistoryInfo()
    {
    	try
    	{
    	Parent main = FXMLLoader.load(getClass().getResource("../fxml/electionHistoryInfo.fxml"));
    	Scene scene = new Scene(main,512,540);
        	Thread thread = new Thread() {
        		public void run() {
    	    		Stage primaryStage = (Stage) electionHistoryInfoBtn.getScene().getWindow();
        			Platform.runLater(()->{primaryStage.setScene(scene);});
        			Platform.runLater(()->{primaryStage.setTitle("역대 당선 추이");});
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) { System.out.println("error");}
    }
    
    public void changeLiveVoteInfo()
    {
    	try 
    	{
    		Parent chartView = FXMLLoader.load(getClass().getResource("../fxml/liveVoteInfoAdd.fxml"));
    		liveVoteInfo.setContent(chartView);
    	}
    	catch(Exception e) { System.out.println("error");}
    }
}