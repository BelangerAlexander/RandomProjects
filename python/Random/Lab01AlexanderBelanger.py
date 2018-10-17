import random

def avgCounter(number, rangeBottom, rangeTop):
    value = 0;
    print("For ",number ,"numbers between ", rangeBottom, "and ", rangeTop, ":")
    for i in range(0,number):
        num = 0
        num = random.randrange(rangeBottom, rangeTop +1)
        if number < 10: # If the amount of numbers that needs to be generated exceeds 10, then skip listing them.
            print("Number ", i+1, "is", num)
        value+=num
    print("The total is", value)
    return value/number
        
def main():
    print(avgCounter(5, 1, 20),"\n") # Average of 5 Random Numbers between 0 and 20
    print(avgCounter(5, 50, 70),"\n")# Average of 5 Random Numbers between 50 and 70
    print("Answering Question 3: The method I use now could be used to\ndo so, however it would be more efficient if I skipped printing\neach random number generated to the Shell. I did this as you can\nsee in the comments in the code. Below you see the 100 Number Generation Output.\n")
    print(avgCounter(100, 1, 100),"\n")

if __name__ == '__main__':
    main()