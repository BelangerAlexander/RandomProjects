class Age(object):
    def __init__(self):
        self.ages = [] #an array for all the lines in the file
        
    def readFile(self):
        with open('input.txt') as file: #open input file
            for line in file: #read each line and
                self.ages.append(line) #add it to the list
                
    def reckonAge(self):
        total = 0 #total of all the numbers
        times = 0 #number of numbers
        nages = [] #new list for just ages
        for i in range (len(self.ages)):
            if i % 2 != 0:# read every second line in file and
                times = times + 1 #add 1 to the number of numbers
                total = total + int(self.ages[i]) #add number found to the total of numbers
                nages.append(self.ages[i]) #add the number found to the new list of ages
        average = total/times #calculate the average
        
        self.output(average,times,nages) #pass information to output function
            
    def output(self,avg,times,ages):
        
        f = open('output.txt','w') #open/create output file
        for i in range (times): #output each number on a new line in the file 
            f.write(ages[i]+"\n") #this adds it
                        
        f.write("The average age in the group provided is "+str(avg)+"\n") #output the average to the file on a new line
        
        if avg <= 50: #output the standing to the new file
            f.write("This is a young Group!")
        elif avg > 50 and avg < 100:
            f.write("This group is of good age!")
        elif avg >= 100:
            f.write("TELL THE SECRET!!")
        f.close()
        
def main():
    obj = Age()
    obj.readFile()
    obj.reckonAge()
if __name__ == '__main__':
    main()
        