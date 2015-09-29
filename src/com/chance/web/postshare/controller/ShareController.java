package com.chance.web.postshare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chance.web.postshare.mode.Post;
import com.chance.web.postshare.tools.Constants;

@Controller
@RequestMapping("share/")
public class ShareController {
	@RequestMapping("/hello")
    public String hello(ModelMap model){
		Post post = new Post();
		post.setCode(5);
		model.addAttribute(Constants.RETURN_HELLO, post);
        return Constants.RETURN_HELLO;
    }
}
