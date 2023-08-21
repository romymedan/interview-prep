public class MyClass {
    public static void main(String[] args) {
        var myObject = new Class2("name1");
        var myObject2 = new Class2("name2");
        Class2.test = "hi";
    }
}

class Class2 {
    private String name;

    public static String test;
    public Class2(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}