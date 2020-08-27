package pl.sobocinska.BusyBooks.invoices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sobocinska.BusyBooks.statusInvoice.StatusInvoiceDictionary;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    List<Invoice> findByStatus (StatusInvoiceDictionary status);
}
