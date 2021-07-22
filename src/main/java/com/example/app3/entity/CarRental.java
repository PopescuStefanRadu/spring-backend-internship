package com.example.app3.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarRental {
    @Id
    private Long id;

    // TODO Fix ManyToOne JOIN FETCH
    @ManyToOne
    private Car car;

    @ManyToOne
    private User user;

    // TODO Determine Whether Two Date Ranges Overlap
    private LocalDate startDate; // pentru id=1 range(startDate, endDate) overlap
    private LocalDate endDate;
}
