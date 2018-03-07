package com.owary.faora.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owary.faora.domain.Dream;

@Service
public class DreamService {
	
	List<Dream> list;

	public DreamService() {
		list = new LinkedList<>();

		list.add(new Dream("Love", "resources/images/thumbs/01.jpg", "This is a Random number : "+new Random().nextInt()));
		list.add(new Dream("Study", "resources/images/thumbs/02.jpg", "This is a Random number : "+new Random().nextInt()));
		list.add(new Dream("Fly", "resources/images/thumbs/03.jpg", "This is a Random number : "+new Random().nextInt()));
		list.add(new Dream("Rap", "resources/images/thumbs/04.jpg", "This is a Random number : "+new Random().nextInt()));
		list.add(new Dream("Fight", "resources/images/thumbs/05.jpg", "This is a Random number : "+new Random().nextInt()));
		list.add(new Dream("Like", "resources/images/thumbs/06.jpg", "This is a Random number : "+new Random().nextInt()));
		list.add(new Dream("Live", "resources/images/thumbs/07.jpg", "This is a Random number : "+new Random().nextInt()));
		list.add(new Dream("Lead", "resources/images/thumbs/01.jpg", "This is a Random number : "+new Random().nextInt()));
		list.add(new Dream("Learn", "resources/images/thumbs/02.jpg", "This is a Random number : "+new Random().nextInt()));
		list.add(new Dream("Speak", "resources/images/thumbs/03.jpg", "This is a Random number : "+new Random().nextInt()));
		list.add(new Dream("Commit", "resources/images/thumbs/04.jpg", "This is a Random number : "+new Random().nextInt()));
		list.add(new Dream("Admire", "resources/images/thumbs/05.jpg", "This is a Random number : "+new Random().nextInt()));
		list.add(new Dream("Attract", "resources/images/thumbs/06.jpg", "This is a Random number : "+new Random().nextInt()));
		list.add(new Dream("Smile", "resources/images/thumbs/07.jpg", "This is a Random number : "+new Random().nextInt()));
	}

	public List<Dream> getAllDreams() {
		return list;
	}

	public List<List<Dream>> divideIntoFour(List<Dream> list) {
		List<List<Dream>> list_new = new LinkedList<>();

		int step = (list.size() / 4) + 1;

		for (int i = 0; i < list.size(); i += step) {
			int from = i;
			int to;
			if (i + step < list.size()) {
				to = i + step;
			} else {
				to = list.size();
			}
			list_new.add(list.subList(from, to));
		}

		return list_new;
	}
	
	public Dream getDream(Integer id){
		return list.get(id);
	}
	
	public Dream getRandomDream(){
		Integer random = new Random().nextInt(list.size());
		return list.get(random);
	}

}
