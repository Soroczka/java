package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.FacebookPublisher;
import com.kodilla.patterns.strategy.social.media.SnapchatPublisher;

public class Millennials extends User {
    public Millennials(String username) {
        super(username);
        this.socialPublisher = new FacebookPublisher();
    }
}
