package br.com.temgi.hrworkr.repositories;

import br.com.temgi.hrworkr.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker,Long> {
}
