1.分离: 编译代码与"运行可执行文件"的过程,并展示.

思路:

代码&rarr;可执行文件&rarr;运行文件.

A.以python为例:

查看python版本(此乃windows命令):

```
python --version
```

分离python编译与运行:

```
# 手动编译（生成.pyc）
python -m py_compile test.py

注意到生成了一堆别的东西.

# 运行编译编译的字节码
python -c "import test"
```





B.以C++为例:

撰写test.cpp:

```
#include <iostream>
int main(void){
    std::cout << "Hello, World!" << std::endl;
    return 0;
}
```

编译:

```
g++ test.cpp -o test.exe
```

注意到生成了test.exe.

运行:

```
test.exe(直接执行)
```

所以其实编译与运行分两步.



C.以java为例:

撰写Test.java:

```
public class Test{
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}
```

分离编译与运行:

编译:

```
javac Test.java
```

注意到生成了.class文件.

运行:

```
java Test
```



每种情况下,都会生成一份可执行文件,如你所示.







2.总结一下:

因此我们知道,"运行代码"事实上分两步:

A.输入: 源代码 输出: 可执行文件

B.输入: 可执行文件 输出: 运行结果.(由某些工具来运行可执行文件.)

也即是先将代码变为可执行文件(所谓的可执行文件就是可以运行的文件), 然后运行"可执行文件".

因为"可执行文件"很别扭,所以我可能会说它的英文: "executable file".



我们把步骤A称作编译代码,把步骤B称作"运行可执行文件".(run executable file).

所谓的"编译",在英文中是compile.有时我们直接把"编译代码"缩略成"编译"两个字.





3.jdk与jre

对于java这个编程语言的发明者,他整理了两种环境:

一种是jdk,安装jdk的用户既能编译代码,也能运行可执行文件.

一种是jre,安装jre的用户只能运行别人"编译"好的代码,即只能运行*.class文件.

这就是所谓"jdk"与"jre"的区别.



4.如何卸载本机(macOS)残存的jre:

```
在 macOS 系统中卸载 JRE（Java Runtime Environment）的步骤如下，操作相对直接：
步骤 1：确认终端
按下 Command + 空格 调出 Spotlight 搜索，输入 “终端” 并打开。
步骤 2：删除 JRE 核心文件
在终端中执行以下命令（需要管理员权限，输入密码时不会显示字符，输入完成后按回车即可）：

bash
# 删除Java插件（用于浏览器等）
sudo rm -rf /Library/Internet\ Plug-Ins/JavaAppletPlugin.plugin

# 删除Java控制面板偏好设置
sudo rm -rf /Library/PreferencesPanes/JavaControlPanel.prefPane

# 删除Java相关支持文件
sudo rm -rf /Library/Application\ Support/Oracle/Java/
步骤 3：检查是否有残留的 JRE 安装目录
部分版本的 JRE 可能会在 /Library/Java/JavaVirtualMachines/ 目录下留有文件，可执行以下命令查看并删除：

bash
# 列出该目录下的Java相关文件
ls /Library/Java/JavaVirtualMachines/

# 若存在类似“jre1.8.0_xxx.jdk”的文件，执行删除（替换为实际文件名）
sudo rm -rf /Library/Java/JavaVirtualMachines/jre1.8.0_xxx.jdk


步骤 4：验证卸载是否成功
在终端中输入以下命令，若提示 “command not found” 或类似信息，说明 JRE 已成功卸载：

bash
java -version

注意事项
以上权限不足的提示，确保命令前加了sudo并输入正确的管理员密码。
若之前手动设置过JAVA_HOME等环境变量，可在~/.bash_profile、~/.zshrc等配置文件中删除相关条目（可选，不影响卸载本身）。

通过以上步骤，即可彻底移除 macOS 系统中的 JRE。
```

再运行.dmg安装jdk即可.