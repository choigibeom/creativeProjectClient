package Project.controller;

import java.net.URL;
import java.util.ResourceBundle;

import Project.dataModel.ElectionResultDataModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class nationalAssemblyChartViewController implements Initializable {
	@FXML private ImageView liveVoteInfoBtn;
	@FXML private ImageView candidateAndElectionInfoBtn;
	@FXML private PieChart pieChart;
	@FXML private LineChart<String, Integer> lineChart;
	@FXML private SplitMenuButton electionList; // ���� ���
	@FXML private TableView<ElectionResultDataModel> electionResult; // ���� ���
	@FXML private TableColumn<ElectionResultDataModel, String> partyCol; // ����
	@FXML private TableColumn<ElectionResultDataModel, String> constituencyCol; // ������
	@FXML private TableColumn<ElectionResultDataModel, String> proportionalRepresentationCol; // ��ʴ�ǥ
	@FXML private TableColumn<ElectionResultDataModel, String> amountCol; // ����
	@FXML private TableColumn<ElectionResultDataModel, String> rateCol; // ����
	@FXML private Text party1; // ���� 1
	@FXML private Text party2; // ���� 2
	@FXML private Text party3; // ���� 3
	@FXML private Text party4; // ���� 4
	@FXML private Text party5; // ���� 5
    
    ObservableList<ElectionResultDataModel>myList = FXCollections.observableArrayList(
    		new ElectionResultDataModel(new SimpleStringProperty("���Ҿ���ִ�"), new SimpleStringProperty("163��"), new SimpleStringProperty("17��"), new SimpleStringProperty("180��"), new SimpleStringProperty("60.0%"))
    		);
    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
    	 XYChart.Series<String, Integer> series1 = null;
    	 series1 = new XYChart.Series<String, Integer>();
         // series�� ���� ������ �߰� 
         series1.getData().add(new XYChart.Data<String, Integer>("2012",30));
         series1.getData().add(new XYChart.Data<String, Integer>("2016",40));
         series1.getData().add(new XYChart.Data<String, Integer>("2020",50));

         series1.setName("��������");
         
    	 XYChart.Series<String, Integer> series2 = null;
    	 series2 = new XYChart.Series<String, Integer>();
         // series�� ���� ������ �߰� 
         series2.getData().add(new XYChart.Data<String, Integer>("2012",40));
         series2.getData().add(new XYChart.Data<String, Integer>("2016",30));
         series2.getData().add(new XYChart.Data<String, Integer>("2020",15));

         series2.setName("���Ҿ���ִ�");
         
    	 XYChart.Series<String, Integer> series3 = null;
    	 series3 = new XYChart.Series<String, Integer>();
         // series�� ���� ������ �߰� 
         series3.getData().add(new XYChart.Data<String, Integer>("2012",5));
         series3.getData().add(new XYChart.Data<String, Integer>("2016",2));
         series3.getData().add(new XYChart.Data<String, Integer>("2020",3));

         series3.setName("�����Ǵ�");

         // ������Ʈ�� series �߰� 
         lineChart.getData().add(series1);
         lineChart.getData().add(series2);
         lineChart.getData().add(series3);
    	pieChart.setData(FXCollections.observableArrayList(
    		    new PieChart.Data("������ ��", 20),
    		    new PieChart.Data("���Ҿ���ִ�", 32),
    		    new PieChart.Data("���Ǵ�", 24),
    		    new PieChart.Data("�����Ǵ�", 7)
    		));
    	partyCol.setCellValueFactory(cellData->cellData.getValue().partyProperty());
    	constituencyCol.setCellValueFactory(cellData->cellData.getValue().constituencyProperty());
    	proportionalRepresentationCol.setCellValueFactory(cellData->cellData.getValue().proportionalRepresentationProperty());
    	amountCol.setCellValueFactory(cellData->cellData.getValue().amountProperty());
    	rateCol.setCellValueFactory(cellData->cellData.getValue().rateProperty());
    	electionResult.setItems(myList);
    }
    
}