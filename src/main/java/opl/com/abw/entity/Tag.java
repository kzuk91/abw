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
@Table(name = "tags")
public class Tag implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name="autoGen", strategy="increment")
    @GeneratedValue(generator="autoGen")
    @Column(name = "tag_id")
    private int tagId;

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
            })
    @JoinTable(name = "tags_facts",
            joinColumns = {@JoinColumn(name = "tag_id")},
            inverseJoinColumns = {@JoinColumn(name = "fact_id")})
    private List<Fact> facts = new ArrayList<>();
}
