public abstract class MathObject {
    private String description;

    public MathObject()
    {
        description = "default";
    }

    public MathObject(String des)
    {
        description = des;
    }

    public abstract int getDimension();
}
