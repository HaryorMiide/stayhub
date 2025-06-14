package com.stayhub.Stayhub.service.interfac;

import com.stayhub.Stayhub.dto.Response;
import com.stayhub.Stayhub.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
