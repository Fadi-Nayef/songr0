package com.songr.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class GreetingController {
    @GetMapping("/hello")
    public String helloWorld(@RequestParam(name = "name" , required = false,defaultValue = "Hello World")String name , Model model){
        return "comeback";

    }


            @GetMapping("/capitalize/hello")
	public String helloWorldCapitalize(){
		return "capitalize";
	}


	@ResponseBody
    @GetMapping("/album")
    public String getAlbum(){
        ArrayList<T> album = new ArrayList<T>();
        album.add()
        return ;
}
