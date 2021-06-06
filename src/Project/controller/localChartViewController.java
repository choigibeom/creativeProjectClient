package Project.controller;

import java.net.URL;
import java.util.ResourceBundle;

import Project.dataModel.ElectionResultDataModel2;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class localChartViewController implements Initializable {
	@FXML private ImageView liveVoteInfoBtn;
	@FXML private ImageView candidateAndElectionInfoBtn;
	@FXML private PieChart pieChart;
	@FXML private SplitMenuButton electionList; // 선거 목록
	@FXML private TableView<ElectionResultDataModel2> electionResult; // 선거 결과
	@FXML private TableColumn<ElectionResultDataModel2, String> partyCol; // 정당
	@FXML private TableColumn<ElectionResultDataModel2, String> amountCol; // 총합
	@FXML private TableColumn<ElectionResultDataModel2, String> rateCol; // 비율
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
    ObservableList<ElectionResultDataModel2>myList = FXCollections.observableArrayList(
    		new ElectionResultDataModel2(new SimpleStringProperty("더불어민주당"), new SimpleStringProperty("652석"), new SimpleStringProperty("79.1%"))
    		);
    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
    	pieChart.setData(FXCollections.observableArrayList(
    		    new PieChart.Data("국민의 힘", 20),
    		    new PieChart.Data("더불어민주당", 32),
    		    new PieChart.Data("정의당", 24),
    		    new PieChart.Data("국민의당", 7)
    		));
    	partyCol.setCellValueFactory(cellData->cellData.getValue().partyProperty());
    	amountCol.setCellValueFactory(cellData->cellData.getValue().amountProperty());
    	rateCol.setCellValueFactory(cellData->cellData.getValue().rateProperty());
    	electionResult.setItems(myList);
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