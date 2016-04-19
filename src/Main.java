import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    public void start (Stage primaryStage) throws Exception{
        primaryStage.setTitle("Application Title");

        button = new Button();
        button.setText("Click Me");
        button.setOnAction(e -> {
            if (e.getSource()==button)
            System.out.println("I am lambda!");
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
