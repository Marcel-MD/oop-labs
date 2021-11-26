package md.utm.marcel.lab9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class Controller extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Calculator");

        GridPane mainGrid = new GridPane();

        TextField numOne = new TextField();
        TextField numTwo = new TextField();
        TextField result = new TextField();

        Button div = new Button("Division");

        int gap = 10;
        int padding = 15;
        int numOfColumns = 5;
        int numOfRows = 3;

        numOne.setPromptText("First number");
        numTwo.setPromptText("Second number");

        result.setPromptText("Result");
        result.setEditable(false);

        mainGrid.setAlignment(Pos.CENTER);
        mainGrid.setHgap(gap);
        mainGrid.setVgap(gap);
        mainGrid.setPadding(new Insets(padding, padding, padding, padding));

        for (int i = 0; i < numOfColumns; i++) {
            mainGrid.getColumnConstraints().add(new ColumnConstraints());
            mainGrid.getColumnConstraints().get(i).setPercentWidth(24);
            mainGrid.getColumnConstraints().get(i).setHgrow(Priority.SOMETIMES);
        }

        for (int i = 0; i < numOfRows; i++) {
            mainGrid.getRowConstraints().add(new RowConstraints());
            mainGrid.getRowConstraints().get(i).setPercentHeight(7);
            mainGrid.getRowConstraints().get(i).setVgrow(Priority.SOMETIMES);
        }
        mainGrid.getRowConstraints().get(2).setPercentHeight(20);

        mainGrid.add(numOne, 0, 0, 2, 1);
        mainGrid.add(numTwo, 3, 0, 2, 1);
        mainGrid.add(result, 1, 2, 3, 1);

        mainGrid.add(div, 2, 1);

        Calculator.actionChecker(numOne, numTwo, result, div);

        Scene scene = new Scene(mainGrid, 400, 400);
        stage.setScene(scene);
        stage.show();
    }

}