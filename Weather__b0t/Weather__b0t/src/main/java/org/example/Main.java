package org.example;

import org.example.service.IconService;
import org.example.service.IconServiceImpl;
import org.example.service.WeatherService;
import org.example.service.WeatherServiceImpl;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherServiceImpl();
        IconService iconService = new IconServiceImpl();

        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            WeatherBot weatherBot = new WeatherBot("5826226117:AAHRLWLo_A4EQmM3LMZ9QbZm1zrV2PkGyJU",
                    weatherService, iconService);

            telegramBotsApi.registerBot(weatherBot);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}