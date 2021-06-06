package Project.controller;

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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class candidateListAddController implements Initializable {
	@FXML private Text election1Title; // ����1 �̸�
	@FXML private Text election1VoteDay; // ����1 ������
	@FXML private ImageView election1Mark; // ����1 ���ű��� ��ũ
	@FXML private ImageView candidate1; // �ĺ�1 �̹���
	@FXML private ImageView candidate2; // �ĺ�2 �̹���
	@FXML private ImageView candidate3; // �ĺ�3 �̹���
	@FXML private ImageView candidate4; // �ĺ�4 �̹���
	@FXML private ImageView candidate5; // �ĺ�5 �̹���
	@FXML private ImageView candidate6; // �ĺ�6 �̹���
	@FXML private ImageView candidate7; // �ĺ�7 �̹���
	@FXML private ImageView candidate8; // �ĺ�8 �̹���
	@FXML private ImageView candidate9; // �ĺ�9 �̹���
	@FXML private ImageView candidate10; // �ĺ�10 �̹���
	@FXML private ImageView candidate11; // �ĺ�11 �̹���
	@FXML private ImageView candidate12; // �ĺ�12 �̹���
	@FXML private ImageView candidate13; // �ĺ�13 �̹���
	@FXML private ImageView candidate14; // �ĺ�14 �̹���
	@FXML private ImageView candidate15; // �ĺ�15 �̹���
	@FXML private Text candidate1Name; // �ĺ�1 �̸�
	@FXML private Text candidate2Name; // �ĺ�2 �̸�
	@FXML private Text candidate3Name; // �ĺ�3 �̸�
	@FXML private Text candidate4Name; // �ĺ�4 �̸�
	@FXML private Text candidate5Name; // �ĺ�5 �̸�
	@FXML private Text candidate6Name; // �ĺ�6 �̸�
	@FXML private Text candidate7Name; // �ĺ�7 �̸�
	@FXML private Text candidate8Name; // �ĺ�8 �̸�
	@FXML private Text candidate9Name; // �ĺ�9 �̸�
	@FXML private Text candidate10Name; // �ĺ�10 �̸�
	@FXML private Text candidate11Name; // �ĺ�11 �̸�
	@FXML private Text candidate12Name; // �ĺ�12 �̸�
	@FXML private Text candidate13Name; // �ĺ�13 �̸�
	@FXML private Text candidate14Name; // �ĺ�14 �̸�
	@FXML private Text candidate15Name; // �ĺ�15 �̸�

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
			Socket clSocket = new Socket("localhost", 9594);
			PrintWriter pw = new PrintWriter(clSocket.getOutputStream(), true);
			//BufferedReader br = new BufferedReader(new InputStreamReader(clSocket.getInputStream()));

			pw.write("3");
			pw.flush();
			pw.close();
			clSocket.close();

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
