package pl.sobocinska.BusyBooks.statusTask;

import javax.persistence.*;

@Entity
@Table(name = "statusTasksDictionary")
public class StatusTaskDictionary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public StatusTaskDictionary() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
