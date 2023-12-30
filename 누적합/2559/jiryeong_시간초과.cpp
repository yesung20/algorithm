#include <iostream>
#include <vector>
#include <algorithm>

int main() {

	std::ios::sync_with_stdio(false);
	std::cin.tie(NULL);
	int N, K;
	std::vector<int> n;
	std::vector<int> k;

	std::cin >> N >> K;

	int tmp;
	for (int i = 0; i < N; i++) {
		std::cin >> tmp;
		n.push_back(tmp);
	}

	for (int i = 0; i < N; i++) {
		if (  (i + K-1) >= N) {
			break;
		}
		tmp = 0;
		for (int j = i; j <= (i + K - 1); j++) {
			tmp += n[j];
		}
		k.push_back(tmp);
	}

	sort(k.begin(), k.end(), std::greater<>());

	std::cout << k[0] << std::endl;
	return 0;
}
