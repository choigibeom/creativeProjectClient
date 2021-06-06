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
	@FXML private Arc voteBallotRateGraph; // ��ǥ�� ����
	@FXML private Text voteBallotRate; // ��ǥ��
	@FXML private SplitMenuButton electionList; // ���� ���
	@FXML private ImageView regionImage; // ���� ����
	@FXML private Text region; // ����
	@FXML private Rectangle firstCandidateVoteGraph; // ù��°(����) �ĺ� ��ǥ �׷���
	@FXML private Rectangle secondCandidateVoteGraph; // ù��°(����) �ĺ� ��ǥ �׷���
	@FXML private TextField voteRate; // ��ǥ��
	@FXML private TextField voteCount; // ��ǥ��
	@FXML private TextField candidateCount; // �����μ�
	@FXML private Text electionTitle;
	@FXML private Text firstCandidateName; // ù��°(����) �ĺ� �̸�
	@FXML private Text secondCandidateName; // �ι�°(����) �ĺ� �̸�
	@FXML private Text firstCandidateNumber; // ù��°(����) �ĺ� ��ȣ
	@FXML private Text secondCanddiateNumber; // �ι�°(����) �ĺ� ��ȣ
	@FXML private Text firstCandidateParty; // ù��°(����) �ĺ� ����
	@FXML private Text secondCandidateParty; // �ι�°(����) �ĺ� ����
	@FXML private Text firstCandidateVote; // ù��°(����) �ĺ� ��ǥ��
	@FXML private Text secondCandidateVote; // �ι�°(����) �ĺ� ��ǥ�� 
	@FXML private Text firstCandidateVoteRate; // ù��°(����) �ĺ� ��ǥ��
	@FXML private Text secondCandidateVoteRate; // �ι�°(����) �ĺ� ��ǥ��

    public void initialize(URL location, ResourceBundle resoruces) {
    	setBallotRateGraph(0.5);
    	addElectionList("���� �õ����� ����");
    	addElectionList("�λ� �õ����� ����");
    	setFirstCandidateVoteGraph(0.6);
    	setSecondCandidateVoteGraph(0.3);
    	setRegionImage("�λ�");
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
        	    	regionImage.setImage(new Image(getClass().getResourceAsStream("../img/catogram/�Ķ�/"+ region +"-�Ķ�-1.png")));
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    	}
    	catch(Exception e) { System.out.println("error");}
    }
    public void setVoteRate(String Rate)
    {
    	voteRate.setText(Rate);
    }
}