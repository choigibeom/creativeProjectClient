package Project.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class presidentChartViewController implements Initializable {
	@FXML private ImageView liveVoteInfoBtn;
	@FXML private ImageView candidateAndElectionInfoBtn;
	@FXML private PieChart pieChart;
	@FXML private LineChart<String, Integer> lineChart;
	@FXML private Text presidentParty; // ����� ����
	@FXML private Text presidentName; // ����� �̸�
	@FXML private Text firstCandidateName; // �缱�� �̸�
	@FXML private Text secondCandidateName; // ������ �̸�
	@FXML private Text firstCandidateParty; // �缱�� ����
	@FXML private Text secondCandidateParty; // ������ ����
	@FXML private Text firstCandidateVoteRate; // �缱�� ��ǥ��
	@FXML private Text secondCandidateVoteRate; // ������ ��ǥ��
	@FXML private Text firstCandidateVote; // �缱�� ��ǥ��
	@FXML private Text secondCandidateVote; // ������ ��ǥ��
	@FXML private ImageView presidentImage; // ����� ����
	@FXML private Rectangle firstCandidateVoteGraph; // �缱�� ��ǥ �׷���
	@FXML private Rectangle secondCandidateVoteGraph; // ������ ��ǥ �׷���
	@FXML private SplitMenuButton electionList; // ���� ���
	@FXML private Text party1; // ���� 1
	@FXML private Text party2; // ���� 2
	@FXML private Text party3; // ���� 3
	@FXML private Text party4; // ���� 4
	@FXML private Text party5; // ���� 5
	
	@FXML private ImageView chungcheongbukdo; // ��û�ϵ�
	@FXML private ImageView sejong; // ����
	@FXML private ImageView daejeon; // ����
	@FXML private ImageView jeollabukdo; // ����ϵ�
	@FXML private ImageView gyeongsangnamdo; // ��󳲵�
	@FXML private ImageView daegu; // �뱸
	@FXML private ImageView ulsan; // ���
	@FXML private ImageView busan; // �λ�
	@FXML private ImageView gwangju; // ����
	@FXML private ImageView jejudo; // ���ֵ�
	@FXML private ImageView gyeonggido; // ��⵵
	@FXML private ImageView gangwondo; // ������
	@FXML private ImageView incheon; // ��õ
	@FXML private ImageView seoul; // ����
	@FXML private ImageView jeollanamdo; // ���󳲵�
	@FXML private ImageView gyeongsangbukdo; // ���ϵ�
	@FXML private ImageView chungcheongnamdo; // ��û����


    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
    	 XYChart.Series<String, Integer> series = null;
    	 series = new XYChart.Series<String, Integer>();
         // series�� ���� ������ �߰� 
         series.getData().add(new XYChart.Data<String, Integer>("2018",30));
         series.getData().add(new XYChart.Data<String, Integer>("2019",40));
         series.getData().add(new XYChart.Data<String, Integer>("2020",50));
         series.getData().add(new XYChart.Data<String, Integer>("2021",30));

         series.setName("������");

         // ������Ʈ�� series �߰� 
         lineChart.getData().add(series);
    	pieChart.setData(FXCollections.observableArrayList(
    		    new PieChart.Data("������ ��", 20),
    		    new PieChart.Data("���Ҿ���ִ�", 32),
    		    new PieChart.Data("���Ǵ�", 24),
    		    new PieChart.Data("�����Ǵ�", 7)
    		));
    }
    
}