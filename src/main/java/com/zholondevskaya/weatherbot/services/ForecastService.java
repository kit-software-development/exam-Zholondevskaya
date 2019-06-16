package com.zholondevskaya.weatherbot.services;

import com.zholondevskaya.weatherbot.entity.ForecastData;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Сервис, предоставляющий информацию о прогнозах погоды
 */
public interface ForecastService {
    /**
     *
     * @param city город, прогноз погоды которого требуется
     * @return list of {@link ForecastData}
     */
    List<ForecastData> getForecastByCity(@NotNull final String city);
}
