package com.bvan.javaoop.lessons1_2.post;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Post {

    private final String author;
    private final String content;
    private long likes;
    private final ArrayList<String> comments = new ArrayList<>();

    public Post(String author, String content, long likes) {
        checkLikes(likes);

        this.author = author;
        this.content = content;
        this.likes = likes;
    }

    public Post(String author, String content) {
        this(author, content, 0);
    }

    private void checkLikes(long likes) {
        if (likes < 0) {
            throw new IllegalArgumentException("negative likes: " + likes);
        }
    }

    public void like() {
        likes++;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

//    public Post like() {
//        return new Post(author, content, likes + 1);
//    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public long getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                ", comments=" + comments +
                '}';
    }
}
