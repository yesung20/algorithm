// 해결 방법: #define endl "\n"을 추가하고 코드에서 std::endl을 endl 으로 고쳐주었다.
// 이유 : endl함수는 개행만 해주는 것이 아니라 내부 버퍼를 비워주는 역할도 함께하기 때문에 느리다.

#include <iostream>
#include <vector>
#include <algorithm>

#define endl "\n"
int main() {

	std::ios::sync_with_stdio(false);
	std::cin.tie(0); std::cout.tie(0);

	int N, M;
	std::cin >> N >> M;

	std::vector<int> v(N + 1);

	v[0] = 0;

	for (int i = 1; i <= N; i++) {
		int num;
		std::cin >> num;
		v[i] = v[i - 1] + num;
	}

	for (int k = 0; k < M; k++) {
		int i, j;
		std::cin >> i >> j;
		std::cout << v[j] - v[i - 1] << endl;
	}


	return 0;
}
