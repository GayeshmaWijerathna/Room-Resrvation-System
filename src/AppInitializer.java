import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AppInitializer extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Main.fxml"))));
        primaryStage.setTitle("Blue Ocean RRS");
        primaryStage.getIcons().add(new Image("/Images/ICON.png"));
        primaryStage.show();
    }

}
