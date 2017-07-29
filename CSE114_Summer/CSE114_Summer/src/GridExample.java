
/**
 *
 * @author Ben Michalowicz
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class GridExample extends Application {

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("GridPane Example");

        Rectangle red = new Rectangle(50, 50);
        Rectangle orange = new Rectangle(50, 50);
        Rectangle yellow = new Rectangle(100, 50);
        Rectangle green = new Rectangle(50, 100);
        Rectangle blue = new Rectangle(50, 50);
        Rectangle purple = new Rectangle(50, 50);

        red.setFill(Color.RED);
        orange.setFill(Color.ORANGE);
        yellow.setFill(Color.YELLOW);
        green.setFill(Color.GREEN);
        blue.setFill(Color.BLUE);
        purple.setFill(Color.PURPLE);

        GridPane gridPane = new GridPane();
        gridPane.setPrefSize(300, 300);
        gridPane.setGridLinesVisible(true);

        for (int i = 0; i < 6; i++) {
            ColumnConstraints cc = new ColumnConstraints(50);
            gridPane.getColumnConstraints().add(cc);
        }

        for (int i = 0; i < 6; i++) {
            RowConstraints rc = new RowConstraints(50);
            gridPane.getRowConstraints().add(rc);
        }

        gridPane.add(red, 0, 0, 1, 1);
        gridPane.add(orange, 1, 0, 1, 1);
        gridPane.add(yellow, 1, 1, 2, 1);
        gridPane.add(green, 2, 4, 1, 2);
        gridPane.add(blue, 0, 3, 1, 1);
        gridPane.add(purple, 5, 1, 1, 1);

        HBox buttonPane = new HBox(20);
        Button button = new Button("Move Blue and Green Squares");
        buttonPane.getChildren().add(button);
        buttonPane.setAlignment(Pos.CENTER);

        button.setOnAction(e -> {
            gridPane.getChildren().remove(blue);
            gridPane.add(blue, 5, 5, 5, 4);
            gridPane.getChildren().remove(green);
            gridPane.add(green, 2, 3, 1, 2);
        });

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(buttonPane);
        borderPane.setCenter(gridPane);

        Scene scene = new Scene(borderPane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
