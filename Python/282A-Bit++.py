n = int(input())
sum = 0
for e in range(n):
    inp = input()
    if inp == "++X" or inp == "X++":
        sum += 1
    elif inp == "--X" or inp == "X--":
        sum -= 1
print(sum)
