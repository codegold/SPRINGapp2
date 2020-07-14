package app;

import app.qualifiers.stringedInstrument;
import org.springframework.beans.factory.annotation.Autowired;

@Autowired
@stringedInstrument
public class Guitar implements Instrument {
    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("tyryryn tyryryn.");
    }
}
