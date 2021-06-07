package Project.controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Project.Persistance.ElectionDTO;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class electionInfoAddController implements Initializable {
	@FXML private ImageView election1;
	@FXML private ImageView election2;
	@FXML private ImageView election3;
	@FXML private AnchorPane electionInfo;
	@FXML private Text election1Title;
	@FXML private Text election2Title;
	@FXML private Text election3Title;
	@FXML private Text election1VoteDay; // 첫번째 선거일
	@FXML private Text election2VoteDay; // 두번째 선거일
	@FXML private Text election3VoteDay; // 세번째 선거일
	@FXML private ImageView election1Mark; // 첫번째 선거구분 마크
	@FXML private ImageView election2Mark; // 두번째 선거구분 마크
	@FXML private ImageView election3Mark; // 세번째 선거구분 마크

	private Socket socket;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;

    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
    	try{
			socket = new Socket("192.168.237.14", 9594);
			oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject("5");
			oos.flush();

			ois = new ObjectInputStream(socket.getInputStream());

			ArrayList<ElectionDTO> electiondto = (ArrayList<ElectionDTO>) ois.readObject();
			election1Title.setText(electiondto.get(23).getSgName());
			election1VoteDay.setText(electiondto.get(23).getSgVotedate().toString());
			election2Title.setText(electiondto.get(24).getSgName());
			election2VoteDay.setText(electiondto.get(24).getSgVotedate().toString());
			election3Title.setText(electiondto.get(25).getSgName());
			election3VoteDay.setText(electiondto.get(25).getSgVotedate().toString());
		}catch(Exception e) {
    		e.printStackTrace();
		}
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
	public void setElection1Titie(String title_in)
	{
		election1Title.setText(title_in);
	}
	public void setElection2Titie(String title_in)
	{
		election2Title.setText(title_in);
	}
	public void setElection3Titie(String title_in)
	{
		election3Title.setText(title_in);
	}

    public void setElection1VoteDay(String voteDay_in)
    {
    	election1VoteDay.setText(voteDay_in);
    }
    
    public void setElection2VoteDay(String voteDay_in)
    {
    	election2VoteDay.setText(voteDay_in);
    }
    
    public void setElection3VoteDay(String voteDay_in)
    {
    	election3VoteDay.setText(voteDay_in);
    }
    
    public void setElection1Mark(String election_category)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	election1Mark.setImage(new Image(getClass().getResourceAsStream("../img/"+ election_category +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		election1Mark.setImage(new Image(getClass().getResourceAsStream("../img/흰색_마크.png")));
    		System.out.println("error");}
    }
    
    public void setElection2Mark(String election_category)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	election2Mark.setImage(new Image(getClass().getResourceAsStream("../img/"+ election_category +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		election2Mark.setImage(new Image(getClass().getResourceAsStream("../img/흰색_마크.png")));
    		System.out.println("error");}
    }
    
    public void setElection3Mark(String election_category)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	election3Mark.setImage(new Image(getClass().getResourceAsStream("../img/"+ election_category +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		election3Mark.setImage(new Image(getClass().getResourceAsStream("../img/흰색_마크.png")));
    		System.out.println("error");}
    }
}
