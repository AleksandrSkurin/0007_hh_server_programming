package com.example.friendlist.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.friendlist.domain.Friend;

@Controller
public class FriendController {
	private ArrayList<Friend> friends = new ArrayList<Friend>();

	FriendController() {
		// Lifelong friends
		friends.add(new Friend("John West"));
		friends.add(new Friend("Kate Bower"));
	}
	
	@RequestMapping(value = "/index")
	public String friendList(@RequestParam(value="friend") String fname,
							 Model model) {
		model.addAttribute("friend", new Friend(fname));
		model.addAttribute("friends", friends);
		return "index";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Friend friend,
					   String name,
					   Model model) {
		friend.setName(name);
		friends.add(friend);
		return "redirect:index?friend=" + name.toString();
    }    
}
