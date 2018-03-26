package org.yu.entity;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

/**
 * Created by jokernoel on 25.03.18.
 */
@Entity
@Table(name = "described_activities")
public class DescribedActivity {

    @Id
    @SequenceGenerator(name = "described_activities_id_seq",
            sequenceName = "described_activities_id_seq",
            allocationSize = 1)
    @GeneratedValue(generator = "described_activities_id_seq", strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;
    @Column
    private String description;
    @Column
    private Double probability;
    @Column
    private Boolean passed = false;
    @Column
    private Boolean submitted = false;
    @Column(name = "evaluation_by_approver")
    private String evaluationByApprover;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public DescribedActivity() {
    }

    public DescribedActivity(Activity activity, String description, Double probability, User user) {
        this.activity = activity;
        this.description = description;
        this.probability = probability;
        this.user = user;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    public void setPassed(Boolean passed) {
        this.passed = passed;
    }

    public void setSubmitted(Boolean submitted) {
        this.submitted = submitted;
    }

    public void setEvaluationByApprover(String evaluationByApprover) {
        this.evaluationByApprover = evaluationByApprover;
    }

    public Activity getActivity() {
        return activity;
    }

    public String getDescription() {
        return description;
    }

    public Double getProbability() {
        return probability;
    }

    public Boolean getPassed() {
        return passed;
    }

    public Boolean getSubmitted() {
        return submitted;
    }

    public String getEvaluationByApprover() {
        return evaluationByApprover;
    }

    public User getUser() {
        return user;
    }
}
