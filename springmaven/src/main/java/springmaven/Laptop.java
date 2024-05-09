package springmaven;

public class Laptop implements DesktopInterface {
    public Laptop()
    {
        System.out.println("constructor");
    }
    @Override
    public void compile()
    {
        System.out.println("Compile... in laptop");
    }
}
