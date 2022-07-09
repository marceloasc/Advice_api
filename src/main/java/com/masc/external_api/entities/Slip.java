package com.masc.external_api.entities;

public class Slip {

    private Integer id;
    private String advice;


    public Slip() {
    }

    public Slip(Integer id, String advice) {
        this.id = id;
        this.advice = advice;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

}
