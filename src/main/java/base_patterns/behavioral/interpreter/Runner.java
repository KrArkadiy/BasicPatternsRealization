package main.java.base_patterns.behavioral.interpreter;

public class Runner {
    public static void main(String[] args) {
        Expression isFamousBook = getFamousBookExpression();
        Expression isEnglishFamousBook = getFamousEnglishBook();

        System.out.println("Is this book famous? " + isFamousBook.interpret("famous"));
        System.out.println("Is this an english famous book?" + isEnglishFamousBook.interpret("english famous"));

    }

    public static Expression getFamousBookExpression(){
        Expression book = new TerminalExpression("ordinary");
        Expression famousBook  = new TerminalExpression("famous");
        return new OrContext(book, famousBook);
    }

    public static Expression getFamousEnglishBook(){
        Expression englishBook = new TerminalExpression("english");
        Expression famousBook = new TerminalExpression("famous");
        return new AndExpression(englishBook,famousBook);
    }
}
