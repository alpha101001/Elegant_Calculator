package branch;

public class branch_alpha {
    String name,id;
    float cgpa;
    branch_alpha(String n,String i,float cg){
        this.name=n;
        this.id=i;
        this.cgpa=cg;
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
