import java.util.ArrayList;
import java.util.List;

public class Forum {

    private static Forum instance = new Forum();
    private List<Topic> topics;

    Forum() {
        this.topics = new ArrayList<>();
    }
    public static Forum getInstance(){
        return instance;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void getEntireForum(){

        for (int i = 0; i < topics.size(); i++) {
            List<Comment> comments= topics.get(i).getModeratedComment();
            System.out.println(topics.get(i).getTitle());
            for (int j = 0; j < comments.size(); j++) {
                System.out.println(comments.get(j).getMessage());
            }
        }
    }

    public static void main(String[] args) {
        getInstance().getEntireForum();
    }


}
