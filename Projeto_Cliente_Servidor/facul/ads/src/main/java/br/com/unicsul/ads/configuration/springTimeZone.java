package br.com.unicsul.ads.configuration;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import java.util.TimeZone;

@Configuration
public class springTimeZone {

    @PostConstruct
    public void timeZoneConfig() {

        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }
}

