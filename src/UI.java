import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UI extends Application {

    private Pane root;
    private Scene scene;
    private Label lblHeader;
    private TextField username, book;
    private Button btnRentNow;
    @Override
    public void start(Stage primaryStage) throws Exception {

        root = new Pane();
        scene = new Scene(root, 800, 800);

        lblHeader = new Label("Rent A Book");
        lblHeader.setStyle("-fx-font-size: 40");
        lblHeader.setLayoutX(300);
        lblHeader.setLayoutY(40);

        username = new TextField("Enter your username");
        username.setStyle("-fx-font-size: 20");
        username.setLayoutX(280);
        username.setLayoutY(150);

        book = new TextField("Enter name of the book");
        book.setStyle("-fx-font-size: 20");
        book.setLayoutX(280);
        book.setLayoutY(200);


        root.getChildren().addAll(lblHeader, username, book);

        primaryStage.setTitle("Rent Book");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
