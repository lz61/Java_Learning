public class Student {
    String id;
    String name;

    // 默认的构造函数,初始化函数
    // 不需要返回值,void
    Student(){
        id = "垃圾ID";
        name = "DefaultName";
    }

    Student(String student_id){
        id = student_id;
    }

    // "student_id",变量
    Student(String student_id,String student_name){
        id = student_id;
        name = student_name;
    }

    void chooseCourse(){
        
    }

    // 先创建一个Teacher类
    // 尝试撰写一个关于Teacher的初始化函数,你可以自定义teacher的默认名字和id,
    // 请在主程序创建一个Teacher类型的变量,并输出其名字和id.
}
