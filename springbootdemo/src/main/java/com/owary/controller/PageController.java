package com.owary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {

	@RequestMapping("/hello")
	public String hello(Model model){
		model.addAttribute("title", "Owaryman");
		model.addAttribute("header1", "Who is Batman?");
		model.addAttribute("lower1", "He's the greatest detective ever");
		model.addAttribute("header2", "Little Bit About The Caped Crusader");
		model.addAttribute("lower2", "In early 1939, the success of Superman in "
				+ "Action Comics prompted editors at National Comics Publications (the future DC Comics) "
				+ "to request more superheroes for its titles. "
				+ "In response, Bob Kane created \"the Bat-Man\" "
						+ "Collaborator Bill Finger recalled that \"Kane had an idea for a character called 'Batman,' and "
						+ "he'd like me to see the drawings. I went over to Kane's, and he had drawn a character who "
						+ "looked very much like Superman with kind of ... reddish tights, I believe, with boots ... "
						+ "no gloves, no gauntlets ... with a small domino mask, swinging on a rope. He had two "
						+ "stiff wings that were sticking out, looking like bat wings. And under it was a big sign ... "
						+ "\"BATMAN\". The bat-wing-like cape was suggested by Bob Kane, inspired by "
								+ "Leonardo Da Vinci's sketch of an ornithopter flying device as a child.");
		model.addAttribute("location", "Where can he be?");
		return "portfolio/index";
	}
	
}
