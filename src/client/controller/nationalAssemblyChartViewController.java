package client.controller;

import java.net.URL;
import java.util.ResourceBundle;

import client.dataModel.ElectionResultDataModel;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class nationalAssemblyChartViewController implements Initializable {
	@FXML private ImageView liveVoteInfoBtn;
	@FXML private ImageView candidateAndElectionInfoBtn;
	@FXML private PieChart pieChart;
	@FXML private LineChart<String, Integer> lineChart;
	@FXML private SplitMenuButton electionList; // 선거 목록
	@FXML private TableView<ElectionResultDataModel> electionResult; // 선거 결과
	@FXML private TableColumn<ElectionResultDataModel, String> partyCol; // 정당
	@FXML private TableColumn<ElectionResultDataModel, String> constituencyCol; // 지역구
	@FXML private TableColumn<ElectionResultDataModel, String> proportionalRepresentationCol; // 비례대표
	@FXML private TableColumn<ElectionResultDataModel, String> amountCol; // 총합
	@FXML private TableColumn<ElectionResultDataModel, String> rateCol; // 비율
	@FXML private Text party1; // 정당 1
	@FXML private Text party2; // 정당 2
	@FXML private Text party3; // 정당 3
	@FXML private Text party4; // 정당 4
	@FXML private Text party5; // 정당 5
    
    ObservableList<ElectionResultDataModel>myList = FXCollections.observableArrayList(
    		new ElectionResultDataModel(new SimpleStringProperty("더불어민주당"), new SimpleStringProperty("163석"), new SimpleStringProperty("17석"), new SimpleStringProperty("180석"), new SimpleStringProperty("60.0%"))
    		);
    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
    	 XYChart.Series<String, Integer> series1 = null;
    	 series1 = new XYChart.Series<String, Integer>();
         // series에 개별 데이터 추가 
         series1.getData().add(new XYChart.Data<String, Integer>("2012",30));
         series1.getData().add(new XYChart.Data<String, Integer>("2016",40));
         series1.getData().add(new XYChart.Data<String, Integer>("2020",50));

         series1.setName("국민의힘");
         
    	 XYChart.Series<String, Integer> series2 = null;
    	 series2 = new XYChart.Series<String, Integer>();
         // series에 개별 데이터 추가 
         series2.getData().add(new XYChart.Data<String, Integer>("2012",40));
         series2.getData().add(new XYChart.Data<String, Integer>("2016",30));
         series2.getData().add(new XYChart.Data<String, Integer>("2020",15));

         series2.setName("더불어민주당");
         
    	 XYChart.Series<String, Integer> series3 = null;
    	 series3 = new XYChart.Series<String, Integer>();
         // series에 개별 데이터 추가 
         series3.getData().add(new XYChart.Data<String, Integer>("2012",5));
         series3.getData().add(new XYChart.Data<String, Integer>("2016",2));
         series3.getData().add(new XYChart.Data<String, Integer>("2020",3));

         series3.setName("국민의당");

         // 라인차트에 series 추가 
         lineChart.getData().add(series1);
         lineChart.getData().add(series2);
         lineChart.getData().add(series3);
    	pieChart.setData(FXCollections.observableArrayList(
    		    new PieChart.Data("국민의 힘", 20),
    		    new PieChart.Data("더불어민주당", 32),
    		    new PieChart.Data("정의당", 24),
    		    new PieChart.Data("국민의당", 7)
    		));
    	partyCol.setCellValueFactory(cellData->cellData.getValue().partyProperty());
    	constituencyCol.setCellValueFactory(cellData->cellData.getValue().constituencyProperty());
    	proportionalRepresentationCol.setCellValueFactory(cellData->cellData.getValue().proportionalRepresentationProperty());
    	amountCol.setCellValueFactory(cellData->cellData.getValue().amountProperty());
    	rateCol.setCellValueFactory(cellData->cellData.getValue().rateProperty());
    	electionResult.setItems(myList);
    }
    
}