package com.wangzhengbest.wiki.controller;

import com.wangzhengbest.wiki.domain.Ebook;
import com.wangzhengbest.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @className: EBookController
 * @description: TODO 类描述
 * @author: buer
 * @date: 2021/6/16
 **/
@RestController
@RequestMapping("/ebook")
public class EBookController {
    @Autowired
    private EbookService ebookService;

    @GetMapping("/list")
    public List<Ebook>
}
