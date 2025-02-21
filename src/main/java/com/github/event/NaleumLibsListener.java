package com.github.event;

import java.util.ArrayList;
import java.util.List;

public class NaleumLibsListener {
    private static final List<onNaleumLibsReload> listeners = new ArrayList<>();

    public static void onNaleumLibsReloadRegister(onNaleumLibsReload listener) {
        listeners.add(listener);
    }

    public static void onNaleumLibsReloadTrigger() {
        for (onNaleumLibsReload listener : listeners) {
            listener.onNaleumLibsReload();
        }
    }
}
