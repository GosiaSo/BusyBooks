package pl.sobocinska.BusyBooks.statusInvoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JpaStatusInvoiceService implements StatusInvoiceService {
    private final StatusInvoiceRepository repository;

    @Autowired
    public JpaStatusInvoiceService(StatusInvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<StatusInvoiceDictionary> findStatus() {
        return repository.findAll();
    }

    @Override
    public StatusInvoiceDictionary findStatusById(Long id) {
        return repository.getOne(id);
    }
}
