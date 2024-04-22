n = int(input())
output = 0
for e in range(n):
    problema = input().split()
    respostasCorreta = 0
    for i in problema:
        if i == '1':
            respostasCorreta += 1
    if respostasCorreta > 1:
        output += 1
print(output)
