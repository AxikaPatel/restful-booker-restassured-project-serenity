package com.restful.booker.bookinginfo;

import com.restful.booker.model.BookingDatePojo;
import com.restful.booker.testbase.TestBaseBooking;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;

import java.util.Date;

//@Concurrent(threads = "4x")
//@UseTestDataFrom("src/test/java/resources/testdata/booking.csv")
//@RunWith(SerenityParameterizedRunner.class)
public class CreateUserDataDrivenTest extends TestBaseBooking
{

    private String firstname;
    private String lastname;
    private int totalprice;
    private Boolean depositpaid;

    private BookingDatePojo bookingdates;
    private Date checkin;
    private Date checkout;
    private String additionalneeds;


    @Steps
    BookingSteps bookingSteps;

    @Title("Data driven test for adding multiple booking ")
    @Test
    public void createMultipleBookings() {

        BookingDatePojo bookingDates = new BookingDatePojo();
        bookingDates.setCheckin(checkin);
        bookingDates.setCheckout(checkout);
        ValidatableResponse response = bookingSteps.createBooking(firstname, lastname, totalprice, depositpaid, bookingDates, additionalneeds);
    }

}

