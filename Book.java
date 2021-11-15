public class Book {
    private String title, author;
    private int date;
    private boolean read = false;

    public Book(String title, String author, int date) {
      setTitle(title);
      setAuthor(author);
      setDate(date);
    }

    public String toString() {
      return "[title='" + getTitle() + "', author='" + getAuthor() + "', year=" + getDate() + ", read=" + isRead() + "]";
    }
    
    //Setters
    public void setRead(boolean read) {
      System.out.println("I read this: " + read);
      this.read = read;
    }
    public void setTitle(String title) {
      this.title = title;
    }
    public void setAuthor(String author) {
      this.author = author;
    }
    public void setDate(int date) {
      this.date = date;
    }

    //Getters
    public String getTitle() {
      return title;
    }
    public String getAuthor() {
      return author;
    }
    public int getDate() {
      return date;
    }
    public boolean isRead() {
      return read;
    }

  }