letters = {"a", "b", "c", "d"}
numbers = {0, 1}

def union(set1, set2):
    return set1.union(set2)

def cartesian_prod(set1, set2):
    product = set()
    for i in set1:
        for j in set2:
            product.add((i, j))
    return product
L2=union(letters, numbers)
var_names =cartesian_prod(letters,cartesian_prod(L2,L2))