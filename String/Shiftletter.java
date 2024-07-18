// Jsvs code for the above approach

class GFG {

// Function to change every character
// of the string to another character
static void changeString(String str)
{
	char[] ch = str.toCharArray();
	for (int i = 0; i < str.length(); i++) {
	int dist = ch[i] - 'a';

	// If 'z' is exceeded
	if (dist + (ch[i] - 'a') >= 26) {
		dist = (dist + (ch[i] - 'a')) % 26;
		ch[i] = (char)('a' + dist);
	}

	// If 'z' is not exceeded
	else {
		ch[i] = (char)(ch[i] + dist);
	}
	}

	String s = new String(ch);
	System.out.println(s);
}

// Driver Code
public static void main(String[] args)
{
	String str = "cycleofalphabet";
	changeString(str);
}
}

// This code is contributed by ukasp.