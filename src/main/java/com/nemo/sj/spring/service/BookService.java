package com.nemo.sj.spring.service;

import com.nemo.sj.spring.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * create by Nemo
 * 2018/9/17  10:11
 */
@Service
public class BookService {
    @Qualifier("bookDao")
    @Autowired(required = false)
    BookDao bookDao;
}
