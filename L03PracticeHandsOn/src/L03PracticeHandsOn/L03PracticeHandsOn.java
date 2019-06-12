package L03PracticeHandsOn;

public class L03PracticeHandsOn {

	public static void main(String[] args) {
		// Declare an array of size 5: The array must be defined as it is in the description.
		//Define an integer array of size 5 with all elements initialized to the value 0.
		int[] numbers = {0, 0, 0, 0, 0};
		
		//Create a for loop: Define a for-loop that iterates over the five elements in the array.
		for(int i = 0; i < numbers.length; i++) {
			//print out a message to user
			System.out.println("Please enter a number: ");
			numbers[i] = StudentHelper.ReadInputInt();
		}
			System.out.println("Numbers Entered: ");
			for(int val:numbers) {
				System.out.println(val);
			}
			//Print the contents of the array in the reverse order
			for(int i = numbers.length -1; i <= 0; i--) {
				System.out.println(numbers);
			}
			//Print the values of the array where the index is odd.
			System.out.println("Print array in reverse order");
			for(int i = 0; i < numbers.length; i++) {
				if(i % 2 != 0) {
					System.out.println("Value at odd index" + i + ":" + numbers[i]);
				}
			}
	}

}
