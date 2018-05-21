package human;

public class Human {
    public static void main(String[] args) {
        HumanPriv humanPriv = new HumanPriv();
        humanPriv.setName("KRIS");
        humanPriv.setAge(45);
        humanPriv.setMale(true);
        humanPriv.setHeight(192);
        humanPriv.setWeight(120);

        System.out.println(humanPriv.getName());
        System.out.println(humanPriv.getAge());
        System.out.println(humanPriv.getMale());
        System.out.println(humanPriv.getHeight());
        System.out.println(humanPriv.getWeight());
    }
}
class HumanPriv {
    private int age;
    private double weight;
    private double height;
    private String name;
    private Boolean isMale;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }
}

