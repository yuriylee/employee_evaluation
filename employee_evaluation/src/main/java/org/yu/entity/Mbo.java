package org.yu.entity;

import javax.persistence.*;

/**
 * Created by jokernoel on 25.03.18.
 */
@Entity
@Table
public class Mbo {

    @Id
    @SequenceGenerator(name = "mbo_id_seq", sequenceName = "mbo_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "mbo_id_seq", strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "description_by_approver")
    private String descriptionByApprover;
    @OneToOne
    @JoinColumn(name = "owner_id")
    private User owner;
    @ManyToOne
    @JoinColumn(name = "approver_id")
    private User approver;
    @Column(name = "planned_score")
    private Double plannedScore;
    @Column(name = "final_score")
    private Double finalScore;
    @Column
    private Boolean confirmed = false;
}
