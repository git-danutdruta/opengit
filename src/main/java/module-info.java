module ro.rainy.opengit {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens ro.rainy.opengit to javafx.fxml;
    exports ro.rainy.opengit;
    exports ro.rainy.opengit.controller;
    opens ro.rainy.opengit.controller to javafx.fxml;
}