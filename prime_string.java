/* The string is called prime if it cannot be constructed by concatenating some (more than one) equal strings together.
For example, "abac" is prime, but "xyxy" is not.
Given a string determine if it is prime or not. */

boolean primeString(String s) {
  for (int i = 1; i < s.length(); i++)
    if (s.replaceAll(s.substring(0, i), "").equals(""))
      return 1 < 0;
  return 1 > 0;
}

