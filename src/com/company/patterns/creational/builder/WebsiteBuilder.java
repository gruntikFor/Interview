package com.company.patterns.creational.builder;

public abstract class WebsiteBuilder {
    Website website;

    public void createWebsite() {
        this.website = new Website();
    }

    abstract void setName();

    abstract void setCMS();

    abstract void setPrice();

    public Website getWebsite() {
        return website;
    }
}
