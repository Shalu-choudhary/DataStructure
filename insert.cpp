#include <iostream>
#include <vector>

using namespace std;

void insertElements(int arr[], int& size, int elements[], int positions[], int numInsertions) {
    // Adjust positions to 0-based
    for (int i = 0; i < numInsertions; ++i) {
        positions[i]--;  // Convert 1-based index to 0-based
    }
    
    // Resize the array to accommodate new elements
    int newSize = size + numInsertions;
    int newArr[newSize];

    // Initialize indices for original array, new array, and elements to insert
    int originalIndex = 0;
    int newIndex = 0;
    int elementIndex = 0;

    // Traverse both the original array and the elements to be inserted
    while (originalIndex < size || elementIndex < numInsertions) {
        // Check if we need to insert an element at the current index
        if (elementIndex < numInsertions && positions[elementIndex] == originalIndex) {
            newArr[newIndex++] = elements[elementIndex++];
        } else {
            newArr[newIndex++] = arr[originalIndex++];
        }
    }

    // Update original array and its size
    for (int i = 0; i < newSize; ++i) {
        arr[i] = newArr[i];
    }
    size = newSize;
}

int main() {
    int arr[] = {0, 1, 2, 3, 4};
    int elements[] = {5, 6};
    int positions[] = {2, 4};
    int numInsertions = sizeof(elements) / sizeof(elements[0]);

    int size = sizeof(arr) / sizeof(arr[0]);

    // Insert elements into arr at specified positions
    insertElements(arr, size, elements, positions, numInsertions);

    // Print the resulting array
    cout << "Modified Array: ";
    for (int i = 0; i < size; ++i) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}