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
* @author 浅然 	xulinjie0105@gmail.com
* @version 创建时间：2018年5月31日 下午2:20:33
* 控制器
* 添加书、修改书、保存书、更新书、列出所有书
*/
@Controller
public class BookController {
	
	@Autowired(required=true)
	private IBookService iBookService;
	
	//添加书
	@RequestMapping(value = "/book_input")
	public String inputBook(Model model) {
		List<Category> categories = iBookService.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("book",new Book());
		return "BookAddForm";
	}
	
	//修改书
	@RequestMapping(value = "/book_edit/{id}")
	public String editBook(Model model,@PathVariable long id) {
		List<Category> categories = iBookService.getAllCategories();
		model.addAttribute("categories",categories);
		Book book = iBookService.get(id);
		model.addAttribute("book",book);
		return "BookEditForm";	
	}
	
	//保存书
	@RequestMapping(value = "/book_save")
	public String saveBook(@ModelAttribute Book book) {
		Category category = iBookService.getCategory(book.getCategory().getId());
		book.setCategory(category);
		iBookService.save(book);
		return "redirect:/book_list";
	}
	
	//更新书
	@RequestMapping(value = "/book_update")
	public String updateBook(@ModelAttribute Book book) {
		Category category = iBookService.getCategory(book.getCategory().getId());
		book.setCategory(category);
		iBookService.update(book);
		return "redirect:/book_list";
	}
	
	//列出所有书
	@RequestMapping(value = "/book_list")
	public String listBooks(Model model) {
		List<Book> books = iBookService.getAllBooks();
		model.addAttribute("books",books);
		return "BookList";
	}
}
