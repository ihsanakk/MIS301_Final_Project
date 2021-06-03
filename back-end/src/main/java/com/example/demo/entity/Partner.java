package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "partners")
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int partnerId;

    @Column(name = "img_url")
    private String partnerImageUrl;

    @Column(name = "partner_brand")
    private String partnerBrand;

    @Column(name = "partner_description")
    private String partnerDescription;
}
