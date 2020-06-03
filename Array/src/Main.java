public class Main {
    public static void main(String[] args) {

        Array<Integer> integerArray = new Array<>();

        for (int i=0; i<10;i++)
            integerArray.addLast(i);
        System.out.println(integerArray);

        Array<Student> studentArray = new Array<>();

        studentArray.addLast(new Student("张三",18));
        studentArray.addLast(new Student("李四",20));
        studentArray.addLast(new Student("王五",22));

        System.out.println(studentArray);
    }
}
