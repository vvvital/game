package com.game.entity;

import com.game.controller.PlayerOrder;

import javax.persistence.Column;
import java.util.Date;

public class Player {

    @Column (name = "ID")
    private Long id;

    @Column(name = "NAME",length = 12)
    private String name;

    @Column(name = "TITLE",length = 30)
    private String title;

    @Column(name = "RACE")
    private Race race;

    @Column(name = "PROFESSION")
    private Profession profession;

    @Column(name = "EXPERIENCE",scale = 10000000)
    private Integer experience;

    @Column(name = "LEVEL")
    private Integer level;

    @Column(name = "UNTILNEXTLEVEL")
    private Integer untilNextLevel;

    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Column(name = "BANNED")
    private Boolean banned;

}
