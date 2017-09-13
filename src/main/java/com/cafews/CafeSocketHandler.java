package com.cafews;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * Created with IntelliJ IDEA.
 * User: Saurabh Maina
 * Date: 13/9/17
 * Time: 12:46 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class CafeSocketHandler extends TextWebSocketHandler {

    Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    protected void handleBinaryMessage(org.springframework.web.socket.WebSocketSession session, org.springframework.web.socket.BinaryMessage message) {
        logger.info("Message received");
    }

    /*@RequestMapping({"/showData"})
    public String showData(String data){
        logger.info("Data Received "+ data);
        return data;
    }*/
}
