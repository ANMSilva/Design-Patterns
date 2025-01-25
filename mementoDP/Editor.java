package mementoDP;

public class Editor {
    /**
     * Originator: The object whose state needs to be saved and restored. It creates and restores mementos.*
     */

    private String content;

    public Editor(){};

    public Editor(String state) {
        this.content = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //create new state
    public EditorState createState() {
        return new EditorState(content);
    }

    //restore current state
    public void restore(EditorState editorState) {
        content = editorState.getState();
    }
}
