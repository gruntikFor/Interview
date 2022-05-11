package com.company.patterns.creational.builder;

public class MicrosoftWebsiteBuilder extends WebsiteBuilder {
    @Override
    void setName() {
        website.setName("Microsoft site here");
    }

    @Override
    void setCMS() {
        website.setCms(CMS.WORDPRESS);
    }

    @Override
    void setPrice() {
        website.setPrice(999999);
    }
}
