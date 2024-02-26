package ro.rainy.opengit.component;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class AppInfo {

    @Value("${app.version}")
    private String version;

    @Value("${app.title}")
    private String title;

    @Value("${app.java-version}")
    private String javaVersion;

    @Value("${app.view.width:900}")
    private long width;

    @Value("${app.view.height:600}")
    private long height;
}
