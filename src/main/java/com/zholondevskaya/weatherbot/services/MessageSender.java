package com.zholondevskaya.weatherbot.services;

import org.jetbrains.annotations.NotNull;

public interface MessageSender {
    /**
     * Отправляет юзеру по user_id сообщение message
     * @param userId идентификатор пользователя
     * @param message отправляемое сообщение
     */
    void send(final long userId, @NotNull final String message);

    /**
     *  Запоминает юзера и его чат (для работы метода send)
     * @param userId идентификатор пользователя
     * @param chatId идентификатор чата, связанного с userId
     */
    void register(final long userId, final long chatId);
}
