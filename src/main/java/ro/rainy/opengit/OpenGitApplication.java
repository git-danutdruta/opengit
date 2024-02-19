package ro.rainy.opengit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ro.rainy.opengit.component.AppInfo;

import java.io.IOException;
import java.util.Objects;

@SpringBootApplication
public class OpenGitApplication extends Application {
    public static final String OPENGIT_VIEW_FXML = "view/opengit-view.fxml";

    @Override
    public void start(Stage stage) throws IOException {
        ConfigurableApplicationContext context = SpringApplication.run(OpenGitApplication.class);
        FXMLLoader fxmlLoader = new FXMLLoader(OpenGitApplication.class.getResource(OPENGIT_VIEW_FXML));

        AppInfo appInfo = context.getBean(AppInfo.class);

        Scene scene = new Scene(fxmlLoader.load(), appInfo.getWidth(), appInfo.getHeight());
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style/opengit.css")).toExternalForm());

        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResource("img/opengit_logo.png")).toExternalForm()));
        stage.setTitle(appInfo.getTitle());
        stage.setMinWidth(600);
        stage.setMinHeight(400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}