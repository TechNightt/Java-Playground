/*********************************************************************************************************************
 Semantic Versioning

In semantic versioning a piece of software can be represented in a format like this example: 6.1.9.

The first number is the major version.
The second number is the minor version.
The third number is the patch (bug fixes).
Write three separate functions, one to retrieve each element in the semantic versioning specification.

Examples
// 6.1.9
retrieveMajor("6.1.9") ➞ "6"

retrieveMinor("6.1.9") ➞ "1"

retrievePatch("6.1.9") ➞ "9"

// 2.1.0
retrieveMajor("2.1.0") ➞ "2"

retrieveMinor("2.1.0") ➞ "1"

retrievePatch("2.1.0") ➞ "0"
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   

public class Challenge {
	public static String retrieveMajor(String semver){
		return semver.split("\\.")[0];
	}

	public static String retrieveMinor(String semver) {
		return semver.split("\\.")[1];
	}

	public static String retrievePatch(String semver) {
		return semver.split("\\.")[2];
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String retrieveMajor(String semver){
		String[] a = semver.split("\\.");
		return a[0];
	}

	public static String retrieveMinor(String semver) {
		String[] a = semver.split("\\.");
		return a[1];
	}

	public static String retrievePatch(String semver) {
		String[] a = semver.split("\\.");
		return a[2];
	}
}

