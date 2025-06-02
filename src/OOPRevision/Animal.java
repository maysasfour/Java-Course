package OOPRevision;

public abstract class Animal {
    private String Color,gender;
//    public abstract void  eat()
//    {
//
//    }
//    public  abstract void breath()
//    {
//
//    }

    public Animal(String color, String gender) {
        Color = color;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "OOPRevision.Animal{" +
                "Color='" + Color + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
