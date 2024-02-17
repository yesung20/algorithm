#include <cstdio>
#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;

typedef long long int lint;
// 팩토리얼 2 : https://www.acmicpc.net/problem/27433

lint factorial(int N) {
	if (N <= 1) {
		return 1;
	}
	return N * factorial(N - 1);

}

int main() {
	int N;
	scanf("%d", &N);
	printf("%lld", factorial(N));
}