package org.yu.entity;

import org.yu.util.ActivityType;

import javax.persistence.*;

/**
 * Created by jokernoel on 24.03.18.
 */
@Entity
@Table(name = "activities")
public class Activity {

    @Id
    @SequenceGenerator(name = "activities_id_seq", sequenceName = "activities_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "activities_id_seq", strategy = GenerationType.AUTO)
    private Long id;
    @Column
    @Enumerated(EnumType.STRING)
    private ActivityType type;
    @Column
    private String description;
    @Column
    private Double weight;



}
