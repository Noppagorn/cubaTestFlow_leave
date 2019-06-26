package com.company.test6flow.web.screens.sender;

import com.haulmont.cuba.gui.screen.*;
import com.company.test6flow.entity.Sender;

@UiController("test6flow_Sender.edit")
@UiDescriptor("sender-edit.xml")
@EditedEntityContainer("senderDc")
@LoadDataBeforeShow
public class SenderEdit extends StandardEditor<Sender> {
}