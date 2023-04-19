package com.training.cassandra.optional;


import java.util.Optional;

public class Soundcard {
    private Optional<USB> usb;

    public Soundcard(USB usb) {
        this.usb = Optional.ofNullable(usb);
    }


    public String getUSB() {
        return this.usb.get().getVersion();
    }

}