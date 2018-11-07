'''
1. 現有一字串 so = 'nahxatoamktbkoydvxoqbkkhvmadbu'，
   請找出在字串中出現最多次的字元並統計他的次數，
   並以格式 "char:%s count:%d" 輸出
'''
so = 'nahxatoamktbkoydvxoqbkkhvmadbu'

# store the appearing letters without duplicate
# define a function takes in a string
def appearchar(str):
    # storage list
    chars = []
    # iterate through the given string
    for i in str:
        # if it is not in the list
        if i not in chars:
            # add it in list
            chars.append(i)
    # return the list without duplicate letters
    return chars

# count the times that char appears in a str
# define a function takes in a string and a char
def count(str, char):
    # reset counter to 0
    count = 0
    # iterate through the given string
    for i in str:
        # if the letter correspond to the given char
        if i == char:
            # counter + 1
            count +=1
    return count

# define a function that takes in 2 list
# first is the list of string that appears without duplcate list
# seconf is the list of the times that each char in the string appears with same order
def most(appear, appear_count):
    # each index in first list
    for i in range(len(appear)):
        # if the same position in count list equals to the max in that list
        # which means it appears the most
        if appear_count[i] == max(appear_count):
            # assign it just for convenience to read
            most = appear[i]
            #print(f"char: {most} count: {appear_count[i]}")
            print("char: %s count: %d" %(most, appear_count[i]))


# make a list of all appearing letters in string "so"
appearchar(so)
# empty list to store the count
appearcount = []

# iterate through the list
for c in appearchar(so):
    # count each char in that list that how many times it appears in string "so"
    perc = count(so, c)
    # save the count with same order with appearchar(so)
    appearcount.append(perc)

most(appearchar(so), appearcount)

"""
algorithn for "most()":

for index in range(len(appearchar(so))):
    if appearcount[index] == max(appearcount):
        most = appearchar(so)[index]
        print(most)


"""
