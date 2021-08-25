package ru.basepatterns.behavioral.strategy;

/**
 * Class DeveloperRunner
 *
 * @author Kseniya Dergunova
 * @since 25.08.2021
 */
public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
