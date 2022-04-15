#include <iostream>
using namespace std;

int main() {
    int lower = 25;
    int upper = 150;

    int fizz = 7;
    int buzz = 12;
    int is_fizz = 0;
    int is_buzz = 0;
    for(int i = lower; i <= upper; i++){
        is_fizz = (i%fizz == 0);
        is_buzz = (i%buzz == 0);
          
        if(is_fizz == 0 && is_buzz == 0) {
            cout << i << endl;
        }
        if(is_fizz == 1 && is_buzz == 0) {
            cout << "Fizz" << endl;
        }
        if(is_fizz == 0 && is_buzz == 1) {
            cout << "Buzz" << endl;
        }
        if(is_fizz == 1 && is_buzz == 1){
            cout << "FizzBuzz" << endl;
        }
    }

    return 0;
}