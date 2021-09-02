import com.usian.qiao.entity.A;

public class Test {
    public static void main(String[] args) {
        com.usian.qiao.entity.A.A a = new A.A();
        a.setName("李四");
        a.setAge("110");
        System.out.println(a);
        System.out.println(a.toString());
    }
}
