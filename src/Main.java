import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LibraryStore libraryStore = new LibraryStore();
        LibraryService libraryService = new LibraryService(libraryStore);
        LibraryUserInterface libraryUserInterface = new LibraryUserInterface(libraryService, new Scanner(System.in));

        boolean stillRunning = true;

        while(stillRunning) {
            stillRunning = libraryUserInterface.listenAndAct();
        }
    }

}
