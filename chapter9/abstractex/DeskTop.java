package abstractex;

public class DeskTop extends Computer {

    @Override
    public void display() {
        System.out.println("Displaying DeskTop");
    }

    @Override
    public void typing() {
        System.out.println("Typing DeskTop");
    }
}
