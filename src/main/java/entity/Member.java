package entity;
//회원(번호, 이름, 나이, 주소..............)
public class Member {
   private int num;
   private  String name;
   private int age;
   private String addr;
   public Member(){   }
   public Member(int num, String name, int age, String addr) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }
    // setter, getter
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    // toString()

    @Override
    public String toString() {
        return "Member{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }
}
