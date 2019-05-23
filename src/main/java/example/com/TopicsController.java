package example.com;

import example.com.model.Topic;
import example.com.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 212607215 on 5/9/2019.
 */
@RestController
public class TopicsController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> callTopics(){
        return topicService.getTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getId(@PathVariable String id){
        return topicService.getId(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopics(@RequestBody Topic topic){
        System.out.println(">>> Topic id -: "+topic.getId());
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updatTopics(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(topic, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deletTopic(@PathVariable String id){
        topicService.deletTopic(id);
    }

}
