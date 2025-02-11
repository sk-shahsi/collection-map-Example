import java.util.HashMap;
import java.util.Map;

public class mapExample2 {
    public static void main(String[] args) {

        HashMap<student,String> has= new HashMap<>();
        student s1=new student(1,"aashish");
        student s2=new student(2,"ram");
        student s3=new student(1,"aashish");

        has.put(s1,"penter");
        has.put(s2,"enginner");
        has.put(s3,"engnner");
        System.out.println(has);
        for (Map.Entry<student, String> res : has.entrySet()) {

            System.out.println(res.getValue()+" : "+res.getKey());
        }

       

    }
}
class student{
    int id;
    String name;

    public student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
