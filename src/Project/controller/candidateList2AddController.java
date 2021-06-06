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
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.image.Image;
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
    
    public void setElection2Title(String title_in)
    {
    	election2Title.setText(title_in);
    }
    
    public void setElection2VoteDay(String voteDay_in)
    {
    	election2VoteDay.setText(voteDay_in);
    }
    
    public void addConstituencyList(String constituency_in)
    {
    	constituencyList.getItems().add(new MenuItem(constituency_in));
    }
    
    public void setCandidate1(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate1.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate1.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate2(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate2.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate2.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate3(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate3.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate3.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate4(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate4.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate4.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate5(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate5.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate5.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate6(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate6.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate6.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate7(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate7.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate7.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate8(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate8.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate8.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate9(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate9.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate9.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate10(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate10.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate10.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate11(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate11.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate11.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate12(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate12.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate12.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate13(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate13.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate13.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate14(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate14.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate14.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate15(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	candidate15.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		candidate15.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    
    public void setCandidate1Name(String candidate_number_name)
    {
    	candidate1Name.setText(candidate_number_name);
    }
    
    public void setCandidate2Name(String candidate_number_name)
    {
    	candidate2Name.setText(candidate_number_name);
    }
    
    public void setCandidate3Name(String candidate_number_name)
    {
    	candidate3Name.setText(candidate_number_name);
    }
    
    public void setCandidate4Name(String candidate_number_name)
    {
    	candidate4Name.setText(candidate_number_name);
    }
    
    public void setCandidate5Name(String candidate_number_name)
    {
    	candidate5Name.setText(candidate_number_name);
    }
    
    public void setCandidate6Name(String candidate_number_name)
    {
    	candidate6Name.setText(candidate_number_name);
    }
    
    public void setCandidate7Name(String candidate_number_name)
    {
    	candidate7Name.setText(candidate_number_name);
    }
    
    public void setCandidate8Name(String candidate_number_name)
    {
    	candidate8Name.setText(candidate_number_name);
    }
    
    public void setCandidate9Name(String candidate_number_name)
    {
    	candidate9Name.setText(candidate_number_name);
    }
    
    public void setCandidate10Name(String candidate_number_name)
    {
    	candidate10Name.setText(candidate_number_name);
    }
    
    public void setCandidate11Name(String candidate_number_name)
    {
    	candidate11Name.setText(candidate_number_name);
    }
    
    public void setCandidate12Name(String candidate_number_name)
    {
    	candidate12Name.setText(candidate_number_name);
    }
    
    public void setCandidate13Name(String candidate_number_name)
    {
    	candidate13Name.setText(candidate_number_name);
    }
    
    public void setCandidate14Name(String candidate_number_name)
    {
    	candidate14Name.setText(candidate_number_name);
    }

    public void setCandidate15Name(String candidate_number_name)
    {
    	candidate15Name.setText(candidate_number_name);
    }
}