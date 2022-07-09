package com.masc.external_api.entities;

public class Advice {

    private Slip slip;


    public Advice() {
    }

    public Advice(Slip slip) {
        this.slip = slip;
    }


    public Slip getSlip() {
        return slip;
    }

    public void setSlip(Slip slip) {
        this.slip = slip;
    }

}
