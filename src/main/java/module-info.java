module ro.rainy.opengit {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;

    requires static lombok;

    opens ro.rainy.opengit to javafx.fxml, spring.core;
    opens ro.rainy.opengit.controller to javafx.fxml, spring.core;
    opens ro.rainy.opengit.component to spring.core;

    exports ro.rainy.opengit;
    exports ro.rainy.opengit.controller;
    exports ro.rainy.opengit.component;
}