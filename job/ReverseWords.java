package job;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "This is a fine day!";
        String[] words = input.split(" "); 
        StringBuilder result = new StringBuilder();

        for (String word : words){
            
            String cleanWord = word.replaceAll("[^a-zA-Z]", ""); 
           
            StringBuilder reversedWord = new StringBuilder(cleanWord).reverse();
            result.append(reversedWord).append(" ");
        }

       
        System.out.println(result.toString().trim());
    }
}
