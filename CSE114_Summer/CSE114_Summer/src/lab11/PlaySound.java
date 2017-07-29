package lab11;

//Benjamin Michalowicz(SBU ID: 110982339)
//Lab 11: Part 5: Media Player (Written by Dr. Paul Fodor)
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
public class PlaySound extends Application {
    Button btn;
    MediaPlayer mediaPlayer;
    @Override
    public void start(Stage primaryStage) {
        Media hit = new Media("http://ak.channel9.msdn.com/ch9/56ef/e9aef824-77b5-45c5-b48e-a005017456ef/WindowsBlogWin8CPSizzle_ch9.mp3");
        // If you have a media file on your own machine you can load it with:
        // Media hit = new Media(new File("audio/name.mp3").toURI().toString());
        mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
        btn = new Button("Pause");
        btn.setOnAction((ActionEvent event) -> {
            if (btn.getText().equals("Pause")) {
                mediaPlayer.pause();
                btn.setText("Play");
            } else {
                mediaPlayer.play();
                btn.setText("Pause");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}