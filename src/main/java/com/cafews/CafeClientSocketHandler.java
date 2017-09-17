package com.cafews;

import org.springframework.stereotype.Controller;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Saurabh Maina
 * Date: 17/9/17
 * Time: 2:02 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class CafeClientSocketHandler extends TextWebSocketHandler{

    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(this.getClass().getName());

    Map<String, WebSocketSession>  clientSessionMap = new HashMap<String, WebSocketSession>();

    @Override
    protected void handleTextMessage(org.springframework.web.socket.WebSocketSession session, TextMessage message) {
        logger.info("Message received");
        try{
                 session.sendMessage(message);
        }
        catch (Exception e){

        }
    }

    @Override
    public void afterConnectionEstablished(org.springframework.web.socket.WebSocketSession session) throws java.lang.Exception{
        logger.info("Session Connected");
        clientSessionMap.put(session.getId(), session);
    }
}
