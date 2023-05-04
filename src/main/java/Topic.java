import java.util.ArrayList;
import java.util.List;

public class Topic extends  Post{
    private String title;
    private TopicKind type;
    private List<Comment> comments;

    public List<Comment> getComments() {
        return comments;
    }

    public String getTitle() {
        return title;
    }

    public Topic(String message, String title, TopicKind type) {
        super(message);
        this.title=title;
        this.type=type;
        this.comments= new ArrayList<>();
    }

    public List<Comment> getModeratedComment(){
        List<Comment> moderatedComments= new ArrayList<>();
        for (int i = 0; i < comments.size(); i++) {
            if(comments.get(i).isModerated()){
                moderatedComments.add(comments.get(i));
            }
        }
        return moderatedComments;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }
}
