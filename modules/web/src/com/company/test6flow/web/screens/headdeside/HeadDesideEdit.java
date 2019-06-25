package com.company.test6flow.web.screens.headdeside;

import com.company.test6flow.entity.Sender;
import com.haulmont.bpm.entity.ProcAttachment;
import com.haulmont.bpm.gui.procactionsfragment.ProcActionsFragment;
import com.haulmont.cuba.gui.app.core.file.FileDownloadHelper;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.test6flow.entity.HeadDeside;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@UiController("test6flow_HeadDeside.edit")
@UiDescriptor("head-deside-edit.xml")
@EditedEntityContainer("headDesideDc")
@LoadDataBeforeShow
public class HeadDesideEdit extends StandardEditor<HeadDeside> {

    private static final String PROCESS_CODE = "leave";

    @Inject
    private CollectionLoader<ProcAttachment> procAttachmentsDl;

    @Inject
    private InstanceContainer<HeadDeside> headDesideDc;

    @Inject
    protected ProcActionsFragment procActionsFragment;

    @Inject
    private Table<ProcAttachment> attachmentsTable;

    @Inject
    private InstanceLoader<Sender> headDesideDl;

    @Inject
    private LookupField<String> lookupField;

    private void generate() {
        List<String> list = new ArrayList<>();
        list.add("Approve");
        list.add("Reject");
        lookupField.setOptionsList(list);
    }

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        generate();

        headDesideDl.load();
        procAttachmentsDl.setParameter("entityId",headDesideDc.getItem().getId());
        procAttachmentsDl.load();
        procActionsFragment.initializer()
                .standard()
                .init(PROCESS_CODE, getEditedEntity());

        FileDownloadHelper.initGeneratedColumn(attachmentsTable, "file");
    }




}