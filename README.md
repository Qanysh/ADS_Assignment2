# ADS_Assignment2
MyArrayList
MyArrayList is a class that uses an array to store elements. It has the following methods:

add(E element): Adds an element to the end of the list. If the array is not large enough to accommodate the new element, a new array is created with double the size of the original array, and the elements from the original array are copied over.

get(int index): Returns the element at the specified index.

remove(int index): Removes the element at the specified index, shifts all subsequent elements to the left by one position, and decrements the size variable.

size(): Returns the size of the list.

Other methods specified by the List interface.

MyLinkedList

MyLinkedList is a class that uses nodes to store elements. It has the following methods:

add(E element): Adds an element to the end of the list by creating a new node with the specified element, setting its next reference to null (since it will be the new tail), and its previous reference to the current tail. If the list is empty, sets both the head and tail references to the new node. Otherwise, sets the next reference of the current tail to the new node and updates the tail reference to the new node. Finally, increments the size variable.

get(int index): Traverses the list from the head (or tail, depending on which is closer to the specified index) and returns the element at the specified index.

remove(int index): Traverses the list to the node at the specified index. Then, updates the next and previous references of the surrounding nodes to remove the node from the list, and decrements the size variable.

size(): Returns the size of the list.

Other methods specified by the MyList interface.
