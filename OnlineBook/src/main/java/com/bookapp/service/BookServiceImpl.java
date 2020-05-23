package com.bookapp.service;

import java.util.List;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;
import com.bookapp.model.Book;

public class BookServiceImpl  implements BookService{
	BookDao bookdao=new BookDaoImpl();
	

	public BookServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookdao.addBook(book);
		
	}

	public boolean deleteBook(int bookid) throws BookNotFoundException {
		// TODO Auto-generated method stub
		bookdao.deleteBook(bookid);
		return false;
	}

	public Book getBookById(int bookid) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateBook(int bookid, int price) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Book> getAllBooks() {
		
		return bookdao.getAllBooks();
		
		
	}

	public List<Book> getBookbyAuthor(String author) throws AuthorNotFoundException {
		// TODO Auto-generated method stub
		return bookdao.getBookbyAuthor(author);
	}

	public List<Book> getBookbycategory(String category) throws CategoryNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
