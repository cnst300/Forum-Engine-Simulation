import java.time.LocalDateTime;
import java.util.UUID;

abstract class Post {
    private UUID id;
    private LocalDateTime created;

    private String message;

    public String getMessage() {
        return message;
    }

    public Post(String message) {
        this.message = message;
        this.id= UUID.randomUUID();
        this.created= LocalDateTime.now();
    }
}
