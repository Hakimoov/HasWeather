package org.example;

import org.example.models.CurrentWeather;
import org.example.service.WeatherService;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class WeatherBot extends TelegramLongPollingBot {

    private static final String BOT_USERNAME = "YourBotUsername";
    private static final String BOT_TOKEN = "YourBotToken";

    @Override
    public void onUpdateReceived(Update update) {
        // Process incoming updates here
    }

    @Override
    public String getBotUsername() {
        return BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    public void startBot() {
        try {
            execute(this);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


}