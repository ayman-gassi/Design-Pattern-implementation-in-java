
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.appendText("Hello, ");
        System.out.println("Current Text: " + editor.getText());
        editor.appendText("how ");
        System.out.println("Current Text: " + editor.getText());
        editor.appendText("are ");
        System.out.println("Current Text: " + editor.getText());
        editor.restorePreviousState();
        System.out.println("After Undo: " + editor.getText());
    }
}