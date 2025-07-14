package com.github.event;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NaleumListener {
    private static final List<EventInterface> LISTENER = new CopyOnWriteArrayList<>();

    public static void register(EventInterface listener) {
        LISTENER.add(listener);
    }

    public static void triggerNaleumLibsReload() {
        for (EventInterface listener : LISTENER) {
            listener.onNaleumLibsReload();
        }
    }

    public static void triggerNaleumLibsDebug() {
        for (EventInterface listener : LISTENER) {
            listener.onNaleumLibsDebug();
        }
    }
}
