package client.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class presidentChartViewController implements Initializable {
	@FXML private ImageView liveVoteInfoBtn;
	@FXML private ImageView candidateAndElectionInfoBtn;
	@FXML private PieChart pieChart;
	@FXML private LineChart<String, Integer> lineChart;
	@FXML private Text presidentParty; // 대통령 정당
	@FXML private Text presidentName; // 대통령 이름
	@FXML private Text firstCandidateName; // 당선인 이름
	@FXML private Text secondCandidateName; // 경쟁자 이름
	@FXML private Text firstCandidateParty; // 당선인 정당
	@FXML private Text secondCandidateParty; // 경쟁자 정당
	@FXML private Text firstCandidateVoteRate; // 당선인 득표율
	@FXML private Text secondCandidateVoteRate; // 경쟁자 득표율
	@FXML private Text firstCandidateVote; // 당선인 득표수
	@FXML private Text secondCandidateVote; // 경쟁자 득표수
	@FXML private ImageView presidentImage; // 대통령 사진
	@FXML private Rectangle firstCandidateVoteGraph; // 당선인 투표 그래프
	@FXML private Rectangle secondCandidateVoteGraph; // 경쟁자 투표 그래프
	@FXML private SplitMenuButton electionList; // 선거 목록
	@FXML private Text party1; // 정당 1
	@FXML private Text party2; // 정당 2
	@FXML private Text party3; // 정당 3
	@FXML private Text party4; // 정당 4
	@FXML private Text party5; // 정당 5

	//카토그램
	@FXML private ImageView chungcheongbukdo; // 충청북도
	@FXML private ImageView sejong; // 세종
	@FXML private ImageView daejeon; // 대전
	@FXML private ImageView jeollabukdo; // 전라북도
	@FXML private ImageView gyeongsangnamdo; // 경상남도
	@FXML private ImageView daegu; // 대구
	@FXML private ImageView ulsan; // 울산
	@FXML private ImageView busan; // 부산
	@FXML private ImageView gwangju; // 광주
	@FXML private ImageView jejudo; // 제주도
	@FXML private ImageView gyeonggido; // 경기도
	@FXML private ImageView gangwondo; // 강원도
	@FXML private ImageView incheon; // 인천
	@FXML private ImageView seoul; // 서울
	@FXML private ImageView jeollanamdo; // 전라남도
	@FXML private ImageView gyeongsangbukdo; // 경상북도
	@FXML private ImageView chungcheongnamdo; // 충청남도


    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
    	 XYChart.Series<String, Integer> series = null;
    	 series = new XYChart.Series<String, Integer>();
         // series에 개별 데이터 추가 
         series.getData().add(new XYChart.Data<String, Integer>("2018",30));
         series.getData().add(new XYChart.Data<String, Integer>("2019",40));
         series.getData().add(new XYChart.Data<String, Integer>("2020",50));
         series.getData().add(new XYChart.Data<String, Integer>("2021",30));

         series.setName("지지율");

         // 라인차트에 series 추가 
         lineChart.getData().add(series);
    	pieChart.setData(FXCollections.observableArrayList(
    		    new PieChart.Data("국민의 힘", 20),
    		    new PieChart.Data("더불어민주당", 32),
    		    new PieChart.Data("정의당", 24),
    		    new PieChart.Data("국민의당", 7)
    		));
    }
    
    public void setPresidentParty(String party)
    {
    	presidentParty.setText(party);
    }
    
    public void setPresidentName(String name)
    {
    	presidentName.setText(name);
    }
    
    public void setFirstCandidateName(String name)
    {
    	firstCandidateName.setText(name);
    }
    
    public void setSecondCandidateName(String name)
    {
    	secondCandidateName.setText(name);
    }
    
    public void setFirstCandidateParty(String party)
    {
    	firstCandidateParty.setText(party);
    }
    
    public void setSecondCandidateParty(String party)
    {
    	secondCandidateParty.setText(party);
    }
    
    public void setFirstCandidateVote(String vote)
    {
    	firstCandidateVote.setText(vote);
    }
    
    public void setSecondCandidateVote(String vote)
    {
    	secondCandidateVote.setText(vote);
    }
    
    public void setFirstCandidateVoteRate(String voteRate)
    {
    	firstCandidateVoteRate.setText(voteRate);
    }
    
    public void setPresidentImage(String candidate_name)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	presidentImage.setImage(new Image(getClass().getResourceAsStream("../img/"+ candidate_name +"_사진.jpg")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		presidentImage.setImage(new Image(getClass().getResourceAsStream("../img/기본이미지.png")));
    		System.out.println("error");}
    }
    public void setSecondCandidateVoteRate(String voteRate)
    {
    	secondCandidateVoteRate.setText(voteRate);
    }
    
    public void setFirstCandidateVoteGraph(double voteRate)
    {
    	firstCandidateVoteGraph.setWidth(320 * voteRate);
    }
    
    public void setSecondCandidateVoteGraph(double voteRate)
    {
    	secondCandidateVoteGraph.setWidth(320 * voteRate);
    	secondCandidateVoteGraph.setLayoutX(418 - 320 * voteRate);
    }
    
    public void addElectionList(String election)
    {
        electionList.getItems().add(new MenuItem(election));
    }
    
    public void setParty1(String party)
    {
    	party1.setText(party);
    }
    
    public void setParty2(String party)
    {
    	party2.setText(party);
    }
    
    public void setParty3(String party)
    {
    	party3.setText(party);
    }
    
    public void setParty4(String party)
    {
    	party4.setText(party);
    }
    
    public void setParty5(String party)
    {
    	party5.setText(party);
    }
    
    public void setChungcheongbukdo(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			chungcheongbukdo.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/충청북도-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setSejong(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			sejong.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/세종-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setDaejeon(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			daejeon.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/대전-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setJeollabukdo(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			jeollabukdo.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/전라북도-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setGyeongsangnamdo(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			gyeongsangnamdo.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/경상남도-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setDaegu(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			daegu.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/대구-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setUlsan(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			ulsan.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/울산-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setBusan(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			busan.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/부산-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setGwangju(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			gwangju.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/광주-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setJejudo(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			jejudo.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/제주도-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setGyeonggido(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			gyeonggido.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/경기도-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setGangwondo(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			gangwondo.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/강원도-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setIncheon(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			incheon.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/인천-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setSeoul(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			seoul.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/서울-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setJeollanamdo(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			jeollanamdo.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/전라남도-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setGyeongsangbukdo(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			gyeongsangbukdo.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/경상북도-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    public void setChungcheongnamdo(String color)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        			chungcheongnamdo.setImage(new Image(getClass().getResourceAsStream("../img/catogram/"+ color + "/충청남도-" + color +"-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) {
    		System.out.println("error");}
    }
    
    
}