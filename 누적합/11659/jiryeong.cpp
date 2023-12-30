#include <iostream>
#include <vector>
#include <algorithm>

int main() {

	std::ios::sync_with_stdio(false);
	std::cin.tie(0); std::cout.tie(0);

	int N, M;
	std::cin >> N >> M;

	std::vector<long> v(N + 1);
	v[0] = 0;

	for (int i = 1; i <= N; i++) {
		long num;
		std::cin >> num;
		v[i] = v[i - 1] + num;
	}

	for (int k = 0; k < M; k++) {
		int i, j;
		std::cin >> i >> j;
		std::cout << v[j] - v[i - 1] << std::endl;
	}


	return 0;
}
