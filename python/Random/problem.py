def readFile(self,filename):		
    for line in file:                  
        if line.strip():
            # not an empty line (isBlank no) 
            cleanWhiteSpace=line
            line=' '.join(cleanWhiteSpace.split())
            self.pickingWord(line)
            self.displayWordsReversed(line)
