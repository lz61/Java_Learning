1.if-else选择肢:

```
int num=0;
if(num<0.9){
	num=2;
}
else{
	num=4;
}
```



2.语法:

```
if(条件1){
	// do sth;
}
else{
	// do sth else;
}
```



3.思考: 我们要怎么样给board中的元素赋值?

思路:

A.遍历整个board中的元素,找到那些board中未空的下标.

B.基于未空的下标,对board中的内容进行随机赋值.



4.构造列表(i,j),从列表中挑选出我们想赋值的那个值:

```
// 假设已经构建好了board
```



