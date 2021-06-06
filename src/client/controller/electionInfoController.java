package client.controller;

import java.io.IOException;
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

public class electionInfoController implements Initializable {
	@FXML private ImageView liveVoteInfoBtn;
	@FXML private ImageView electionHistoryInfoBtn;
	@FXML private ScrollPane electionInfo;
    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
    	changeElectionInfo();
    	liveVoteInfoBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
    	    	 changeLiveVoteInfo();
      	  };
     });
          electionHistoryInfoBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
      	     public void handle(MouseEvent event) {
      	    	 changeElectionHistoryInfo();
      	     };
        });
    }
    
    
    public void changeLiveVoteInfo()
    {
    	try
    	{

    	Parent main = FXMLLoader.load(getClass().getResource("../fxml/liveVoteInfo.fxml"));
    	Scene scene = new Scene(main,512,540);
        	Thread thread = new Thread() {
        		public void run() {
    	    		Stage primaryStage = (Stage) liveVoteInfoBtn.getScene().getWindow();
        			Platform.runLater(()->{primaryStage.setScene(scene);});
        			Platform.runLater(()->{primaryStage.setTitle("실시간 투개표 현황");});
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
    
    public void changeElectionInfo()
    {
    	try 
    	{
    		Parent root = FXMLLoader.load(getClass().getResource("../fxml/electionInfoAdd.fxml"));
    		electionInfo.setContent(root);
    	}
    	catch(Exception e) { System.out.println("error");}
    }
}
