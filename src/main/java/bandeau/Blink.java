package bandeau;

/**
 * Un effet qui clignote le texte une fois, avec un délai à specifier
 */
public class Blink extends Effect {

    private final int myDelay;

    public Blink(String message, int delay) {
        super(message);
        myDelay = delay;
    }

    @Override
<<<<<<< HEAD
    public void playOn(Bandeau bandeau) {
=======
    public void playOn(BandeauLock bandeau) {
>>>>>>> 312e0f2 (Final Commit)
        super.init(bandeau);
        String message = bandeau.getMessage();
        bandeau.setMessage("");
        bandeau.sleep(myDelay);
        bandeau.setMessage(message);
        bandeau.sleep(myDelay);
    }

}
