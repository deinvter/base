package cn.aijson.datacenter.base.service.impl;

import cn.aijson.datacenter.base.entity.User;
import cn.aijson.datacenter.base.mapper.UserMapper;
import cn.aijson.datacenter.base.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author cn.aijson.mart
 * @since 2019-08-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
