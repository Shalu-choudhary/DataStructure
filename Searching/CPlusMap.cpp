#include <iostream>
#include <unordered_map>
#include <string>
using namespace std;
int main() {
    unordered_map<string, int> contactMap;
    int q;
    cin >> q;
    cin.ignore();  // Ignore the newline character after the integer input
    while (q--) {
        string command;
        cin >> command;
        if (command == "add") {
            string contact;
            cin >> contact;
            contactMap[contact]++;
        } else if (command == "find") {
            string prefix;
            cin >> prefix;
            int count = 0;
            for (const auto& entry : contactMap) {
                if (entry.first.find(prefix) == 0) {
                    count += entry.second;
                }}   
            cout << count << endl;}}
    return 0;
}

