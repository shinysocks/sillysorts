#include <iostream>
using namespace std;

void robogo_sort(int*);
void bogo_sort(int*);

const int N = 8;

int main() {
    int list[] {1, 4, 2, 3, 5, 7, 6, 8};

    // output input array
    cout << "Array: ";
    for (int i = 0; i < N; i++) {
       cout << list[i] << " "; 
    } cout << endl;

    cout << "Bogo Sort" << endl;
    clock_t start = clock();
    bogo_sort(list);
    double elapsed = (double) (clock() - start) / CLOCKS_PER_SEC;

    cout << "Time taken: " << elapsed << " seconds" << endl;

    return 0;
}

bool is_sorted(int *arr) {
    for (int i = 0; i < (N - 1); i++) {
        if (arr[i] > arr[i+1]) {
            return false;
        }
    } return true;
}

void bogo_sort(int *arr) {
    while (!is_sorted(arr)) {
        for (int i = N - 1; i > 0; i--) {
            int index = rand() % (i + 1);

            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}
