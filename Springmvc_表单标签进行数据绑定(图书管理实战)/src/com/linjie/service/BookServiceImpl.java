package com.linjie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.linjie.pojo.Book;
import com.linjie.pojo.Category;

/**
* @author 浅然 	xulinjie0105@gmail.com
* @version 创建时间：2018年5月31日 下午2:40:58
* IBookService接口实现类
* 初始化数据、获取所有书的类别、获取某个类别、获取所有书、获取某书、保存书、更新书、添加书时获取id(获取到最后一本书的id+1)
*/
@Service
public class BookServiceImpl implements IBookService{

	private List<Category> categories;		//书类别集合
	private List<Book> books;				//书的集合
	
	//初始化数据
	public BookServiceImpl(){
		//类别初始化
		categories = new ArrayList<Category>();
		Category category1 = new Category(1,"Computing");
		Category category2 = new Category(2,"Travel");
		Category category3 = new Category(3,"Health");
		categories.add(category1);
		categories.add(category2);
		categories.add(category3);
		
		//书本初始化
		books = new ArrayList<Book>();
		books.add(new Book(1L,"9780232231123",
				"Servlet & JSP:A Tutorial",
				category1,"Budi Kurniawan"));
		books.add(new Book(2L,"9780232234456",
				"Effective Java:A Tutorial",
				category1,"Joshua Bolch"));
	}
	
	//获取所有书的类别
	@Override
	public List<Category> getAllCategories() {
		return categories;
	}

	//获取某个类别
	@Override
	public Category getCategory(int id) {
		for(Category category : categories) {
			if(id == category.getId()) {
				return category;
			}
		}
		return null;
	}

	//获取所有书
	@Override
	public List<Book> getAllBooks() {
		return books;
	}

	//保存书
	@Override
	public Book save(Book book) {
		book.setId(getNextId());
		books.add(book);
		return book;
	}
	
	//获取某书
	@Override
	public Book get(long id) {
		for(Book book : books) {
			if(id == book.getId()) {
				return book;
			}
		}
		return null;
	}

	//更新书
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

	//添加书时获取id(获取到最后一本书的id+1)
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
