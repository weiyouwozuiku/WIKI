package com.wangzhengbest.wiki.service;

import com.wangzhengbest.wiki.domain.Ebook;
import com.wangzhengbest.wiki.mapper.EbookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: EbookService
 * @description: TODO 类描述
 * @author: buer
 * @date: 2021/6/16
 **/

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByPrimaryKey(1L);
    }
}
