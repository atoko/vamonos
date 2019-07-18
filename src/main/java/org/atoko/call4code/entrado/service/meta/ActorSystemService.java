package org.atoko.call4code.entrado.service.meta;

import akka.actor.ActorSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActorSystemService {
    @Autowired
    private ActorSystem actorSystem;

    public long uptime() {
        return actorSystem.uptime();
    }
}