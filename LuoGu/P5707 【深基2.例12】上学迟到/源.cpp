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
  time = time+s / v; //�пӣ�����������100/99���� ��Ҫ1.�����ӵ�ʱ�򣬵���ϵͳ���Զ���ȥ�����1������ʵ���������ʱ���ǲ�������Ŀ�ĵصġ�
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
  

  //���debug�ܽ᣺������������Ҫ�չ˵���д����ǰӦ��Ҫ�뵽����ʲô�ӵ���ȥд����Ȼд��ŷ�����Щ�ӵ㣬�������غ��鷳��



}