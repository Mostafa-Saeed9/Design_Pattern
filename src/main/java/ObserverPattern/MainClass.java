package ObserverPattern;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        YoutubeChannel myChannel = new YoutubeChannel("MyChannel");

        Observer mostafa = new YoutubeSubscriber("mostafa");
        Observer saeed = new YoutubeSubscriber("saeed");
        Observer ahmed = new YoutubeSubscriber("ahmed");

        myChannel.addSubscriber(mostafa);
        myChannel.addSubscriber(saeed);
        myChannel.addSubscriber(ahmed);

        myChannel.notifyAllSubscribers(new YoutubeEvent(EventType.NEW_VIDEO, "Design patterns"));
        myChannel.removeSubscriber(ahmed);
        System.out.println();
        Thread.sleep(5000);
        myChannel.notifyAllSubscribers(new YoutubeEvent(EventType.LIVE_STREAM, "JAVA for beginners"));

    }
}
