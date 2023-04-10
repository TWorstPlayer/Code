#include<stdio.h>
int main()
{ int s;
  int v;
  scanf_s("%d", &s);
  scanf_s("%d", &v);
  int time;
  int hour;
  int min;
  time = 10;
  time = time+s / v; //有坑：对于类似于100/99这种 需要1.几分钟的时候，但是系统会自动舍去变成了1，这样实际算出来的时间是不够到达目的地的。
  if (s % v > 0)
  {
	  time++;
  }
  hour = time / 60;
  min = time % 60;
  hour = 7 - hour;
  min = 60 - min;
  if (hour < 0)
  {
	  hour = hour + 24;
  }
  printf("%02d:%02d", hour, min);
  

  //多次debug总结：对于特殊点必须要照顾到，写程序前应该要想到会有什么坑点再去写，不然写完才发现这些坑点，盖起来回很麻烦。



}