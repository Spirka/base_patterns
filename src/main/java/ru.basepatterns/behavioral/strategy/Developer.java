package ru.basepatterns.behavioral.strategy;

/**
 * Class Developer
 *
 * @author Kseniya Dergunova
 * @since 25.08.2021
 */
public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.jastDoIt();
    }
}
