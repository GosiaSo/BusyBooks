package pl.sobocinska.BusyBooks.statusInvoice;

import java.util.List;

public interface StatusInvoiceService {
    List<StatusInvoiceDictionary> findStatus();
    StatusInvoiceDictionary findStatusById(Long id);
//    void createStatus(StatusInvoiceDictionary statusInvoiceDictionary);
//    void editStatus(StatusInvoiceDictionary statusInvoiceDictionary);
}
