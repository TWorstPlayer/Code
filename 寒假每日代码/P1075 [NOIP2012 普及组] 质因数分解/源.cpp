//��һ��������
//�ڶ�����һ��ʼ�Ĵ�������

#include<stdio.h>
#include<cmath>
int isPrime(int n) {
    //n<=3ʱ��������2��3
    if (n <= 3) {
        return n > 1;
    }
    //��n>3ʱ�������޷�������С��������
    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            return 0;
        }
    }
    return 1;
}

int main()
{
    int n = 0;
    scanf_s("%d", &n);

    if (n<=2)
    {
        printf("%d", n );
    }
    else if (n % 2 == 0)
    {
        printf("%d", n / 2);

    }
    else
    {
        int a = 0;
        a = sqrt(n);

        while (1)
        {
            a--;
            if (isPrime(a) == 1)
            {
                int b = n / a;
                if (b * a == n)
                {
                    break;
                }
                else 
                {
                    continue;
                }
            }
            
        }
        printf("%d", n / a);
    }
}

//��ʼ�Ĵ�������

#include<stdio.h>
#include<cmath>
int isPrime(int n) {
    //n<=3ʱ��������2��3
    if (n <= 3) {
        return n > 1;
    }
    //��n>3ʱ�������޷�������С��������
    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            return 0;
        }
    }
    return 1;
}

int main()
{
    int n = 0;
    scanf_s("%d", &n);

    if (n <= 2)
    {
        printf("%d", n);
    }
    else if (n % 2 == 0)
    {
        printf("%d", n / 2);

    }
    else
    {
        int a = 0;
        a = sqrt(n);

        while (isPrime(a) !=1 )
        {
            a--;

        }
        printf("%d", n / a);//����һ�����������⣬��Ϊn/a��һ����һ���������������϶���һ������
                            //������Ҫ�ٴ��жϣ�n/a�õ�������b�ǲ���Ϊһ������
    }                       //��Ϊn/a��int���ͣ����n/a��С�����ͻ����С������n/a ֮����*a����n����ȡ�
}
//
    