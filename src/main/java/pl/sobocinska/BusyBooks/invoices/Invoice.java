package pl.sobocinska.BusyBooks.invoices;

import pl.sobocinska.BusyBooks.clients.Client;
import pl.sobocinska.BusyBooks.statusInvoice.StatusInvoiceDictionary;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long invoiceNumber;
    @ManyToOne
    private Client client;
//    @DateTimeFormat
    @Future
    private LocalDate paymentDate;
    @Positive
    private double amount;
    @ManyToOne
    private StatusInvoiceDictionary status;

    public Invoice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public StatusInvoiceDictionary getStatus() {
        return status;
    }

    public void setStatus(StatusInvoiceDictionary status) {
        this.status = status;
    }
}
