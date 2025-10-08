package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.controller.Topic;



@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1", "RAVIPRAKASH", "Person"),
			new Topic("2", "ROYAL ENFIELD", "Bike"), new Topic("3", "NEXA XL6", "Car")));

	// called by topic controller and returns topics which has been upside
	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public Topic deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		return null;
	}
}