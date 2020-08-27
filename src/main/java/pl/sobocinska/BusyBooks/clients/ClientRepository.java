package pl.sobocinska.BusyBooks.clients;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface ClientRepository extends JpaRepository <Client, Long> {
}
