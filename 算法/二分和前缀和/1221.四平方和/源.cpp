#include <cstring>
#include <iostream>
#include <algorithm>
#include <cmath>

using namespace std;

const int N = 2500010;

struct Sum
{
    int s, c, d;

}sum[N];
bool cmp(Sum a, Sum b)
{
    if (a.s != b.s)return a.s < b.s; //先把c*c+d*d的值从小到大排序了，这样其实大部分的数已经是符合字典序从小到大了
    if (a.c != b.c)return a.c < b.c;// 但是呢，当c*c+d*d的值相等的时候，就可能会出现字典序大的再前面了，所以最好再去判断一次

    return a.d < a.d;
}

int n, m;

int main()
{
    cin >> n;

    for (int c = 0; c * c <= n; c++)
        for (int d = c; c * c + d * d <= n; d++)
            sum[m++] = { c * c + d * d, c, d };

    sort(sum, sum + m, cmp);

    for (int a = 0; a * a <= n; a++)
        for (int b = 0; a * a + b * b <= n; b++)
        {
            int t = n - a * a - b * b;
            int l = 0, r = m - 1;
            while (l < r)
            {
                int mid = l + r >> 1;
                if (sum[mid].s >= t) r = mid;
                else l = mid + 1;
            }
            if (sum[l].s == t)
            {
                printf("%d %d %d %d\n", a, b, sum[l].c, sum[l].d);
                return 0;
            }
        }

    return 0;
}

