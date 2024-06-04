package adapterPattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class adapterPatternMain {

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
        FriendCellPhone adaptee = new FriendCellPhone();
        CellPhone adapter = new CellPhoneAdapter(adaptee);
        adapter.call();
    }

}
