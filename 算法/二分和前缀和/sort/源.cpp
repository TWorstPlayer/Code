#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>


using namespace std;
int main() {
    int n = 0;
    cin >> n;
    int arr[100001];
    for (int i = 0; i < n; i++)cin >> arr[i];
    sort(arr, arr + n );
    for (int i = 0; i < n; i++)printf("%d ", arr[i]);
}