public class Vector2 extends MathObject implements Cloneable{
    private int x;
    private int y;

    public Vector2(String des, int xCor, int yCor)
    {
        super(des);
        x = xCor;
        y = yCor;
    }

    public double magnitude()
    {
        int X = x*x;
        int Y = y*y;
        double mag = (double) X + Y;
        mag = Math.sqrt(mag);
        return mag;
    }

    public Vector2 add(Vector2 other)
    {
        int newX = this.x + other.x;
        int newY = this.y + other.y;
        Vector2 vector = new Vector2("sum vector", newX, newY);
        return vector;
    }

    public boolean isEqual(Vector2 other)
    {
        boolean equal = false;
        if(this.x == other.x && this.y == other.y)
        {
            equal = true;
        }
        return equal;
    }

    public String toString()
    {
        return "Vector - X:" + x + " Y:" + y;
    }

    public int getDimension()
    {
        return 2;
    }
}
