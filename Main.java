
public class Main {
  public static void main(String[] args) {

    System.out.println("------------------------------------------------");

    Book crusoe = new Book("Robinson Crusoe", "Daniel Dafoe", 1719);
    System.out.println(crusoe.toString());
    crusoe.setRead(true);
    System.out.println(crusoe.toString());

    System.out.println("------------------------------------------------");

    ForeignLanguageBook hunchback = new ForeignLanguageBook("Notre-Dame de Paris",
    "Victor Yougo", 1482, "French", true);

    System.out.println(hunchback);
    hunchback.setAuthor("Victor Hugo"); // oops
    hunchback.setRead(true);
    System.out.println(hunchback);
    
    System.out.println("------------------------------------------------");

    ForeignLanguageBook sorghum = new ForeignLanguageBook("Red Sorghum",
    "Mo Yan", 1986, "Chinese", false);

    System.out.println(sorghum);
    sorghum.setRead(true);
    System.out.println(sorghum);

    System.out.println("------------------------------------------------");

  }

}