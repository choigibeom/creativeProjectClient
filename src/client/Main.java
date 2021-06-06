package client;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Font.loadFont(getClass().getResourceAsStream("font/BMHANNA_11yrs_ttf.ttf"), 16);
        Font.loadFont(getClass().getResourceAsStream("font/NanumSquareR.ttf"), 16);
        Font.loadFont(getClass().getResourceAsStream("font/NanumSquareB.ttf"), 16);
        Font.loadFont(getClass().getResourceAsStream("font/NanumSquareEB.ttf"), 16);
        Parent root = FXMLLoader.load(getClass().getResource("fxml/logoView.fxml"));
        primaryStage.setTitle("슬기로운 정치생활");
        primaryStage.setScene(new Scene(root, 512, 540));
        primaryStage.show();
        changeView(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void changeView(Stage primaryStage) throws Exception
    {
		Parent main = FXMLLoader.load(getClass().getResource("fxml/mainView.fxml"));
		Scene scene = new Scene(main,512,540);
        	Thread thread = new Thread() {
        		public void run() {
        			try { Thread.sleep(1500); } catch (InterruptedException e) {}
        			Platform.runLater(()->{primaryStage.setScene(scene);});
        			Platform.runLater(()->{primaryStage.setTitle("메인화면");});
        		}
        	};
        	thread.setDaemon(true);
        	thread.start();
    }
}
