public class TextEdit{

    private SpellChecker spellChecker;

    private String name;
    public TextEdit(SpellChecker spellChecker,String name) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
        System.out.println("Inside name "+name);
        this.name = name;
    }

//    public void setSpellChecker(SpellChecker spellChecker) {
//        System.out.println("Inside TextEditor constructor.");
//        this.spellChecker = spellChecker;
//    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
//    public void setName(String name) {
//        System.out.println("Inside name "+name);
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}