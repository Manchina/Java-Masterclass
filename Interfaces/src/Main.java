public class Main {
    public static void main(String[] args) {
          ITelephone premsPhone;
          premsPhone = new DeskPhone(123456);
          premsPhone.powerOn();
          premsPhone.callPhone(123456);
          premsPhone.answer();

          premsPhone = new MobilePhone(24565);
          premsPhone.powerOn();
          premsPhone.callPhone(24565);
          premsPhone.answer();
    }
}