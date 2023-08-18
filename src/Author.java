import java.util.Objects;

public class Author {
    private String authorFirstName;
    private String authorSurname;


    public Author (String authorFirstName, String authorSurname){
        this.authorFirstName = authorFirstName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorFirstName(){
        return this.authorFirstName;
    }
    public String getAuthorSurname(){
        return this.authorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorFirstName, author.authorFirstName) && Objects.equals(authorSurname, author.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorSurname);
    }

    @Override
    public String toString(){
        return "Автор книги - " + authorFirstName + " " + authorSurname;
    }
}