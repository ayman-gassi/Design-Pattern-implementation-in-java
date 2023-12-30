public class TextEditor {
    private StringBuilder text;
    private TextEditorMemento lastSavedState;

    public TextEditor() {
        this.text = new StringBuilder();
    }

    public void appendText(String newText) {
        saveState();
        text.append(newText);
    }

    private void saveState() {
        lastSavedState = new TextEditorMemento(text.toString());
    }

    public void restorePreviousState() {
        if (lastSavedState != null) {
            text = new StringBuilder(lastSavedState.getText());
        }
    }

    public String getText() {
        return text.toString();
    }
}