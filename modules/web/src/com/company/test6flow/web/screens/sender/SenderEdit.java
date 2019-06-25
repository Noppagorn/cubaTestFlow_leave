package com.company.test6flow.web.screens.sender;


import com.haulmont.bpm.entity.ProcAttachment;
import com.haulmont.bpm.gui.procactionsfragment.ProcActionsFragment;
import com.haulmont.cuba.gui.app.core.file.FileDownloadHelper;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.test6flow.entity.Sender;

import javax.inject.Inject;

@UiController("test6flow_Sender.edit")
@UiDescriptor("sender-edit.xml")
@EditedEntityContainer("senderDc")
public class SenderEdit extends StandardEditor<Sender> {
    private static final String PROCESS_CODE = "leave";

    @Inject
    private CollectionLoader<ProcAttachment> procAttachmentsDl;

    @Inject
    private InstanceContainer<Sender> senderDc;

    @Inject
    protected ProcActionsFragment procActionsFragment;

    @Inject
    private Table<ProcAttachment> attachmentsTable;

    @Inject
    private InstanceLoader<Sender> senderDl;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        senderDl.load();
        procAttachmentsDl.setParameter("entityId",senderDc.getItem().getId());
        procAttachmentsDl.load();
        procActionsFragment.initializer()
                .standard()
                .init(PROCESS_CODE, getEditedEntity());

        FileDownloadHelper.initGeneratedColumn(attachmentsTable, "file");
    }
}