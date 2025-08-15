请在每段代码中附上测试,谢谢!

实例:

```
public class Test2{
    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("The sum is: " + result);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
```

输出15,即为测试成功.



### 基础题 1：无参数、返回 String

设计一个函数，无参数，返回字符串 `"1234"`（对应前文习题，可直接作为参考示例）。

```
public class Test{
	public static void main(String[] args){
		System.out.println(testFunc());
	}
	
	static String testFunc(){
		return "1234";
	}
}
```



### 基础题 2：带参数、返回 int

设计一个函数，接收两个`int`类型参数，返回它们的乘积。

```
public class Test {
    public static void main(String[] args) {
        System.out.println(testFunc(5,10));
    }

    static int testFunc(int a,int b){
        return a*b;
    }
}
```



### 进阶题 1：多参数、返回 Boolean

设计一个函数，接收三个`double`类型参数(默认都为正数).三个参数代表三角形的三条边长,返回这三条边能否构成三角形.

能则返回True,不能则返回False.

```
public class Test {
    public static void main(String[] args) {
        System.out.println(canTriangle(1, 2, 3));
        System.out.println(canTriangle(1, 2, 2.5));
    }

    static boolean canTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
```



提示1: Java中有boolean类型的变量,值为True or False,代表真或假命题.

提示2: Java中有double类型的变量,代表接收小数参数.

### 进阶题 2：带数组参数、返回数组

设计一个函数，接收一个`int`数组参数，返回该数组中所有偶数组成的新数组（若没有偶数则返回空数组）。

提示: Java创建数组时,可以指定数组长度:

```
int[] [arrayName] = new int[arrayNumCount];
```

实例:

```
int[] arr = new int[5]; //创建一个长度为5的数组
```

提示2: Java中的if:

```
if(condition){
	// do sth
}
```

和while的写法是完全一致的.
