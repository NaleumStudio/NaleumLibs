package com.github;

import java.util.ArrayList;
import java.util.List;

interface NaleumLibsListener {
    void onNaleumLibsReload();
}

public class NaleumEventListener {
    private static final List<NaleumLibsListener> listeners = new ArrayList<>();

    public static void eventRegister(NaleumLibsListener listener) {
        listeners.add(listener);
    }

    public static void triggerNaleumLibsReload() {
        for (NaleumLibsListener listener : listeners) {
            listener.onNaleumLibsReload();
        }
    }
}
