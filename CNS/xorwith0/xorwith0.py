input="Hello world"
#xor for int only no string

#concert str to int

for i in range(0,len(input)):
    intchar=ord(input[i])
    xor=chr(intchar^0)
    print(xor)