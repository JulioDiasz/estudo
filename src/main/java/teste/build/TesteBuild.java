package teste.build;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class TesteBuild {


    @Value("${app.main}")
    private String appName;

    @Value("${app.version}")
    private Integer appVersion;

    @Value("${app.list}")
    private int[] appList;

    @PostConstruct
    public void imprimir() {
        System.out.println(appName);
        System.out.println(appVersion);
        System.out.println(Arrays.toString(appList));

    }
}

