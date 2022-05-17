package branch;

public class branch_alpha {
    String name,id;
    float cgpa;
    int number;

    public branch_alpha(String name, String id, float cgpa, int number) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
