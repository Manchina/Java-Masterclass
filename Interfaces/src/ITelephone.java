public interface ITelephone {
    void powerOn();
    void dial(int phoneNUmber);
    void answer();
    boolean callPhone(int phoneNUmber);
    boolean isRinging();
}
