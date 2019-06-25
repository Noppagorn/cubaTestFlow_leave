package com.company.test6flow.web.screens.sender;

import com.haulmont.cuba.gui.screen.*;
import com.company.test6flow.entity.Sender;

@UiController("test6flow_Sender.browse")
@UiDescriptor("sender-browse.xml")
@LookupComponent("sendersTable")
@LoadDataBeforeShow
public class SenderBrowse extends StandardLookup<Sender> {
}