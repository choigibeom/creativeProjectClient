package Project.controller;

import java.io.*;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Project.Persistance.CandidateDTO;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class mainViewController implements Initializable {
    @FXML
    private ImageView liveVoteInfoBtn;
    @FXML
    private ImageView candidateAndElectionInfoBtn;
    @FXML
    private ImageView electionHistoryInfoBtn;

    private Socket socket;
    private ObjectOutputStream os;
    private ObjectInputStream is;
    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
        liveVoteInfoBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                changeLiveVoteInfo();
            }

            ;
        });

        candidateAndElectionInfoBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                changeCandidateAndElectionInfo();
            }

            ;
        });

        electionHistoryInfoBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                changeElectionHistoryInfo();
            }

            ;
        });
    }

    public void changeLiveVoteInfo() {
        try {
            Parent main = FXMLLoader.load(getClass().getResource("../fxml/liveVoteInfo.fxml"));
            Scene scene = new Scene(main, 512, 540);
            Thread thread = new Thread() {
                public void run() {
                    Stage primaryStage = (Stage) liveVoteInfoBtn.getScene().getWindow();
                    Platform.runLater(() -> {
                        primaryStage.setScene(scene);
                    });
                    Platform.runLater(() -> {
                        primaryStage.setTitle("�ǽð� ����ǥ ��Ȳ");
                    });
                }
            };
            thread.setDaemon(true);
            thread.start();
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void changeCandidateAndElectionInfo() {
        try {
//            Socket clSocket = new Socket("localhost", 9594);
//            PrintWriter pw = new PrintWriter(clSocket.getOutputStream(), true);
//            //BufferedReader br = new BufferedReader(new InputStreamReader(clSocket.getInputStream()));
//
////			pw.write("5");
////			pw.flush();
////			pw.close();
//            ObjectOutputStream oos = new ObjectOutputStream(clSocket.getOutputStream());
//
//            oos.writeObject("5");
//            oos.flush();
//           // clSocket.close();
//            ObjectInputStream ois = new ObjectInputStream(clSocket.getInputStream());
//            ArrayList<CandidateDTO> dto = (ArrayList<CandidateDTO>) ois.readObject();
            socket = new Socket("localhost", 9594);
            os = new ObjectOutputStream(socket.getOutputStream());
            os.writeObject("5");
            os.flush();

            is = new ObjectInputStream(socket.getInputStream());
            ArrayList<CandidateDTO> dto = (ArrayList<CandidateDTO>) is.readObject();
            System.out.println(dto.get(0).getName());
            Parent main = FXMLLoader.load(getClass().getResource("../fxml/electionInfo.fxml"));
            Scene scene = new Scene(main, 512, 540);
            Thread thread = new Thread() {
                public void run() {
                    Stage primaryStage = (Stage) candidateAndElectionInfoBtn.getScene().getWindow();
                    Platform.runLater(() -> {
                        primaryStage.setScene(scene);
                    });
                    Platform.runLater(() -> {
                        primaryStage.setTitle("�ĺ��� �� ���� ����");
                    });
                }
            };
            thread.setDaemon(true);
            thread.start();
        } catch (Exception e) {
            System.out.println("error");
        }
    }


    public void changeElectionHistoryInfo() {
        try {
            Parent main = FXMLLoader.load(getClass().getResource("../fxml/electionHistoryInfo.fxml"));
            Scene scene = new Scene(main, 512, 540);
            Thread thread = new Thread() {
                public void run() {
                    Stage primaryStage = (Stage) electionHistoryInfoBtn.getScene().getWindow();
                    Platform.runLater(() -> {
                        primaryStage.setScene(scene);
                    });
                    Platform.runLater(() -> {
                        primaryStage.setTitle("���� �缱 ����");
                    });
                }
            };
            thread.setDaemon(true);
            thread.start();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}