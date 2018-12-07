package opl.com.abw.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "facts")
public class Fact implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name="autoGen", strategy="increment")
    @GeneratedValue(generator="autoGen")
    @Column(name = "fact_id")
    private int factId;

    @NonNull
    @Size(max = 50)
    @Column(name = "name", length = 50)
    private String name;

    @NonNull
    @Size(max = 150)
    @Column(name = "value", length = 150)
    private String value;

    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate = new Date();

    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified_date")
    private Date modifiedDate = new Date();

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "facts")
    private List<Tag> tags = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "endpoint_id", nullable = false)
    private Endpoint endpoint;

    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "fact")
    private Condition condition;
}
