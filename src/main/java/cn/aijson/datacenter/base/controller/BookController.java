package cn.aijson.datacenter.base.controller;


import cn.aijson.datacenter.base.entity.Book;
import cn.aijson.datacenter.base.service.IBookService;
import cn.aijson.datacenter.base.util.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cn.aijson.mart
 * @since 2019-05-23
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService bookService;
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Json addBook(@Valid @RequestBody Book book, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            String msg = bindingResult.getFieldError().getDefaultMessage();
            return Json.fail(msg);
        }
        bookService.insert(book);
        return Json.succ(book);

    }
}

