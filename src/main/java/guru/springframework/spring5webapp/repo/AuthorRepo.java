package guru.springframework.spring5webapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.spring5webapp.entity.Author;

@Repository
public interface AuthorRepo extends CrudRepository<Author,Long>{

}
