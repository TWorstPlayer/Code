#include<stdio.h>
#include<math.h>  //定义该数学函数库 因为要用到sqrt函数

int main() {
	double y;
	int x, m;
	for (y = 10; y >= -10; y--) 
	{
		//圆的半径为10
		//计算y对应的列坐标m，2.03是屏幕纵横比调节系数
		m =sqrt(100 - y * y);	//因为屏幕s的行距大于列距，不进行调节显示出来的将是椭圆
		
		for (x = 1; x < 10; x++)

		{
			printf(" ");
		}  //图形左侧空白控制
			printf("*");
		 //左半圆
		
			for (; x < 10 + 2*m; x++)

			{
				printf(" ");
			}//图形空心部分控制
			printf("*\n");//圆的右侧
		
	}
}
