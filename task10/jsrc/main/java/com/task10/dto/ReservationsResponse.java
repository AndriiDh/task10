package com.task10.dto;

import com.task10.entity.Reservations;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationsResponse {
    private ArrayList<Reservations> reservations;
}
