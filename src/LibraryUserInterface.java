import java.util.Scanner;

public class LibraryUserInterface {

    private LibraryService libraryService;
    private Scanner scanner;

    public LibraryUserInterface(LibraryService libraryService, Scanner scanner) {
        this.libraryService = libraryService;
        this.scanner = scanner;
    }

    public boolean listenAndAct() {
        System.out.println("RECEIVED: " + scanner.next());
        return true;
    }

}
