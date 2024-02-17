#include <cstdio>
#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;

typedef long long int lint;
// 하노이 탑 이동 순서 :https://www.acmicpc.net/problem/11729

// from에서  to로 옮김
void hanoiTower(int hnoiNum, char start, char tmp, char finish)
{
	if (hnoiNum == 1) {
		printf("원판 1을 %c에서 %c으로 옮긴다.\n", start, finish);
	}
	else {
		// [1] from의 맨 및의 원판을 제외한 나머지 원판들을 tmp로 옮김
		hanoiTower(hnoiNum - 1, start, finish, tmp);
		// [2] from에 있는 한 개의 원판을 to로 옮김

		printf("원판 %d을 %c에서 %c으로 옮긴다.\n",hnoiNum, start, finish);
		hanoiTower(hnoiNum - 1, tmp, start, finish);
		// [3] tmp의 원판들을 to로 옮김

	}

}
int main() {

	int N;
	scanf("%d", &N);
}