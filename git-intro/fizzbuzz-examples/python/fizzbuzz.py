# The range of numbers we wish to run the exercise on
lower = 1
upper = 100

# The multiples we want print fizz and buzz on
fizz = 9
buzz = 4

for i in range(lower, upper+1, 1):
    is_fizz = i % fizz == 0
    is_buzz = i % buzz == 0
    if not is_fizz and not is_buzz:
        print(i, end='')
    if is_fizz:
        print('fizz', end='')
    if is_buzz:
        print('buzz', end='')
    print('')
