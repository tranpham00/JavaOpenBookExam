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

    public String getDescription()
    {
        return description;
    }

    public abstract int getDimension();
}
