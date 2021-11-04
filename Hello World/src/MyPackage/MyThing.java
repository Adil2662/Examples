package MyPackage;

public class MyThing {
	
	/*
	 * Camel Case: firstLetterLowerCase, upper case for each new word's first letter
	 * Pascal Case: Capitalize first letter for every words, no spaces
	 * Snake Case: under_scores_separating_words, no spaces or caps
	 * 
	 * Alternate naming strategies;
	 * Snake Case: under_scores_separating_words, no spaces or caps
	 * Kebab Case: hyphens-separating-words, no spaces or caps
	 * 
	 * NO NUMBERS
	 * 
	 */
	
	byte myByte = 1;  // 8 bits, half of a short
	short mySmallNumber = 5; // Half of an int, 16bits
	int myWholeNumber; // Short for 'integer'. 32 bits and Whole Numbers only
	long myBigNumber; // 64bit, twice as large as an int
	
	//Decimal numbers
	
	float myDecimal = 1.05f; // 'Floating-point' or decimal number. 32 bits.
	double MyMorePreciseDecimal = 1.06; //64 bits, double precision decimal number
	
	// True / False
	boolean myTrueOrFalse; //1 byte or 8bits
	

	//Character
	char myCharacter; //16 bits, stores ASCII unless otherwise specified
	
	//Reference - holds the memory of some object
	Object o; // References are 32 bits on a x8(32 bit machine) and 64 bits on a different machine
	
}