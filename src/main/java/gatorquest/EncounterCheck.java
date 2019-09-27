package gatorquest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/** Class conducts two GatorQuest encounters.
 *
 * @author Douglas Luman
 */
public class EncounterCheck {
  
  /** Entry point for EncounterCheck class.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Random d13 = new Random();
    // Declare file and scanner objects.
    File encFile = null;
    Scanner scanner = null;
    // Connect files to Scanner object.
    try {
      encFile = new File("inputs/encounters.txt");
      scanner = new Scanner(encFile);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    // Perform first encounter
    String encounter = scanner.next();
    int checkRoll = scanner.nextInt();
    scanner.nextLine(); // Move scanner along
    int result = d13.nextInt(13) + 1;
    encounterReport(encounter,checkRoll,result);
    // Perform next encounter
    encounter = scanner.next();
    checkRoll = scanner.nextInt();
    result = d13.nextInt(13) + 1;
    // Display the encounterReport
    encounterReport(encounter,checkRoll,result);
  }
  
  /** Prints the encounterReport
   *
   * @param title The encounter name
   * @param check The required roll
   * @param roll The actual roll
   */
  public static void encounterReport(String title, int check, int roll){
    title = title.replace("_"," ");
    System.out.println("To defeat the " + title + ":");
    System.out.println("Gator needed to roll\t" + check);
    System.out.println("Gator's actual roll\t" + roll);
  }
}