package app;

import org.springframework.stereotype.Component;

public class Guitar implements Instrument {
    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("tyryryn tyryryn.");
    }
}
