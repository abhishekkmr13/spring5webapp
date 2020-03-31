package guru.springframework.spring5webapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.spring5webapp.entity.Publisher;

@Repository
public interface PublisherRepo extends CrudRepository<Publisher, Long>{

}
