package eedenisov.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author eedenisov
 */
@Component
public class ClassicalMusic implements Music {
    private List<String> songs;

    public ClassicalMusic() {
        songs = new ArrayList<>();

        songs.add("Hungarian Rhapsody");
        songs.add("Wonderful life");
        songs.add("Shape of my heart");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
