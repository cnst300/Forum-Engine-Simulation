public class Comment extends Post{
    private Topic topic;



    private boolean moderated;
    public Comment(String message, Topic topic) {
        super(message);
        this.topic = topic;
        this.moderated=false;
    }

    public boolean isModerated() {
        return moderated;
    }

    public void toggleModeration(){
        this.moderated=!moderated;
    }
}
