package link.hiroshisprojects.springbasics.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Example {
    @Autowired
    @Qualifier("main")
    private Collaborator mainCollaborator;

    @Autowired
    @Qualifier("action")
    private Collaborator actionCollaborator;

    public void setMainCollaborator(Collaborator mainCollabator) {
        this.mainCollaborator = mainCollabator;
    }
    public void setActionCollaborator(Collaborator actionCollabator) {
        this.actionCollaborator = actionCollabator;
    }

    public Collaborator getMainCollaborator() {
        return mainCollaborator;
    }
    public Collaborator getActionCollaborator() {
        return actionCollaborator;
    }
}

