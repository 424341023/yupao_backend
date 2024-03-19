package com.java.yupaobackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.yupaobackend.model.domain.Tag;
import com.java.yupaobackend.service.TagService;
import com.java.yupaobackend.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author sunshine
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2024-03-19 16:43:57
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




