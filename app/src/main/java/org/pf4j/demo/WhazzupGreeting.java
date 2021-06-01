package org.pf4j.demo;

import org.pf4j.Extension;
import org.pf4j.demo.api.Greeting;

@Extension
public class WhazzupGreeting implements Greeting {

    @Override
    public String getGreeting() {
        return "Whazzup";
    }

}
