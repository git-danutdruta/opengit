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
import ro.rainy.opengit.view.OpenGitView;

import java.io.*;
import java.util.Objects;

@SpringBootApplication
public class OpenGitApplication extends Application {
    private static final String OPENGIT_VIEW_FXML = "view/opengit-view.fxml";

    @Override
    public void start(Stage stage) throws IOException {
        ConfigurableApplicationContext context = SpringApplication.run(OpenGitApplication.class);
        FXMLLoader fxmlLoader = new FXMLLoader(OpenGitApplication.class.getResource(OPENGIT_VIEW_FXML));

        AppInfo appInfo = context.getBean(AppInfo.class);
        OpenGitView gitView = context.getBean(OpenGitView.class);

        Scene scene = new Scene(gitView.getTopLayer(), appInfo.getWidth(), appInfo.getHeight());
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

class Other {

    public static void main(String[] args) {
//        ProcessBuilder pb = new ProcessBuilder("git ","fetch", "origin");
        ProcessBuilder pb = new ProcessBuilder("git ","log","--all","--decorate", "--oneline","--graph");
        pb.directory(new File("E:\\Workspace\\opengit"));
        try {
            Process start = pb.start();
            InputStream is = start.getInputStream();
            LineNumberReader lnr = new LineNumberReader(new InputStreamReader(is));
            String line;
            while((line = lnr.readLine())!= null){
                System.out.println(line);
            }
            lnr.close();
            is.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class Test{
    public static void main(String[] args) {
         int a = 0x000F;
         int b = 0x2222;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a&b);
    }
}