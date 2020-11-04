package com.labaik.vivification.domain;

import com.labaik.vivification.domain.user.Benefactor;
import com.labaik.vivification.domain.user.Poor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "HELPEVENT")
public class HelpEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double amount;
    private Date date;
    @OneToOne
    Poor poor;
    @OneToOne
    Benefactor benefactor;
}
