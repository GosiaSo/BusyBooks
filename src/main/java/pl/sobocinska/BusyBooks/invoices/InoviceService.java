package pl.sobocinska.BusyBooks.invoices;

import java.util.List;

public interface InoviceService {
    List<Invoice> findInvoices();
    Invoice findInvoiceById(Long id);
    void createInvoice(Invoice invoice);
    void editInvoice(Invoice invoice);
    void deleteInvoice(Long id);
}
