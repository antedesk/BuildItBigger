package it.antedesk.jokeslib;

public class JokeDispatcher {

    private final static String[] jokes = {
            "Why did the physics teacher break up with the biology teacher? There was no chemistry",
            "What do you call a bear with no teeth? A gummy bear!",
            "What do you call cheese that isn’t yours? Nacho cheese!",
            "Where do cows go for entertainment? To the moo-vies!",
            "Why did the man run around his bed? Because he was trying to catch up on his sleep!",
            "Can a kangaroo jump higher than the Empire State Building? Of course! The Empire State Building can’t jump!",
            "Why did the math book look so sad? Because it had so many problems!",
            "What do you get when you cross a snowman with a vampire? Frostbite!",
            "Why can’t you give Elsa a balloon? Because she will let it go!",
            "What did one wall say to the other wall? I’ll meet you at the corner!"
    };

    public static String dispatchJoke(){
        int jokeId = (int) (Math.random() * 10);
        return jokes[jokeId];
    }
}
