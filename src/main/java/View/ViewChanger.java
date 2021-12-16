package View;

public interface ViewChanger {

        default void init(){
            initializeSelf();
            initializeControls();
            layoutControls();
            setupEventHandlers();
            setupValueChangeListeners();
            setupBindings();
        }

        default void initializeSelf(){
        }

        void initializeControls();

        void layoutControls();

        default void setupEventHandlers(){

        }

        default void setupValueChangeListeners(){

        }

        default void setupBindings(){

        }

}

