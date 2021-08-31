package Spring_Security.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "accesses")
public class Access {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
