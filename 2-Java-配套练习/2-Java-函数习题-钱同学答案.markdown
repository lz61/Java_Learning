### 基础题 1：无参数、返回 String

设计一个函数，无参数，返回字符串 `"1234"`（对应前文习题，可直接作为参考示例）。

```
public class test {
    public static void main(String[] args) {
        System.out.println(getString());
        }
        public static String getString() {
        return "1234";
        }

    }
```

输出1234,即为测试成功.

### 基础题 2：带参数、返回 int

设计一个函数，接收两个`int`类型参数，返回它们的乘积。

```
public class test {
    public static void main(String[] args) {
        System.out.println(product(3,5));
        }
        public static int product(int a, int b) {
            return a * b;
        }
    } 
```

输出15,即为测试成功.

### 进阶题 1：多参数、返回 boolean

设计一个函数，接收三个`double`类型参数(默认都为正数)（分别表示三角形的三条边长），返回这三条边能否构成三角形（判断条件：任意两边之和大于第三边）。

提示: Java中有boolean类型的变量,值为True or False,代表真或假命题.

```
public class test {
    public static void main(String[] args) {
        System.out.println(triangle(3, 4, 5));
        }
        public static boolean triangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    		}
    } 
```

输出true,即为测试成功.

### 进阶题 2：带数组参数、返回数组

设计一个函数，接收一个`int`数组参数，返回该数组中所有偶数组成的新数组（若没有偶数则返回空数组）。

提示: Java创建数组时,可以指定数组长度:

```
int[] [arrayName] = new int[arrayNumCount];
```

