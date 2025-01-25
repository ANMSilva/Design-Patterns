package mementoDP;

public class EditorState {

    /**
     * Memento: A snapshot of the originator's state. It is a simple object that stores the state.
     * */

    private final String state;

    public EditorState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
