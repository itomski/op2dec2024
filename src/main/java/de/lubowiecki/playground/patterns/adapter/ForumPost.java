package de.lubowiecki.playground.patterns.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForumPost {

    private final String author;
    private final String group;
    private final String subject;
    private final String content;
    private final List<String> tags = new ArrayList<>();

    public ForumPost(String author, String group, String subject, String content) {
        this.author = author;
        this.group = group;
        this.subject = subject;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public String getGroup() {
        return group;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public List<String> getTags() {
        return tags;
    }

    public void addTag(String... tags) {
        this.tags.addAll(Arrays.asList(tags));
    }

    public void post() {
        System.out.println("----- POST -----");
        System.out.println("----- START");
        System.out.printf("----- AUTHOR: \t%s \n", author);
        System.out.printf("----- SUBJECT: \t%s \n", subject);
        System.out.printf("----- CONTENT: \t%s \n", content);
        System.out.printf("----- GROUP: \t%s \n", group);
        System.out.printf("----- TAGS: \t%s \n", tags.stream().reduce("", (s1, s2) -> s1 + "#" + s2 + ", "));
        System.out.println("----- END");
    }
}
