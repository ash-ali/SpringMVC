package com.linjie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.linjie.pojo.Book;
import com.linjie.pojo.Category;
import com.linjie.service.IBookService;

/**
* @author ǳȻ 	xulinjie0105@gmail.com
* @version ����ʱ�䣺2018��5��31�� ����2:20:33
* ������
* ����顢�޸��顢�����顢�����顢�г�������
*/
@Controller
public class BookController {
	
	@Autowired(required=true)
	private IBookService iBookService;
	
	//�����
	@RequestMapping(value = "/book_input")
	public String inputBook(Model model) {
		List<Category> categories = iBookService.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("book",new Book());
		return "BookAddForm";
	}
	
	//�޸���
	@RequestMapping(value = "/book_edit/{id}")
	public String editBook(Model model,@PathVariable long id) {
		List<Category> categories = iBookService.getAllCategories();
		model.addAttribute("categories",categories);
		Book book = iBookService.get(id);
		model.addAttribute("book",book);
		return "BookEditForm";	
	}
	
	//������
	@RequestMapping(value = "/book_save")
	public String saveBook(@ModelAttribute Book book) {
		Category category = iBookService.getCategory(book.getCategory().getId());
		book.setCategory(category);
		iBookService.save(book);
		return "redirect:/book_list";
	}
	
	//������
	@RequestMapping(value = "/book_update")
	public String updateBook(@ModelAttribute Book book) {
		Category category = iBookService.getCategory(book.getCategory().getId());
		book.setCategory(category);
		iBookService.update(book);
		return "redirect:/book_list";
	}
	
	//�г�������
	@RequestMapping(value = "/book_list")
	public String listBooks(Model model) {
		List<Book> books = iBookService.getAllBooks();
		model.addAttribute("books",books);
		return "BookList";
	}
}
