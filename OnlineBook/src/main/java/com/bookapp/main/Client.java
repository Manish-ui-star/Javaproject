package com.bookapp.main;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Book book=new Book("Java","Balaguru","Tech",600.45,4);
		BookService service = new BookServiceImpl();
		//service.addBook(book);
		try {
			List<Book>bookList=service.getAllBooks();
			for(Book book:bookList)
			{
				System.out.println(book);
			}
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//service.getBookbyAuthor("Kathy");
				List<Book>bookList=service.getBookbyAuthor("Kathy");
				for(Book book:bookList)
				{
					System.out.println(book);
				}
		} catch (AuthorNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			service.deleteBook(3);
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
