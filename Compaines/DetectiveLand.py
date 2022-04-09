from sys import stdin
lines = stdin.read().splitlines()
l = int(lines[0])
n = int(lines[1])
for x in range(n):
    w = int(lines[x+2])
    h = int(lines[x+3])
    if w < l or h < l:
        print("New One")
    elif(w==h and w>=l and h>=l):
        print("Got it")
    else:
        print("Sorry")        