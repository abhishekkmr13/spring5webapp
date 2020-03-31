package guru.springframework.spring5webapp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.entity.Author;
import guru.springframework.spring5webapp.entity.Book;
import guru.springframework.spring5webapp.entity.Publisher;
import guru.springframework.spring5webapp.repo.AuthorRepo;
import guru.springframework.spring5webapp.repo.BookRepo;
import guru.springframework.spring5webapp.repo.PublisherRepo;

@Component
public class Bootstrap implements CommandLineRunner{

	
	private AuthorRepo authorRepo;
	private BookRepo bookRepo;
	private PublisherRepo publisherRepo;
	
	
	
	
	public Bootstrap(AuthorRepo authorRepo, BookRepo bookRepo) {
		super();
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
	}




	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Bootstrap started...");
		
		Author abhishek = new Author("Abhishek", "Kumar");
		Publisher publisher = new Publisher("Penguind","Mumbai","Mumbai","Maharashtra","410210");
		
		Book book = new Book("My Biography", "21315");
		abhishek.getBooks().add(book);
		book.getAuthors().add(abhishek);
		
		authorRepo.save(abhishek);
		bookRepo.save(book);
		publisherRepo.save(publisher);
		
		System.out.println("Total number of books : "+bookRepo.count());
		System.out.println("Total number of Publishers : "+publisherRepo.count());
	}

}
