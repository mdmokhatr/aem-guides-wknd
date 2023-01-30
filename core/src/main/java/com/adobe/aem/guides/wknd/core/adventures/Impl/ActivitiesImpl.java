package com.adobe.aem.guides.wknd.core.adventures.Impl;

import java.util.Random;

import org.osgi.service.component.annotations.Component;

import com.adobe.aem.guides.wknd.core.adventures.Activities;

@Component(service = { Activities.class })
public class ActivitiesImpl implements Activities {
    private static final String[] ACTIVITIES = new String[] {
            "Camping", "Skiing", "Skateboarding"
    };

    // private final int randomIndex = new Random().nextInt(ACTIVITIES.length);
    // private final Random random = new Random();

    /**
     * @return the name of a random WKND adventure activity
     */
    public String getRandomActivity() {
        Random random = new Random();

        int value = random.nextInt(3);
        String str = ACTIVITIES[value];
        return str;
    }

}
