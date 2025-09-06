#include <iostream>
using namespace std;

int main() {
    int A, B, C;
    cin >> A >> B >> C;
    
    int median;
    
    if ((A >= B && A <= C) || (A >= C && A <= B)) {
        median = A;
    } else if ((B >= A && B <= C) || (B >= C && B <= A)) {
        median = B;
    } else {
        median = C;
    }
    
    cout << median << endl;
    
    return 0;
}
