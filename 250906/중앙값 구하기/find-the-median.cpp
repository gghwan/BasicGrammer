#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int A, B, C;

    cin >> A;
    cin >> B;
    cin >> C;

    if ( A > B && A < C){
        cout << A;
    }
    else{
        if( A < B && B < C){
            cout << B;
        }
        else{
            if( A < C && B > C){
                cout << C;
            }
        }
    }
    return 0;
}