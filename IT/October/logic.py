def AND (a, b):
    if(a == True & b == True):
        return True
    else:
        return False

def OR (a, b):
    if(a == True or b == True):
        return True
    else:
        return False

def XOR (a, b):
    if(a == True and b == False or a == False and b == True):
        return True
    else:
        return False

def NOT (a):
    if(a == True):
        return False
    else:
        return True
def flipflop (newInput):
    a = newInput
    return a

print(flipflop(a))


"""
# main starts here
print(AND(1, 1))

print("+---------------+----------------+")
print(" | AND Truth Table    | Result |")
print(" A = False, B = False | A AND B =",AND(False,False)," | ")
print(" A = False, B = True  | A AND B =",AND(False,True)," | ")
print(" A = True, B = False  | A AND B =",AND(True,False)," | ")
print(" A = True, B = True   | A AND B =",AND(True,True)," | ")

print()

print(OR(0, 0))

print("+---------------+----------------+")
print(" | OR Truth Table     | Result |")
print(" A = False, B = False | A OR B =",OR(False,False)," | ")
print(" A = False, B = True  | A OR B =",OR(False,True)," | ")
print(" A = True, B = False  | A OR B =",OR(True,False)," | ")
print(" A = True, B = True   | A OR B =",OR(True,True)," | ")

print()

print(XOR(5, 5))

print("+---------------+----------------+")
print(" | XOR Truth Table    | Result |")
print(" A = False, B = False | A XOR B =",XOR(False,False)," | ")
print(" A = False, B = True  | A XOR B =",XOR(False,True)," | ")
print(" A = True, B = False  | A XOR B =",XOR(True,False)," | ")
print(" A = True, B = True   | A XOR B =",XOR(True,True)," | ")

print()

print(NOT(0))

print("+---------------+----------------+")
print(" | NOT Truth Table | Result |")
print(" A = False | A NOT =",NOT(False)," | ")
print(" A = True, | A NOT =",NOT(True)," | ")
"""
