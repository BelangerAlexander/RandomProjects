
class GetOS:
    def __init__(self):
        pass # No need for construction
    
    def readFile(self): # Method for reading the systems.txt
        
        lineCount = [] # A list made for holding each OS on a line (SEE LINE 9)
        lineCountFinal = [] # A list for holding the total number of OSs on each line
        
        with open('systems.txt') as file: # Open the systems.txt file
            
            for line in file: # For each line in the file:
                lineCount = line.split(" ") # Split each line by " " (Spaces) into strings and:
                lineCountFinal.append(len(lineCount)) # Append the number of elements created in lineCount to lineCountFinal
        return lineCountFinal # Return the array that contains the total on each line
    
    
    def output(self,lineCountFinal): # Method for writing the data to output.txt
        
        total = 0 # A variable for counting the grand total number of OSs in systems.txt
        
        f = open('output.txt','w') # Open the output.txt file
        
        for i in range (0,len(lineCountFinal)): # Set the range to the amount of elements in lineCountFinal and:
            f.write("The total on line "+str(i+1)+" is "+str(lineCountFinal[i])+"\n") # Write the line # and the total number of elements that was on that line in systems.txt
            total = total + lineCountFinal[i] # Add the number of elements that was on the line to total
            
        f.write("The total is: "+str(total)) # Finally, write the total number of elements to output.txt


def main():
    getOS = GetOS() # Initialize the GetOS class
    lineCountFinal = getOS.readFile() # Set lineCountFinal to be the output of readFile
    getOS.output(lineCountFinal) # Execute output using the list of the number of elements per line
if __name__ == '__main__':
    main()