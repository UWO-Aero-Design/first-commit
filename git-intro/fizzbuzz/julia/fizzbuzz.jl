#=
    To run the code, you must have julia installed
    Go to: https://julialang.org/
    Once installed, open your terminal and type:
        `julia fizzbuzz.jl`
    
    ** Make sure you are in the julia folder so that the
    ** code file can be found
=#

lower = 75
upper = 200

fizz = 14
buzz = 6

for i = lower:upper
    is_fizz = i % fizz == 0
    is_buzz = i % buzz == 0
    if is_fizz && is_buzz
        println("fizzbuzz")
    elseif is_fizz
        println("fizz")
    elseif is_buzz
        println("buzz")
    else
        println(i)
    end
end