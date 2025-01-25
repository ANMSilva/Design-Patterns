package mementoDP;

import java.util.ArrayList;
import java.util.List;

public class History {

    /**
     * Caretaker: Manages the mementos and is responsible for saving and restoring the originator's state.
     * It does not modify or expose the memento's internal details.
     */

    private List<EditorState> stateList = new ArrayList<>();

    //add new state
    public void pushState(EditorState editorState) {
        stateList.add(editorState);
    }

    //get last state
    public EditorState popState() {
        var lastIndex = stateList.size() - 1;
        EditorState lastState = stateList.get(lastIndex);
        stateList.remove(lastState);
        return lastState;
    }

}
