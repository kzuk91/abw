package opl.com.abw.entity;

import lombok.*;
import opl.com.abw.enums.ConditionEnum;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "conditions")
public class Condition implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name="autoGen", strategy="increment")
    @GeneratedValue(generator="autoGen")
    @Column(name = "condition_id")
    private int conditionId;

    @NonNull
    @Size(max = 50)
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @NonNull
    @Size(max = 150)
    @Column(name = "value")
    private String value;

    @NonNull
    @Size(max = 150)
    @Column(name = "comparator")
    private ConditionEnum comparator;

    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate = new Date();

    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified_date")
    private Date modifiedDate = new Date();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fact_id", nullable = false)
    private Fact fact;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;
}
