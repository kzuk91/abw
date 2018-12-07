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
@Table(name = "endpoints")
public class Endpoint implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name="autoGen", strategy="increment")
    @GeneratedValue(generator="autoGen")
    @Column(name = "endpoint_id")
    private int endpointId;

    @NonNull
    @Size(max = 50)
    @Column(name = "name", length = 50)
    private String name;

    @NonNull
    @Column(name = "description")
    private String description;

    @NonNull
    @Size(max = 150)
    @Column(name = "address", length = 150)
    private String address;

    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate = new Date();

    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified_date")
    private Date modifiedDate = new Date();

    @OneToMany(cascade = CascadeType.PERSIST,
            fetch = FetchType.LAZY,
            mappedBy = "endpoint")
    private List<Fact> facts = new ArrayList<>();
}