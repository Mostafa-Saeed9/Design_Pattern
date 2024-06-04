package builderPattern;

public class BuilderPatternMain {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Osama", "Saeed")
                .age(30)
                .phone("0119785299")
                .address("el nassr St")
                .build();

        User user2 = new User.UserBuilder("Mostafa", "Saeed")
                .phone("01154345259")
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
