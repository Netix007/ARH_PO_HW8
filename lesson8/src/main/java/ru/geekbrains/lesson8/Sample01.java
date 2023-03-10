package ru.geekbrains.lesson8;

import ru.geekbrains.lesson8.MVP.models.BookingModel;
import ru.geekbrains.lesson8.MVP.presenters.BookingPresenter;
import ru.geekbrains.lesson8.MVP.views.BookingView;

import java.util.Date;

public class Sample01 {

    public static void main(String[] args) {
        BookingModel bookingModel = new BookingModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingModel, bookingView);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        bookingView.reservationTable(new Date(), 5, "Станислав");
        bookingView.reservationTable(new Date(), 3, "Александр");
        bookingView.reservationTable(new Date(), 4, "Станислав");
        bookingView.changeReservationTable(1, new Date(), 3, "Николай");

    }

}
