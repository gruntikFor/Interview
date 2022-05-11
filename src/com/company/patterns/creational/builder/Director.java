package com.company.patterns.creational.builder;

public class Director {
    WebsiteBuilder websiteBuilder;

    public void setWebsiteBuilder(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    public Website buildWebsite() {
        websiteBuilder.createWebsite();
        websiteBuilder.setName();
        websiteBuilder.setCMS();
        websiteBuilder.setPrice();
        return websiteBuilder.getWebsite();
    }
}
