package eedenisov.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author eedenisov
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        //создание вручную
//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer rockmusicPlayer = new MusicPlayer(music);
//        rockmusicPlayer.playMusic();
//
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
//        classicalMusicPlayer.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("User: " + musicPlayer.getName());
        System.out.println("Volume: " + musicPlayer.getVolume());
        musicPlayer.playMusic(GenresOfMusic.GENRE_CLASSICAL);
        musicPlayer.playMusic(GenresOfMusic.GENRE_ROCK);

        context.close();
    }
}
