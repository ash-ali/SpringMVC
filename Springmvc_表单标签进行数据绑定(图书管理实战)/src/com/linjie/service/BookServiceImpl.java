package com.linjie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.linjie.pojo.Book;
import com.linjie.pojo.Category;

/**
* @author ǳȻ 	xulinjie0105@gmail.com
* @version ����ʱ�䣺2018��5��31�� ����2:40:58
* IBookService�ӿ�ʵ����
* ��ʼ�����ݡ���ȡ���������𡢻�ȡĳ����𡢻�ȡ�����顢��ȡĳ�顢�����顢�����顢�����ʱ��ȡid(��ȡ�����һ�����id+1)
*/
@Service
public class BookServiceImpl implements IBookService{

	private List<Category> categories;		//����𼯺�
	private List<Book> books;				//��ļ���
	
	//��ʼ������
	public BookServiceImpl(){
		//����ʼ��
		categories = new ArrayList<Category>();
		Category category1 = new Category(1,"Computing");
		Category category2 = new Category(2,"Travel");
		Category category3 = new Category(3,"Health");
		categories.add(category1);
		categories.add(category2);
		categories.add(category3);
		
		//�鱾��ʼ��
		books = new ArrayList<Book>();
		books.add(new Book(1L,"9780232231123",
				"Servlet & JSP:A Tutorial",
				category1,"Budi Kurniawan"));
		books.add(new Book(2L,"9780232234456",
				"Effective Java:A Tutorial",
				category1,"Joshua Bolch"));
	}
	
	//��ȡ����������
	@Override
	public List<Category> getAllCategories() {
		return categories;
	}

	//��ȡĳ�����
	@Override
	public Category getCategory(int id) {
		for(Category category : categories) {
			if(id == category.getId()) {
				return category;
			}
		}
		return null;
	}

	//��ȡ������
	@Override
	public List<Book> getAllBooks() {
		return books;
	}

	//������
	@Override
	public Book save(Book book) {
		book.setId(getNextId());
		books.add(book);
		return book;
	}
	
	//��ȡĳ��
	@Override
	public Book get(long id) {
		for(Book book : books) {
			if(id == book.getId()) {
				return book;
			}
		}
		return null;
	}

	//������
	@Override
	public Book update(Book book) {
		int bookCount = books.size();
		for(int i = 0; i < bookCount; i++) {
			Book savedBook = books.get(i);
			if(savedBook.getId() == book.getId()) {
				books.set(i, book);
				return book;
			}
		}
		return book;
	}	

	//�����ʱ��ȡid(��ȡ�����һ�����id+1)
	@Override
	public long getNextId() {
		long id = 0L;
		for(Book book : books) {
			long bookId = book.getId();
			if(bookId > id) {
				id = bookId;
			}
		}
		return id + 1;
	}

}
