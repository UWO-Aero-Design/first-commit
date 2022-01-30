--[[
    To run the code, you must have lua installed
    Go to: https://www.lua.org/download.html
    Once installed, open your terminal and type:
        `lua fizzbuzz.lua`
    
    ** Make sure you are in the lua folder so that the
    ** code file can be found
"""
--]]

-- The range of numbers we wish to run the exercise on
local lower = 1
local upper = 100

-- The multiples we want print fizz and buzz on
local fizz = 5
local buzz = 8

for i=lower, upper do
    is_fizz = i % fizz == 0
    is_buzz = i % buzz == 0
    if is_fizz and is_buzz then print("fizzbuzz")
    elseif is_fizz then print('fizz')
    elseif is_buzz then print('buzz')
    else print(i) end
end