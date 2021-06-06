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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class localElectionHistoryInfoController implements Initializable {
	@FXML private ImageView liveVoteInfoBtn;
	@FXML private ImageView candidateAndElectionInfoBtn;
	@FXML private ScrollPane localChartView;
    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
    	changeLocalChartView();
          liveVoteInfoBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent event) {
      	    	 changeLiveVoteInfo();
        	  };
       });
          
          candidateAndElectionInfoBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
     	     public void handle(MouseEvent event) {
     	    	 changeCandidateAndElectionInfo();
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
    
    public void changeLocalChartView()
    {
    	try 
    	{
    		Parent chartView = FXMLLoader.load(getClass().getResource("../fxml/localChartView.fxml"));
    		localChartView.setContent(chartView);
    	}
    	catch(Exception e) { System.out.println("error");}
    }
}