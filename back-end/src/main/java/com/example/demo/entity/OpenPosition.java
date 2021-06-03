package com.example.demo.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "open_positions")
public class OpenPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int positionId;

    @Column(name = "image_url")
    private String positionImageUrl;

    @Column(name = "position_title")
    private String positionTitle;

    @Column(name = "position_description")
    private String positionDescription;
}
