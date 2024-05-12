t = int(input())
for e in range(t):
    z = input().split()
    x, y = int(z[0]), int(z[1])
    if x < y:
        print(x, y)
    else:
        print(y, x)
