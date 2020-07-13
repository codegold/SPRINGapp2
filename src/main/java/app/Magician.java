package app;

public class Magician implements Performer {
    private String magicWords;
    private MagicBox magicBox;

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    public Magician() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println(magicWords);
        System.out.println("The magic box contains: ");
        System.out.println(magicBox.getContents());

    }
}
