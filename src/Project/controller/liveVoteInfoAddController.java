package Project.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class liveVoteInfoAddController implements Initializable {
	@FXML private ImageView candidateAndElectionInfoBtn;
	@FXML private ImageView electionHistoryInfoBtn;
	@FXML private Arc voteBallotRateGraph; // 개표율 도형
	@FXML private Text voteBallotRate; // 개표율
	@FXML private SplitMenuButton electionList; // 선거 목록
	@FXML private ImageView regionImage; // 지역 사진
	@FXML private Text region; // 지역
	@FXML private Rectangle firstCandidateVoteGraph; // 첫번째(좌측) 후보 득표 그래프
	@FXML private Rectangle secondCandidateVoteGraph; // 첫번째(좌측) 후보 투표 그래프
	@FXML private TextField voteRate; // 투표율
	@FXML private TextField voteCount; // 개표수
	@FXML private TextField candidateCount; // 선거인수
	@FXML private Text electionTitle;
	@FXML private Text firstCandidateName; // 첫번째(좌측) 후보 이름
	@FXML private Text secondCandidateName; // 두번째(우측) 후보 이름
	@FXML private Text firstCandidateNumber; // 첫번째(좌측) 후보 기호
	@FXML private Text secondCandidateNumber; // 두번째(우측) 후보 기호
	@FXML private Text firstCandidateParty; // 첫번째(좌측) 후보 정당
	@FXML private Text secondCandidateParty; // 두번째(좌측) 후보 정당
	@FXML private Text firstCandidateVote; // 첫번째(좌측) 후보 득표수
	@FXML private Text secondCandidateVote; // 두번째(우측) 후보 득표수 
	@FXML private Text firstCandidateVoteRate; // 첫번째(좌측) 후보 득표율
	@FXML private Text secondCandidateVoteRate; // 두번째(우측) 후보 득표율

    public void initialize(URL location, ResourceBundle resoruces) {
    	setBallotRateGraph(0.5);
    	addElectionList("서울 시도지사 선거");
    	addElectionList("부산 시도지사 선거");
    	setFirstCandidateVoteGraph(0.6);
    	setSecondCandidateVoteGraph(0.3);
    	setRegionImage("부산");
    	setVoteRate("50.4");
    }
    
    public void setBallotRateGraph(double voteBallotRate)
    {
    	voteBallotRateGraph.setLength(360 * voteBallotRate);
    }
    
    public void addElectionList(String election)
    {
        electionList.getItems().add(new MenuItem(election));
    }
    public void setFirstCandidateVoteGraph(double voteRate)
    {
    	firstCandidateVoteGraph.setWidth(469 * voteRate);
    }
    public void setSecondCandidateVoteGraph(double voteRate)
    {
    	secondCandidateVoteGraph.setWidth(469 * voteRate);
    	secondCandidateVoteGraph.setLayoutX(491 - 469 * voteRate);
    }
    public void setRegionImage(String region)
    {
    	try
    	{
        	Thread thread = new Thread() {
        		public void run() {
        	    	regionImage.setImage(new Image(getClass().getResourceAsStream("../img/catogram/파랑/"+ region +"-파랑-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) { System.out.println("error");}
    }

    public void setRegion(String region_in)
    {
    	region.setText(region_in);
    }
    
    
    public void setVoteRate(String rate_in)
    {
    	voteRate.setText(rate_in);
    }
    
    public void setVoteCount(String count_in)
    {
    	voteCount.setText(count_in);
    }
    
    public void setElectionTitle(String title)
    {
    	electionTitle.setText(title);
    }
    
    public void setFirstCandidateName(String name)
    {
    	firstCandidateName.setText(name);
    }
    
    public void setSecondCandidateName(String name)
    {
    	secondCandidateName.setText(name);
    }
    
    public void setFirstCandidateNumber(String number)
    {
    	firstCandidateNumber.setText(number);
    }
    
    public void setSecondCandidateNumber(String number)
    {
    	secondCandidateNumber.setText(number);
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
    
    public void setSecondCandidateVoteRate(String voteRate)
    {
    	secondCandidateVoteRate.setText(voteRate);
    }
}