package mementoDP;

public class Main {
    public static void main(String[] args) {
        /***
         *The Memento Design Pattern is a behavioral design pattern that provides a way to capture and restore
         * the state of an object without exposing its internal details.
         * It is used to implement undo/redo functionality in applications.
         */

        /**
         * @Components of Memento Design pattern
         *
         * @Originator: The object whose state needs to be saved and restored. It creates and restores mementos.
         * @Memento: A snapshot of the originator's state. It is a simple object that stores the state.
         * @Caretaker: Manages the mementos and is responsible for saving and restoring the originator's state.
         *              It does not modify or expose the memento's internal details.
         * */

        /**
         * When to use Memento Design Pattern?
         * Undo functionality: When your application needs to include an undo function that lets users restore the state of an object after making modifications.
         * Snapshotting: When you need to enable features like versioning or checkpoints by saving an object’s state at different times.
         * Transaction rollback: When there are failures or exceptions, like in database transactions, and you need to reverse changes made to an object’s state.
         * Caching: When you wish to reduce duplicate calculations or enhance efficiency by caching an object’s state.
         * */

        var editor = new Editor();
        var history = new History();

        editor.setContent("content-1");
        history.pushState(editor.createState());

        editor.setContent("content-2");
        history.pushState(editor.createState());

        editor.setContent("content-3");
        editor.restore(history.popState());

        System.out.println("Current state :" + editor.getContent());
    }
}
