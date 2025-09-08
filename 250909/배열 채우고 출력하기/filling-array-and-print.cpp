#include <iostream>
using namespace std;

void readCharacters(char characters[], const int count) {
    for (int index = 0; index < count; index++) {
        cin >> characters[index];
    }
}

void printReversedArray(const char characters[], const int count) {
    for (int index = count - 1; index >= 0; index--) {
        cout << characters[index];
    }
}

int main() {
    const int CHARACTER_COUNT = 10;
    char characterArray[CHARACTER_COUNT];
    
    readCharacters(characterArray, CHARACTER_COUNT);
    printReversedArray(characterArray, CHARACTER_COUNT);
    
    return 0;
}
