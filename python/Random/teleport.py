#Author: Alexadner Belanger
#CWUID: 41134464

def teleport(p,s):
    if s == 1:
        print("Since solar EMP has been detected today, no teleporting can take place. Try again tomorrow.")
    elif s == 0:
        for i in range (1,p+1):
            print("Passenger #"+str(i)+" has been teleported.")
            print("There are "+str(p-i)+" passengers left to teleport.")
            if i == p:
                print("All passengers have successfuly been teleported.")


def enterData():
    passengers = int(input("How many passengers will be traveling today?: "))
    solar = int(input("Has there been solar EMP detected today?: "))
    teleport(passengers,solar)
    

def main():
   enterData()   
if __name__ == '__main__':
    main()