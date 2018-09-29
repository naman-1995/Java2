class copy {
int x,y;

    public copy(int x, int y) {
        this.x = x;
        this.y = y;
    }
    copy(copy C)
    {
        x=C.x;
        y=C.y;
    }

}
public class java2_5
{
    public static void main(String[] args)
    {
        copy c=new copy(10,15);
        copy c1=new copy(c);
        System.out.println("Copied values from constructor= "+c1.x+" and "+ c1.y);
    }

}