class ReverseString {

    String reverse(String inputString) {
        StringBuilder input = new StringBuilder();
        input.append(inputString);
        input.reverse();
        return input.toString();
    }
  
}
