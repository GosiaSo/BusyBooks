package pl.sobocinska.BusyBooks.invoices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JpaInvoiceService implements InoviceService{
    private final InvoiceRepository repository;

    @Autowired
    public JpaInvoiceService(InvoiceRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Invoice> findInvoices() {
        return repository.findAll();
    }

    @Override
    public Invoice findInvoiceById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public void createInvoice(Invoice invoice) {
        repository.save(invoice);
    }

    @Override
    public void editInvoice(Invoice invoice) {
        repository.save(invoice);
    }

    @Override
    public void deleteInvoice(Long id) {
        repository.delete(repository.getOne(id));
    }
}
