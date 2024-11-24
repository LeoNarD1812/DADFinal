package com.example.mspago.entity;

import com.example.mspago.dto.InscriptionDto;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Pay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String payment_method;
    private String status;
    private Integer InscriptionId;
    @Transient
    private InscriptionDto inscriptionDto;
}
