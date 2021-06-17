package com.wangzhengbest.wiki.mapper;

import com.wangzhengbest.wiki.domain.Ebook;


/**
 * @className: EbookMapper
 * @description: TODO 类描述 
 * @author: buer
 * @date:  2021/6/14
 **/
public interface EbookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Ebook record);

    int insertSelective(Ebook record);

    Ebook selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Ebook record);

    int updateByPrimaryKey(Ebook record);
}