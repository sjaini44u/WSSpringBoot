package com.cafews;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created with IntelliJ IDEA.
 * User: Saurabh Maina
 * Date: 13/9/17
 * Time: 12:45 AM
 * To change this template use File | Settings | File Templates.
 */

@Configuration
@EnableWebSocket
public class WebSocketConfiguratorClass implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

        registry.addHandler(webSocketHandler(), "/cafeSocket/");
        registry.addHandler(clientSocketHandler(), "/cafeClient");
    }

    @Bean
    public WebSocketHandler webSocketHandler(){
        return new CafeSocketHandler();
    }
    @Bean
    public WebSocketHandler clientSocketHandler(){
        return new CafeClientSocketHandler();
    }
}
