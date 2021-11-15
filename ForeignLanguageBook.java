public class ForeignLanguageBook extends Book {
  private String language;
  private boolean translated;

  public ForeignLanguageBook(String title, String author, int date, String language, boolean translated) {
    super(title, author, date);
    setLanguage(language);
    setTranslated(translated);
  }

  @Override
  public String toString() {
    return "[" + super.toString() + "language='" + getLanguage() + "', translated=" + isTranslated() + "]";
  }

  // Setters
  @Override
  public void setRead(boolean read) {
    if(translated == false) System.out.println("I do not read " + language);
    else super.setRead(read);
  }
  public void setLanguage(String language) {
    this.language = language;
  }
  public void setTranslated(boolean translated) {
    this.translated = translated;
  }

  // Getters
  public String getLanguage() {
    return language;
  }

  public boolean isTranslated() {
    return translated;
  }

}