import java.util.ArrayList;
import java.util.List;

public class Forum {

    private static Forum instance = new Forum();
    private static List<Topic> topics;

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
        Topic topic1= new Topic("Number1", "first", TopicKind.NEWS);
        Topic topic2= new Topic("Number2", "second", TopicKind.ANNOUNCEMENT);
        Topic topic3= new Topic("Number3", "third", TopicKind.NEWS);
        topics.add(topic1);
        topics.add(topic2);
        topics.add(topic3);
        Comment comment1= new Comment("Comment1", topic1);
        Comment comment2= new Comment("Comment2", topic2);
        Comment comment3= new Comment("Comment3", topic1);
        Comment comment4= new Comment("Comment4", topic3);
        comment1.toggleModeration();
        comment2.toggleModeration();
        comment3.toggleModeration();
        comment4.toggleModeration();
        topic1.addComment(comment1);
        topic1.addComment(comment3);
        topic2.addComment(comment2);
        topic3.addComment(comment4);

        getInstance().getEntireForum();
    }


}
