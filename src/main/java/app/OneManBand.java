package app;

import java.util.Map;
import java.util.Properties;

import app.Instrument;
import app.PerformanceException;
import app.Performer;

public class OneManBand implements Performer {
    private Properties instruments;

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }

    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {
        for (Object key: instruments.keySet()){
            System.out.println(key+ ": ");
            Instrument instrument = (Instrument) instruments.get(key);
            instrument.play();
        }
    }
}
