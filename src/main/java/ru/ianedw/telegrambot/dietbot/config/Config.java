package ru.ianedw.telegrambot.dietbot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class Config {
    private final Environment environment;

    @Autowired
    public Config(Environment environment) {
        this.environment = environment;
    }

    public String getName() {
        return environment.getProperty("bot.name");
    }

    public String getToken() {
        return environment.getProperty("bot.token");
    }
}
