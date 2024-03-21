package bandeau;

/**
 * Un effet a pour responsabilité de savoir se jouer dans un bandeau. Optionnellement, un effet change le message
 * affiche avant de se jouer.
 */
public abstract class Effect {

    /**
     * Le message à afficher pour cet effet (si null, on ne change pas de message)
     */
    protected final String myMessage;

    public Effect(String message) {
        myMessage = message;
    }

<<<<<<< HEAD
    protected void init(Bandeau bandeau) {
=======
    protected void init(BandeauLock bandeau) {
>>>>>>> 312e0f2 (Final Commit)
        if (null != myMessage) {
            bandeau.setMessage(myMessage);
        }

    }

    /**
     * Jouer cet effet sur un bandeau
     */
<<<<<<< HEAD
    abstract public void playOn(Bandeau bandeau);
=======
    abstract public void playOn(BandeauLock bandeau);
>>>>>>> 312e0f2 (Final Commit)
}
