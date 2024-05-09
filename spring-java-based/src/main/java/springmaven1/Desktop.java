package springmaven1;

public class Desktop implements ComputerInterface {
    public Desktop()
    {
        System.out.println("Desktop Contructor...");
    }
   public void compile()
    {
        System.out.println("Compile in desktop...");
    }
}
