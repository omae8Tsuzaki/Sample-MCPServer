package com.mcp.Sample_MCPServer;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
public class WeatherService {

    private final Random random = new Random();

    /**
     * <p>適当な天気の情報を返します。</p>
     *
     * @param place 場所
     * @return 天気情報
     */
    @Tool(description = "与えられた場所の天気の情報を取得します。")
    public String getWeather(String place) {
        var weathers = List.of("晴れ","晴れ", "雨", "曇り","曇り", "雪");
        return weathers.get(random.nextInt(weathers.size()));
    }

    /**
     * <p>現在時刻を返します。</p>
     *
     * @return 現在時刻
     */
    @Tool(description = "現在時刻を返します")
    public String getTime() {
        return LocalDateTime.now().toString();
    }


}
