package midtermexam_versiona_extensioncode;

    
    import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Displaying the list of possible genres
        System.out.println("Possible Genres:");
        System.out.println("1. Combedy");
        System.out.println("2. Drama");
        System.out.println("3. Action");
        System.out.println("4. Mystery");
     

        // Getting user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your favorite genre (choose a number): ");
        int genreChoice = scanner.nextInt();

        String genre = getGenreFromChoice(genreChoice);

        
        UserProfile userProfile = new UserProfile(name, genre);

        System.out.println("Your user profile was created:");
        System.out.println(userProfile);
    }

    private static String getGenreFromChoice(int choice) {
        String genre;
        switch (choice) {
            case 1:
                genre = "Combedy";
                break;
            case 2:
                genre = "Action";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Mystery";
                break;
            
                default:
                genre = "Unknown";
                break;
        }
        return genre;
    }
}



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

