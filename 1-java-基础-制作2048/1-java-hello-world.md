1.创建一个Test.java文件(注: 文件名请务必为Test.java!)



2.往文件里写如下代码:

```
public class Test{
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}
```

注: 注意第三行末尾的分号! 这是python转java的人经常犯的错误.



3.需要注意的点:

模板:

```
public class <fileName>{
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}
```



A.第一行中的public class 后面需要和文件名保持完全一致,大小写也不能漏.

即若文件名为Test.java,不能写成:

```
public class test // 大小写不一致!
```



B.第三行末尾需要加上分号!

对于Java来说,任何一行"可执行语句"后面都必须加上分号,这是java语法的惯例.比python麻烦很多.



C.目前的所有代码必须强制写在

```
	public static void main(String[] args){
		...
	}
```

里面. 原因会随着你对java学习的深入而理解,现在还不是时候.



D.在VScode编辑器中,如果希望"简单"输出System.out.println,则可以简写成"sout",很方便.



4.java基本语法格式:

A.单行注释:

```
// 添加注释
在每一行中,在//后面的内容自动无视,不管//出现在哪里.
实例:
System.out.println("Hello World!"); // System.out.println("Hello World!"); (没用)
```

B.多行注释:

```
/*
注释行1
注释行2
注释行3
*/
```

C. 任何编程语言的程序特性: 逐行执行代码.

java也不例外.
