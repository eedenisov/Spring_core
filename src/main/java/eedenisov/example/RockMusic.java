package eedenisov.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author eedenisov
 */
@Component
public class RockMusic implements Music {
    private List<String> songs;

    public RockMusic() {
        songs = new ArrayList<>();

        songs.add("We Will Rock You");
        songs.add("Seven Nation Army");
        songs.add("It's My life");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
