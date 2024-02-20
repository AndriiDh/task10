package com.task10.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TablesRequest {
    private int id;
    private int number;
    private int places;
    private boolean isVip;
    private int minOrder;
}
