package springmaven;

public class Desktop implements DesktopInterface {
    @Override
    public void compile()
    {
        System.out.println("compile ... in desktop");
    }
}
