package com.company.patterns.creational.builder;

public class TinyWebsiteBuilder extends WebsiteBuilder {
    @Override
    void setName() {
        website.setName("Tiny Website here");
    }

    @Override
    void setCMS() {
        website.setCms(CMS.TILDA);
    }

    @Override
    void setPrice() {
        website.setPrice(100);
    }
}
