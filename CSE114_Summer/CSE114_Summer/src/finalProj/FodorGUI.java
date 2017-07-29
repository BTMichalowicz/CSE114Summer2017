package finalProj;

/**
 *
 * @author Ben Michalowicz
 */
//Fodor's GUI for his Game; this is more for practice for a GUI for CSE 219 and future Java-related course
import java.util.Hashtable;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class FodorGUI extends Application {

    Button[][] bs = new Button[6][6];

    TextField car = new TextField("1");
    TextField x = new TextField("3");
    TextField y = new TextField("5");
    TextField direction = new TextField("1");
    TextField size = new TextField("2");

    @Override
    public void start(Stage stage) throws Exception {
        FodorGame game = new FodorGame();

        GridPane gp = new GridPane();

        gp.setGridLinesVisible(true);

        game.initializeCars();

        Hashtable<Integer, String> hash = new Hashtable();

        hash.put(1, "red");
        hash.put(2, "orange");
        hash.put(3, "yellow");
        hash.put(4, "green");
        hash.put(5, "blue");
        hash.put(6, "purple");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                bs[i][j] = new Button("" + game.matrix[i][j]);
                bs[i][j].setStyle("-fx-font: 65 arial; -fx-base: #b6e7c9; "
                        + "-fx-background-color: " + hash.get(game.matrix[i][j]));
                gp.add(bs[i][j], j, i);

            }
        }

        Button button = new Button("Next");
        button.setStyle("-fx-font: 15 arial; -fx-base: b6e7c9;");

        button.setOnAction(e -> {

            game.move(Integer.parseInt(car.getText()), Integer.parseInt(x.getText()) - 1, Integer.parseInt(y.getText()) - 1,
                    Integer.parseInt(direction.getText()), Integer.parseInt(size.getText()));

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    bs[i][j] = new Button("" + game.matrix[i][j]);
                    bs[i][j].setStyle("-fx-font: 65 arial; -fx-base: #b6e7c9; "
                            + "-fx-background-color: " + hash.get(game.matrix[i][j]) + ";");

                }
            }

        });
        
        
        VBox borderPane = new VBox();
        gp.setAlignment(Pos.CENTER);
        borderPane.getChildren().add(gp);
        
        HBox h = new HBox();
        
        h.getChildren().addAll(car, x, y, direction, size, button);
        borderPane.getChildren().add(h);
        
        Scene scene = new Scene(borderPane, 1200, 1000);
        stage.setScene(scene);
        
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
