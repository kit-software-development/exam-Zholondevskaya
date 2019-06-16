package com.zholondevskaya.weatherbot.services;

/**
 * Сервис уведомлений пользователей телеграма о изменении погодных условий.
 *
 */
public interface NotificationService {
    /**
     * Метод, выполняющий бизнес логику сервиса уведомлений
     */
    void loop();

    /**
     * Метод, который прерывает работы сервиса умедомлений
     */
    void interrupt();
}
