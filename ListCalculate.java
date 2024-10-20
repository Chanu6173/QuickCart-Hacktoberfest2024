// Java program for
// the above approach

import java.io.*;

class GFG {

	// Function to find the total money
	// placed in boxes after N days
	public static int totalMoney(int N)
	{

		// Stores the total money
		int ans = 0;

		// Iterate for N days
		for (int i = 0; i < N; i++) {

			// Adding the Week number
			ans += i / 7;

			// Adding previous amount + 1
			ans += (i % 7 + 1);
		}

		// Return the total amount
		return ans;
	}

	// Driver Code
	public static void main(String[] args)
	{
		// Input
		int N = 15;

		// Function call to find
		// total money placed
		System.out.println(
			totalMoney(N));
	}
}
