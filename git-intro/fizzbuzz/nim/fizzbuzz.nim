#[
    To run the code, you must have nim installed
    Go to: https://nim-lang.org/
    Once installed, open your terminal and type:
        `nim c fizzbuzz.nim`
        `./fizzbuzz` - Linux or macOS
        `fizzbuzz.exe` - Windows
    
    ** Make sure you are in the nim folder so that the
    ** code file can be found
]#

# The range of numbers we wish to run the exercise on

var lower = 1
var upper = 100

# The multiples we want print fizz and buzz on
var fizz = 2
var buzz = 3

for i in lower..upper:
    var is_fizz = i mod fizz == 0
    var is_buzz = i mod buzz == 0
    if is_fizz and is_buzz:
        echo "fizzbuzz"
    elif is_fizz:
        echo "fizz"
    elif is_buzz:
        echo "buzz"
    else:
        echo i