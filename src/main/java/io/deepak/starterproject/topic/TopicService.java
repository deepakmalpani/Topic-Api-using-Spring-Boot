package io.deepak.starterproject.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
		private ArrayList<Topic> topics=new ArrayList<Topic>(
				Arrays.asList(new Topic("1","Data Visualization","E1 SLOT"),
						new Topic("2","Web Mining","F1 SLOT")));
		public List<Topic> getAllTopics(){
			
			return topics;
		}
		public Topic getTopic(String id) {
			return (Topic) topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		}

		public void addTopic(Topic topic) {
			topics.add(topic);
		}
		public void updateTopic(String id, Topic topic) {
			for(int i=0;i<topics.size();i++) {
				Topic t=topics.get(i);
				if(t.getId().equals(id)) {
					topics.set(i, topic);
					return;
				}
			}
		}
		public void deleteTopic(String id) {
			for(int i=0;i<topics.size();i++) {
				Topic t=topics.get(i);
				if(t.getId().equals(id)) {
					topics.remove(i);
					return;
				}
			}
		}
}
