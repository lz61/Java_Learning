1.让我们把Java中的函数简单过一遍.

回忆: 请写一个python的函数,函数名任意,输出hello world到控制台并返回值1.



观察: python中函数的格式:

A.不一定要有返回值

B.不指定返回值类型

C.不指定参数列表中各个变量类型.



2.Java对程序员要求非常严格,因此在A,B,C三点上有改动.

在Java中,任何可实际执行的代码都要写在类里面.

Java函数的定义也要写在类里面.



实例:

```
static void test(){
	sout("Hello World!");
}
```

这里static的部分比较复杂,等我们讲完类之后回头讲为什么要赋"static".

简单来说,函数有两种类型,static类型和非static类型.在同一个类内,static类型的函数不能"调用"非"static"类型的函数.



A,B:关于函数返回值类型的要求:

也就是说函数的定义模板是这样的:

```
[可以不加static] [返回值类型] [函数名](){
	// do sth
	// 返回你该返回的内容,如果void则不返回.
}
```

注: 每个函数在执行完return语句之后,不会再执行任何内容.





例2: 设计一个函数,返回int类型值为1,并输出"It returns 1!"

```
static int test(){
	sout("It returns 1!");
	return 1;
}
```



强调: 函数语句中的sout与return的关系.



习题: 设计一个函数,返回String类型值为"1234",在main函数中调用并输出返回值.



C:在java中,参数列表中各个变量类型都需要指定.

回顾: 请写一个python的add函数,返回输入的两个数的和.



你会发现一个问题: python根本就不做变量检查!

导致这一段代码在运行的时候才会发现问题:

```
def add(x,y):
    return x + y

print(add(1,"1"))
```

编译是通过的!



但Java不可以.



Java:

创建带有多个变量的函数:

```
static int add(int x,int y){
	return x+y;
}
```

比起python,只是在申请变量的时候希望一起指定它的类型而已,so far so good.



D.习题:

### 基础题 1：无参数、返回 String

设计一个函数，无参数，返回字符串 `"1234"`（对应前文习题，可直接作为参考示例）。

```java
// 函数定义：返回String类型"1234"
static String getString() {
    return "1234";
}
```

### 基础题 2：带参数、返回 int

设计一个函数，接收两个`int`类型参数，返回它们的乘积。

```java
// 示例答案
static int multiply(int a, int b) {
    return a * b;
}
```

### 进阶题 1：多参数、返回 boolean

设计一个函数，接收三个`double`类型参数(默认都为正数)（分别表示三角形的三条边长），返回这三条边能否构成三角形（判断条件：任意两边之和大于第三边）。

提示: Java中有boolean类型的变量,值为True or False,代表真或假命题.

```java
// 示例答案
static boolean isTriangle(double a, double b, double c) {
    return (a + b > c) && (a + c > b) && (b + c > a);
}
```

### 进阶题 2：带数组参数、返回数组

设计一个函数，接收一个`int`数组参数，返回该数组中所有偶数组成的新数组（若没有偶数则返回空数组）。

提示: Java创建数组时,可以指定数组长度:

```
int[] [arrayName] = new int[arrayNumCount];
```

答案:

```java
// 示例答案
static int[] getEvenNumbers(int[] nums) {
    // 先统计偶数个数
    int count = 0;
    for (int num : nums) {
        if (num % 2 == 0) {
            count++;
        }
    }
    // 创建新数组并填充偶数
    int[] evens = new int[count];
    int index = 0;
    for (int num : nums) {
        if (num % 2 == 0) {
            evens[index++] = num;
```
