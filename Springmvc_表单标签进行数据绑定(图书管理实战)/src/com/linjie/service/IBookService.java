package com.linjie.service;
/**
* @author ǳȻ 	xulinjie0105@gmail.com
* @version ����ʱ�䣺2018��5��31�� ����2:21:56
* �ӿ�
*/

import java.util.List;

import com.linjie.pojo.Book;
import com.linjie.pojo.Category;
public interface IBookService {
	List<Category> getAllCategories();	//��ȡ�������
	Category getCategory(int id);		//��ȡĳ�����
	List<Book> getAllBooks();			//��ȡ������
	Book save(Book book);				//����ĳ����
	Book update(Book book);				//����ĳ����
	Book get(long id);					//��ȡĳ����
	long getNextId();					//�����ʱ��ȡid(��ȡ�����һ�����id+1)
}
