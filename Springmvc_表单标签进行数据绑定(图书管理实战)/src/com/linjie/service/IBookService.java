package com.linjie.service;
/**
* @author 浅然 	xulinjie0105@gmail.com
* @version 创建时间：2018年5月31日 下午2:21:56
* 接口
*/

import java.util.List;

import com.linjie.pojo.Book;
import com.linjie.pojo.Category;
public interface IBookService {
	List<Category> getAllCategories();	//获取所有类别
	Category getCategory(int id);		//获取某个类别
	List<Book> getAllBooks();			//获取所有书
	Book save(Book book);				//保存某本书
	Book update(Book book);				//更新某本书
	Book get(long id);					//获取某本书
	long getNextId();					//添加书时获取id(获取到最后一本书的id+1)
}
