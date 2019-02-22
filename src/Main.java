public class Main {

    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
       // Sender sender = sendFactory.produce("sms");
        Sender sender = sendFactory.produceMail();
        sender.send();

        //第三种 不用实例化，直接调用
        Sender sender2 = SendFactory2.produceSms();
        sender2.send();
    }
}
