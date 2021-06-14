package cn.yzd3008.geektools.listener;

import cn.yzd3008.geektools.server.GeekServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ApplicationReadyEventListener {

    @Autowired
    private GeekServer server;

    @EventListener(ApplicationReadyEvent.class)
    public void startGeekServer(){
        log.debug("=== Application is ready");
        server.run();
    }
}
