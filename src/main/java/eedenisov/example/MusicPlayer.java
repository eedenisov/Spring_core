package eedenisov.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import java.util.Random;

/**
 * @author eedenisov
 */
@Component
@Scope("prototype")
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private final RockMusic rockMusic;
    private final ClassicalMusic classicalMusic;
    private final Random random;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") RockMusic rockMusic,
                       @Qualifier("classicalMusic") ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;

        random = new Random();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    public void playMusic(GenresOfMusic genre) {
        int randomNumber = random.nextInt(3);

        if (genre == GenresOfMusic.GENRE_CLASSICAL) {
            System.out.println("Playing classical music: " + classicalMusic.getSong().get(randomNumber));
        } else {
            System.out.println("Playing rock music: " + rockMusic.getSong().get(randomNumber));
        }
    }
}
