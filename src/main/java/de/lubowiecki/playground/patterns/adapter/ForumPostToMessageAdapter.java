package de.lubowiecki.playground.patterns.adapter;

// Adapter
public class ForumPostToMessageAdapter implements Message {

    private ForumPost forumPost;

    public ForumPostToMessageAdapter(ForumPost forumPost) {
        this.forumPost = forumPost;
    }

    @Override
    public void send() {
        forumPost.post();
    }
}
