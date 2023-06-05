package com.restful.booker.model;

import java.util.Date;

public class BookingDatePojo
{
    private Date checkin;
    private Date checkout;

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public static BookingDatePojo getBookingDates(Date checkin,Date checkout){
        BookingDatePojo bookingDates = new BookingDatePojo();
        bookingDates.setCheckin(checkin);
        bookingDates.setCheckout(checkout);
        return bookingDates;
    }

}
