package com.example.demo.data;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="RESERVATION")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESERVATION_ID")
    private long ReservationId;

    public long getReservationId() {

        return ReservationId;
    }

    public void setReservationId(long reservationId) {

        ReservationId = reservationId;
    }

    @Column(name = "ROOM_ID")
    private long RoomId;
    @Column(name = "GUEST_ID")
    private long GuestId;
    @Column(name= "RES_DATE")
    private Date ReservationDate;

    public long getRoomId() {
        return RoomId;
    }

    public void setRoomId(long roomId) {
        RoomId = roomId;
    }

    public Long getGuestId() {
        return Long.valueOf(GuestId);
    }

    public void setGuestId(long guestId) {
        GuestId = guestId;
    }

    public Date getReservationDate() {
        return ReservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        ReservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "ReservationId=" + ReservationId +
                ", RoomId='" + RoomId + '\'' +
                ", GuestId='" + GuestId + '\'' +
                ", ReservationDate='" + ReservationDate + '\'' +
                '}';
    }

    public Reservation(Date reservationDate) {
        ReservationDate = reservationDate;
    }
}
