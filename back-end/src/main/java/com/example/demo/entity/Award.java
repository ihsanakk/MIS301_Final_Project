package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "awards")
public class Award {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int awardId;

    @Column(name = "image_url")
    private String awardImageUrl;

    @Column(name = "award_title")
    private String awardTitle;

    @Temporal(TemporalType.DATE)
    @Column(name = "award_date")
    private Date awardDate;
}
