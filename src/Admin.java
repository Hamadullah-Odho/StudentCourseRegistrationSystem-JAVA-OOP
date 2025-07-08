public abstract class Admin {
    protected String username;
    protected int pin;

    public abstract boolean login(String username , int pin);

}
