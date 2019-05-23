package example.com.service;

import example.com.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 212607215 on 5/17/2019.
 */
@Service
public class TopicService {

    private List<Topic > topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "Mango", "Fruit"),
            new Topic("2", "Carrot", "Vegetables"),
            new Topic("3", "Grapes", "Fruit")));

    public List<Topic> getTopics(){
        return topics;
    }

    public Topic getId(String id) {
        return topics.stream().filter(t -> t.getId().equals(id))
                .findFirst().get();
    }

    public void addTopic(Topic topic) {
        System.out.println(">>> Add");
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for(int i = 0; i < topics.size(); i++){
            if(topics.get(i).getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }

    }

    public void deletTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
