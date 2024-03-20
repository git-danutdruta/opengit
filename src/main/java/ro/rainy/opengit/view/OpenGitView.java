package ro.rainy.opengit.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import lombok.Getter;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
@Getter
@Component
public class OpenGitView {
    private VBox topLayer;
    @PostConstruct
    public void buildUi() {
        HBox buttons = buttons();
        this.topLayer = new VBox(buttons);
        this.topLayer.setSpacing(10.0);
        this.topLayer.setAlignment(Pos.TOP_CENTER);
    }

    private HBox buttons() {
        Button fetchBtn = new Button("Fetch");
        fetchBtn.setContentDisplay(ContentDisplay.TOP);
        ImageView fetchImageView = new ImageView(getClass().getResource("/ro/rainy/opengit/img/fetch.png").toExternalForm());
        fetchImageView.setFitHeight(35.0);
        fetchImageView.setFitWidth(35.0);
        fetchImageView.setPickOnBounds(true);
        fetchImageView.setPreserveRatio(true);
        fetchBtn.setGraphic(fetchImageView);

        Button pullBtn = new Button("Pull");
        pullBtn.setContentDisplay(ContentDisplay.TOP);
        ImageView pullImageView = new ImageView(getClass().getResource("/ro/rainy/opengit/img/pull.png").toExternalForm());
        pullImageView.setFitHeight(35.0);
        pullImageView.setFitWidth(35.0);
        pullImageView.setPickOnBounds(true);
        pullImageView.setPreserveRatio(true);
        pullBtn.setGraphic(pullImageView);

        Button pushBtn = new Button("Push");
        pushBtn.setContentDisplay(ContentDisplay.TOP);
        ImageView pushImageView = new ImageView(getClass().getResource("/ro/rainy/opengit/img/push.png").toExternalForm());
        pushImageView.setFitHeight(35.0);
        pushImageView.setFitWidth(35.0);
        pushImageView.setPickOnBounds(true);
        pushImageView.setPreserveRatio(true);
        pushBtn.setGraphic(pushImageView);

        Region child = new Region();
        HBox.setHgrow(child,Priority.ALWAYS);

        Button settingBtn = new Button("Settings");
        settingBtn.setContentDisplay(ContentDisplay.TOP);
        ImageView settingImageView = new ImageView(getClass().getResource("/ro/rainy/opengit/img/setting.png").toExternalForm());
        settingImageView.setFitHeight(35.0);
        settingImageView.setFitWidth(35.0);
        settingImageView.setPickOnBounds(true);
        settingImageView.setPreserveRatio(true);
        settingBtn.setGraphic(settingImageView);


        HBox hBox = new HBox(fetchBtn, pullBtn, pushBtn, child, settingBtn);
        hBox.getStyleClass().addAll("navbar", "debug");
        hBox.setSpacing(10.0);


        return hBox;
    }
}