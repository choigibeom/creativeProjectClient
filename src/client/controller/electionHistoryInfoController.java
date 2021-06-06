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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class electionHistoryInfoController implements Initializable {
	@FXML private ImageView liveVoteInfoBtn;
	@FXML private ImageView candidateAndElectionInfoBtn;
	@FXML private ImageView presidentElectionHistoryInfoBtn;
	@FXML private ImageView nationalAssemblyElectionHistoryInfoBtn;
	@FXML private ImageView localElectionHistoryInfoBtn;
    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
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
         
          presidentElectionHistoryInfoBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
      	     public void handle(MouseEvent event) {
      	    	 changePresidentElectionHistoryInfo();
      	     };
        });
          nationalAssemblyElectionHistoryInfoBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
       	     public void handle(MouseEvent event) {
       	    	 changeNationalAssemblyElectionHistoryInfo();
       	     };
         });
          localElectionHistoryInfoBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
        	     public void handle(MouseEvent event) {
        	    	 changeLocalElectionHistoryInfo();
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
    
    public void changePresidentElectionHistoryInfo()
    {
    	try
    	{
    	Parent main = FXMLLoader.load(getClass().getResource("../fxml/presidentElectionHistoryInfo.fxml"));
    	Scene scene = new Scene(main,512,540);
        	Thread thread = new Thread() {
        		public void run() {
    	    		Stage primaryStage = (Stage) presidentElectionHistoryInfoBtn.getScene().getWindow();
        			Platform.runLater(()->{primaryStage.setScene(scene);});
        			Platform.runLater(()->{primaryStage.setTitle("역대 당선 추이");});
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) { System.out.println("error");}
    }
    
    public void changeNationalAssemblyElectionHistoryInfo()
    {
    	try
    	{
    	Parent main = FXMLLoader.load(getClass().getResource("../fxml/nationalAssemblyElectionHistoryInfo.fxml"));
    	Scene scene = new Scene(main,512,540);
        	Thread thread = new Thread() {
        		public void run() {
    	    		Stage primaryStage = (Stage) nationalAssemblyElectionHistoryInfoBtn.getScene().getWindow();
        			Platform.runLater(()->{primaryStage.setScene(scene);});
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) { System.out.println("error");}
    }
    
    public void changeLocalElectionHistoryInfo()
    {
    	try
    	{
    	Parent main = FXMLLoader.load(getClass().getResource("../fxml/localElectionHistoryInfo.fxml"));
    	Scene scene = new Scene(main,512,540);
        	Thread thread = new Thread() {
        		public void run() {
    	    		Stage primaryStage = (Stage) localElectionHistoryInfoBtn.getScene().getWindow();
        			Platform.runLater(()->{primaryStage.setScene(scene);});
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) { System.out.println("error");}
    }
}