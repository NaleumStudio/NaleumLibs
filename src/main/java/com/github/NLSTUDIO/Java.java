package com.github.NLSTUDIO;

public class Java {
    @FunctionalInterface
    public interface LoopInterface<T> {
        void execute(T param);
    }

    public static void loop(LoopInterface<Integer> function, int times) {
        for (int i = 0; i < times; i++) {
            function.execute(i);
        }
    }
}

