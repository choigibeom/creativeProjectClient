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
import javafx.scene.control.SplitMenuButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class candidateList2AddController implements Initializable {
	@FXML private Text election2Title; // 선거2 이름
	@FXML private Text election2VoteDay; // 선거2 선거일
	@FXML private ImageView election2Mark; // 선거2 선거구분 마크
	@FXML private SplitMenuButton constituencyList; // 선거구 목록
	@FXML private ImageView candidate1; // 후보1 이미지
	@FXML private ImageView candidate2; // 후보2 이미지
	@FXML private ImageView candidate3; // 후보3 이미지
	@FXML private ImageView candidate4; // 후보4 이미지
	@FXML private ImageView candidate5; // 후보5 이미지
	@FXML private ImageView candidate6; // 후보6 이미지
	@FXML private ImageView candidate7; // 후보7 이미지
	@FXML private ImageView candidate8; // 후보8 이미지
	@FXML private ImageView candidate9; // 후보9 이미지
	@FXML private ImageView candidate10; // 후보10 이미지
	@FXML private ImageView candidate11; // 후보11 이미지
	@FXML private ImageView candidate12; // 후보12 이미지
	@FXML private ImageView candidate13; // 후보13 이미지
	@FXML private ImageView candidate14; // 후보14 이미지
	@FXML private ImageView candidate15; // 후보15 이미지
	@FXML private Text candidate1Name; // 후보1 이름
	@FXML private Text candidate2Name; // 후보2 이름
	@FXML private Text candidate3Name; // 후보3 이름
	@FXML private Text candidate4Name; // 후보4 이름
	@FXML private Text candidate5Name; // 후보5 이름
	@FXML private Text candidate6Name; // 후보6 이름
	@FXML private Text candidate7Name; // 후보7 이름
	@FXML private Text candidate8Name; // 후보8 이름
	@FXML private Text candidate9Name; // 후보9 이름
	@FXML private Text candidate10Name; // 후보10 이름
	@FXML private Text candidate11Name; // 후보11 이름
	@FXML private Text candidate12Name; // 후보12 이름
	@FXML private Text candidate13Name; // 후보13 이름
	@FXML private Text candidate14Name; // 후보14 이름
	@FXML private Text candidate15Name; // 후보15 이름

    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
          candidate1.setOnMouseClicked(new EventHandler<MouseEvent>() {
      	     public void handle(MouseEvent event) {
      	    	 changeCandidateInfo();
      	     };
        });
          
          candidate2.setOnMouseClicked(new EventHandler<MouseEvent>() {
      	     public void handle(MouseEvent event) {
      	    	 changeCandidateInfo();
      	     };
        });

          candidate3.setOnMouseClicked(new EventHandler<MouseEvent>() {
      	     public void handle(MouseEvent event) {
      	    	 changeCandidateInfo();
      	     };
        });
          

          candidate4.setOnMouseClicked(new EventHandler<MouseEvent>() {
      	     public void handle(MouseEvent event) {
      	    	 changeCandidateInfo();
      	     };
        });
          

          candidate5.setOnMouseClicked(new EventHandler<MouseEvent>() {
      	     public void handle(MouseEvent event) {
      	    	 changeCandidateInfo();
      	     };
        });
    }
    public void changeCandidateInfo()
    {
    	try
    	{
    	Parent main = FXMLLoader.load(getClass().getResource("../fxml/candidateInfo.fxml"));
    	Scene scene = new Scene(main,512,540);
        	Thread thread = new Thread() {
        		public void run() {
    	    		Stage primaryStage = (Stage) candidate1.getScene().getWindow();
        			Platform.runLater(()->{primaryStage.setScene(scene);});
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) { System.out.println("error");}
    }
}