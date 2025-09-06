#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int a, b, c, d;

    cin >> a;
    cin >> b;
    cin >> c; 
    cin >> d;

    bool A = a > c;
    bool B = b > d;

    if ( A == true && B == true) {
        cout << 1;
    }
    else{
        cout << 0;
    }

    return 0;
}