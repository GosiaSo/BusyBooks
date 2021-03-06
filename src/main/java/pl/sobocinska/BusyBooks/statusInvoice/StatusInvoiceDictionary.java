package pl.sobocinska.BusyBooks.statusInvoice;

import javax.persistence.*;

@Entity
@Table(name = "statusInvoiceDictionary")
public class StatusInvoiceDictionary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public StatusInvoiceDictionary() {
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
