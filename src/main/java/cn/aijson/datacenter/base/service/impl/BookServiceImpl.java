package cn.aijson.datacenter.base.service.impl;

import cn.aijson.datacenter.base.service.IBookService;
import cn.aijson.datacenter.base.entity.Book;
import cn.aijson.datacenter.base.mapper.BookMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cn.aijson.mart
 * @since 2019-05-23
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
