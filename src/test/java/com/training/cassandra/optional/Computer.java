package com.training.cassandra.optional;

import java.util.Optional;

public class Computer {
    private Optional<Soundcard> soundcard;

    public Computer(Soundcard soundcard){
        this.soundcard = Optional.ofNullable(soundcard);
    }

    public String getSoundcard() {
        return this.soundcard.get().getUSB();
    }

}