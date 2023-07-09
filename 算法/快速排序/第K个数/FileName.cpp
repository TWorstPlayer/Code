#define _CRT_SECURE_NO_WARNINGS
#include<iostream>
#include <algorithm>
using namespace std;


const int max1 = 1e6 + 10;
int arr[max1];

void quick_sort(int arr[], int l, int r) {
    if (l >= r)return;
    int i = l - 1;
    int j = r + 1;
    int mid = arr[(l + r) / 2];
    while (i < j) {
        do i++; while (arr[i] < mid);
        do j--; while (arr[j] > mid);
        if (i < j)swap(arr[i], arr[j]);
    }
    quick_sort(arr, l, j);      //������j��j+1�Ϳ��Թ�
    quick_sort(arr, j + 1, r);  //������i��i+1�����ˣ�Ϊʲô��
    return;
}
int main() {
    int n = 0;
    int k = 0;
    scanf("%d %d", &n, &k);
    for (int i = 0; i < n; i++)scanf("%d", &arr[i]);
    quick_sort(arr, 0, n - 1);
    printf("%d", arr[k - 1]);

}