package com.cst2335.cst2335_finalproject;

import java.util.Date;

public class Events {

    long id;
    String eventName;
    String startDate;
    double minPrice;
    double maxPrice;
    String ticketMasterURL;
    String imgURL;

    public Events(long id, String eventName, String startDate, double minPrice,
                  double maxPrice, String ticketMasterURL,String imgURL)
    {
        this.id=id;

        this.eventName=eventName;
        this.startDate=startDate;
        this.minPrice=minPrice;
        this.maxPrice=maxPrice;
        this.ticketMasterURL=ticketMasterURL;
        this.imgURL=imgURL;
    }

    public long getId(){return id;}
    public String getEventName(){return eventName;}
    public String getStartDate(){return startDate;}
    public double getMinPrice(){return minPrice;}
    public double getMaxPrice(){return maxPrice;}
    public String getTicketMasterURL(){return ticketMasterURL;}
    public String getImgURL(){return imgURL;}
}
