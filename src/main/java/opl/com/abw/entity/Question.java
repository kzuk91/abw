package opl.com.abw.entity;

import lombok.*;
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
@Table(name = "questions")
public class Question implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name="autoGen", strategy="increment")
    @GeneratedValue(generator="autoGen")
    @Column(name = "question_id")
    private int questionId;

    @NonNull
    @Size(max = 50)
    @Column(name = "name", length = 50)
    private String name;

    @NonNull
    @Size(max = 150)
    @Column(name = "positive_value", length = 150)
    private String positiveValue;

    @NonNull
    @Size(max = 150)
    @Column(name = "negative_value", length = 150)
    private String negativeValue;

    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate = new Date();

    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified_date")
    private Date modifiedDate = new Date();

    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "question")
    private Condition conditions;
}
