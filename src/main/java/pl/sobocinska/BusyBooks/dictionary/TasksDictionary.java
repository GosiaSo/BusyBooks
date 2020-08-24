package pl.sobocinska.BusyBooks.dictionary;

import javax.persistence.*;

@Entity
@Table(name = "tasksDictionary")
public class TasksDictionary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public TasksDictionary() {
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
