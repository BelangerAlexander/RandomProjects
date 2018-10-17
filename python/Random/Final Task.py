from operator import itemgetter, attrgetter

class ReceiptItem(object):
    def __init__(self,group,name,quantity,price):
        self.group = group
        self.name = name
        self.quantity = quantity
        self.price = price
        if len(self.name) < 8:
            for i in range (8-len(self.name)):
                self.name = self.name + " "
        
class ReceiptPrinter():
    def __init__(self,filename):
        self.filename = filename

    def printReceipt(self):
        dataGroup = []
        with open(self.filename) as file:
            for line in file:
                item = line.split(" ")
                dataGroup.append(ReceiptItem(int(item[0]),item[1],int(item[2]),float(item[3])))
        option = int(input("Sort by Category(1), by Name(2), or by Price(3): "))
        if option == 1:
            dataGroup.sort(key=attrgetter('group'))
        elif option == 2:
            dataGroup.sort(key = attrgetter('name'))
        elif option == 3:
            dataGroup.sort(key = attrgetter('price'))
        total = 0
        
        f = open('receipt.txt','w')
        f.write("C\tName\t\t\tQ\tPrice\tSub-Total\n")
        for i in range(len(dataGroup)):
            f.write(str(dataGroup[i].group) + "\t" + dataGroup[i].name + "\t\t" + str(dataGroup[i].quantity) + "\t{0:.2f}".format(round(dataGroup[i].price,2)) + "\t{0:.2f}".format(round(dataGroup[i].price*dataGroup[i].quantity,2)) + "\n")
            total = total+(dataGroup[i].price*dataGroup[i].quantity)
        f.write("\nTotal: \t\t\t\t\t\t{0:.2f}\n".format(round(total,2)))
        f.write("\nQ = Quantity\nC = Category")
        f.close
        print("Receipt Printed.")
        

def main():
    
    receipt = ReceiptPrinter("grocery.txt")
    receipt.printReceipt()

if __name__ == '__main__':
    main()