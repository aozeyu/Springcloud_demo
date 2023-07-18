package br.com.temgi.hrworkr.resourses;

import br.com.temgi.hrworkr.entities.Worker;
import br.com.temgi.hrworkr.repositories.WorkerRepository;
import org.apache.catalina.loader.ResourceEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/worker")
public class WorkerResource {
  @Autowired
  private WorkerRepository repository;
  @GetMapping
  public ResponseEntity<List<Worker>> findAll() {
    List<Worker> list = repository.findAll();
    return ResponseEntity.ok(list);
  }
  @GetMapping(value = "/{id}")
  public ResponseEntity<Worker> findById(@PathVariable Long id) {
    Worker obj = repository.findById(id).get();
    return ResponseEntity.ok(obj);
  }
}
