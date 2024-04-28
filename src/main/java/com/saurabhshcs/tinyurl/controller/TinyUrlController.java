package com.saurabhshcs.tinyurl.controller;

import com.saurabhshcs.tinyurl.document.TinyURL;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/url-shortner")
public class TinyUrlController {

    public TinyURL urlShortner(){

        return  null;
    }
}
